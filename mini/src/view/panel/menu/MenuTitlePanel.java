package view.panel.menu;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuTitlePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1044304510812089156L;

	
	public MenuTitlePanel() {
		setBounds(120, 10, 900, 100);
		
		JLabel title = new JLabel("전체 메뉴");
		
		add(title);
		
		setVisible(true);
	}
	
}
