package testAdmin;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import thread.Server;

public class AdminPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5879371452127571807L;
	
	public AdminPanel(JFrame f) {
		setLayout(null);
		
		
		JLabel orderLa = new JLabel("커피 주문 들어온 거(관리자) ");
		orderLa.setBounds(30, 200, 200, 50);
		
		JPanel orderListPanel = new JPanel();
		orderListPanel.setBounds(30, 240, 700, 200);
		orderListPanel.setLayout(null);
		orderListPanel.setBackground(Color.white);
		
				
		Thread server = new Thread(new Server(orderListPanel));
		server.start();
		
		add(orderLa);
		add(orderListPanel);
		
		
		setVisible(true);
	}

}
