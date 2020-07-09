package view.panel.menuDetail;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.vo.OrderCoffeeVO;

public class DetailPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -290980218052662769L;
	
	private JFrame f;
	private ArrayList<OrderCoffeeVO> orderList;
	
	public DetailPanel(JFrame f, String fileName, ArrayList<OrderCoffeeVO> orderList) {
		this.f = f;
		this.orderList = orderList;
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		//로고
		JLabel logo = new JLabel(new ImageIcon("images/mc.png"));
		logo.setBounds(10, 10, 100, 100);
		add(logo);
//		메인페이지 돌아감
//		logo.addMouseListener(new PageMoveListener(f, pre, next));
		
		add(new DetailTitlePanel());
		try {
			add(new DetailContentPanel(f, this, fileName, orderList));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setVisible(true);
	}

}
