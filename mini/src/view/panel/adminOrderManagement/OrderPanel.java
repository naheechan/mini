package view.panel.adminOrderManagement;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import thread.Server;

//�����ڸ޴��� "�ֹ����� ���� �ǳ�"��
public class OrderPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2547737687806523415L;

	public OrderPanel(JFrame f) {
		setLayout(null);
		
		//�ΰ�
		JLabel logo = new JLabel(new ImageIcon("images/mc.png"));
		logo.setBounds(10, 10, 100, 100);
		add(logo);
//		���������� ���ư�
//		logo.addMouseListener(new PageMoveListener(f, pre, next));
		
		JLabel orderLa = new JLabel("* ���� Ŀ�� �ֹ� ���� ��");
		orderLa.setBounds(200, 0, 200, 50);
		OrderLiveListPanel orderLiveListPanel = new OrderLiveListPanel();
		JPanel liveListScrollpanel = new JPanel();
		liveListScrollpanel.setBackground(Color.white);
		liveListScrollpanel.setLayout(null);
		//��ũ�ѿ� liveListScrollpanel�� �־��ִ� �κ�
		JScrollPane scroll = new JScrollPane(liveListScrollpanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		Dimension size = new Dimension();
		size.setSize(1000, 1000);
		liveListScrollpanel.setPreferredSize(size);
		scroll.setViewportView(liveListScrollpanel); 
		scroll.getVerticalScrollBar().setUnitIncrement(20);
		scroll.setBounds(0, 0, 700, 200);
		
		Thread server = new Thread(new Server(orderLiveListPanel, liveListScrollpanel, scroll));
		server.start();
		
		JLabel orderHistoryLa = new JLabel("* ��ü �ֹ�����");
		orderHistoryLa.setBounds(10, 220, 100, 50);
		OrderListHistoryPanel orderListHistoryPanel = new OrderListHistoryPanel();
		
		
		add(orderLa);
		add(orderLiveListPanel);
		add(orderHistoryLa);
		add(orderListHistoryPanel);
		
		setVisible(true);
	}
}
