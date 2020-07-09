package view.panel.menuDetail;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DetailTitlePanel extends JPanel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1842335141706909285L;

	public DetailTitlePanel() {
		setBounds(120, 10, 900, 100);
		
		JLabel title = new JLabel("상세 메뉴");
		
		add(title);
		
		setVisible(true);
	}
	
}
