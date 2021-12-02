package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

class ColorButtonListener implements ActionListener {

	private MainPanel mainPanel;
	private Color c;
	
	public ColorButtonListener(MainPanel mainPanel, Color c) {
		this.mainPanel = mainPanel;
		this.c = c;
	}

	public void actionPerformed(ActionEvent e) {
		// System.out.println("빨간색 버튼 클릭!");
		mainPanel.setBackground(c);
	}
}

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public Toolbar(MainPanel mainPanel) {
		final JButton redButton = new JButton("RED");
		final JButton blueButton = new JButton("BLUE");
		// 버튼에 이벤트를 연결('클릭' 이벤트)
		redButton.addActionListener(new ColorButtonListener(mainPanel, Color.RED));
		blueButton.addActionListener(new ColorButtonListener(mainPanel, Color.BLUE));

		// 툴바에 버튼을 붙임
		add(redButton);
		add(blueButton);
	}
}
