package view.frame;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.vo.OrderCoffeeVO;
import testAdmin.AdminPanel;
import view.panel.menu.MenuPanel;

public class MainFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2674329014633209810L;
	
	private ArrayList<OrderCoffeeVO> orderList = new ArrayList<>();
	private JFrame f;

	public MainFrame() {
		this.f = this;
		setBounds(100,100,1050,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("�̴�������Ʈ");
		
//		JPanel menuPanel = new MenuPanel(this,orderList);
//		add(menuPanel);
		
		
		/////////////////////////////////////////////////////////////////////
		//�׽�Ʈ�� �α���â
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(Color.black);
		
		JButton adminBtn = new JButton("������ �α���");
		JButton clientBtn = new JButton("ȸ�� �α���");
		loginPanel.add(adminBtn);
		loginPanel.add(clientBtn);
		
		adminBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				remove(loginPanel);
				add(new AdminPanel(f));
				validate();
			}
		});
		
		clientBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				remove(loginPanel);
				add(new MenuPanel(f,orderList));
				validate();
			}
		});
		add(loginPanel);
		//�׽�Ʈ�� �α���â �������
		/////////////////////////////////////////////////////////////////////
		
		
		setVisible(true);
	}

}
