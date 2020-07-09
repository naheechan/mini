package view.panel.menu;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.vo.OrderCoffeeVO;

public class MenuPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 417860886964117888L;

	private JFrame f;
	private ArrayList<OrderCoffeeVO> orderList;
	
	public MenuPanel(JFrame f, ArrayList<OrderCoffeeVO> orderList) {
		this.f = f;
		this.orderList = orderList;
		setBackground(Color.black);
		setLayout(null);
		
		//로고
		JLabel logo = new JLabel(new ImageIcon("images/mc.png"));
		logo.setBounds(10, 10, 100, 100);
		add(logo);
//		메인페이지 돌아감
//		logo.addMouseListener(new PageMoveListener(f, pre, next));
		
		add(new MenuTitlePanel());
		add(new MenuContentPanel(f,this,orderList));
		
		
		setVisible(true);
	}
	
	
}











