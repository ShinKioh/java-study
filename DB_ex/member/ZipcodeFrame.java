package member;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ZipcodeFrame extends Frame implements ActionListener {

	JLabel label;
	JButton searchBtn, selectBtn;
	List list;
	TextField tf;
	JPanel p1, p2;
	MemberMgr mgr;
	DialogBox err1, err2;
	MemberAWT awt;

	public ZipcodeFrame(MemberAWT awt) {
		this.awt = awt;
		setTitle("ZipcodeFrame");
//		setBounds(300, 500, 400, 500);
		setBounds(awt.getX() + awt.getWidth(), awt.getY(), 400, 500);
		mgr = new MemberMgr();
		p1 = new JPanel();
		p1.setBackground(Color.LIGHT_GRAY);
		p1.add(label = new JLabel("동이름:", label.CENTER));
		p1.add(tf = new TextField("광평로", 15));
		p1.add(searchBtn = new JButton("검색"));
		tf.addActionListener(this);
		searchBtn.addActionListener(this);
		//////////////////////////////////////
		list = new List();
		list.addActionListener(this);
		//////////////////////////////////////
		p2 = new JPanel();
		p2.add(selectBtn = new JButton("선택"));
		selectBtn.addActionListener(this);
		p2.setBackground(Color.LIGHT_GRAY);
		///////////////////////////////////////
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		add(p1, BorderLayout.NORTH);
		add(list, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		tf.requestFocus();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트에서 소스 -> 이벤트를 발생시킨 컴포넌트
		Object obj = e.getSource();
		if (obj == searchBtn || obj == tf) {
			// System.out.println("검색");
			if (tf.getText().trim().length() == 0) {
				if (err1 == null) {
					err1 = new DialogBox(this, "알림", "검색어를 입력하세요.");
				} else {
					// 보여지는 위치 조정
					err1.setLocation(this.getX() + this.getWidth() / 2 - (err1.getWidth() / 2),
							this.getY() + this.getHeight() / 2 - (err1.getHeight() / 2));
					// 두번째부터는 기존 객체 그대로 사용
					err1.setVisible(true);
				}
			} else { // 검색어를 입력했을 때
				list.removeAll(); // 기존의 검색결과 삭제
				Vector<ZipcodeBean> vlist = mgr.zipcodeRead(tf.getText());
				if (vlist.isEmpty()) { // 결과값이 없음
					if (err2 == null) {
						err2 = new DialogBox(this, "알림", "검색 결과가 없습니다.");
					} else {
						err2.setLocation(this.getX() + this.getWidth() / 2 - (err2.getWidth() / 2),
								this.getY() + this.getHeight() / 2 - (err2.getHeight() / 2));
						err2.setVisible(true);
					}
					tf.setText(""); // tf 초기화
					tf.requestFocus(); // tf에 포커스
				} else { // 결과값이 있음
					// 배열 및 Vector 밑에는 무조건 for문
					for (int i = 0; i < vlist.size(); i++) {
						ZipcodeBean bean = vlist.get(i); // Vector에 저장된 bean을 리턴
						String str = bean.getZipcode() + " ";
						str += bean.getArea1() + " ";
						str += bean.getArea2() + " ";
						str += bean.getArea3();
						list.add(str);
					} // --for
				}
			}
		} else if (obj == list || obj == selectBtn) {
			String adds = list.getSelectedItem();
			awt.tf4.setText(adds);
			list.removeAll();
			dispose();
		}
	}
}
