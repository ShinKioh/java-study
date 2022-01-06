package gui;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public Toolbar(MainPanel mainPanel) {
		final JButton redButton = new JButton("RED");
		final JButton blueButton = new JButton("BLUE");
		// 버튼에 이벤트를 연결('클릭' 이벤트)
		redButton.addActionListener(e->mainPanel.setBackground(Color.RED));
		blueButton.addActionListener(e->mainPanel.setBackground(Color.BLUE));
		
		

		// 툴바에 버튼을 붙임
		add(redButton);
		add(blueButton);
	}
}
