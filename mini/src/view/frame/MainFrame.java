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
		setTitle("미니프로젝트");
		
//		JPanel menuPanel = new MenuPanel(this,orderList);
//		add(menuPanel);
		
		
		/////////////////////////////////////////////////////////////////////
		//테스트용 로그인창
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(Color.black);
		
		JButton adminBtn = new JButton("관리자 로그인");
		JButton clientBtn = new JButton("회원 로그인");
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
		//테스트용 로그인창 여기까지
		/////////////////////////////////////////////////////////////////////
		
		
		setVisible(true);
	}

}
