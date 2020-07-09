package view.panel.menu;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.vo.OrderCoffeeVO;
import thread.Client;
import view.panel.menuDetail.DetailPanel;

public class MenuContentPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1710126998649361335L;

	private JFrame f;
	private JPanel p;
	private ArrayList<OrderCoffeeVO> orderList;


	public MenuContentPanel(JFrame f, JPanel p, ArrayList<OrderCoffeeVO> orderList) {
		this.f = f;
		this.p = p;
		this.orderList = orderList;
		setBounds(10,160,1010,450);
		setLayout(null);
		setBackground(new Color(204,166,61));
		int amount = 0;

		JButton picAme = new JButton(new ImageIcon("images/ame.jpg"));
		JButton picDolce = new JButton(new ImageIcon("images/dolce.jpg"));
		JButton picVanilla = new JButton(new ImageIcon("images/vanilla.jpg"));
		JButton picHazel = new JButton(new ImageIcon("images/hazel.png"));
		JButton picCappu = new JButton(new ImageIcon("images/cappu.jpg"));
		picAme.setBounds(30, 10, 150, 150);
		picDolce.setBounds(230,10,150,150);
		picVanilla.setBounds(430, 10, 150, 150);
		picHazel.setBounds(630,10,150,150);
		picCappu.setBounds(830, 10, 150, 150);

		JLabel title1 = new JLabel("�Ƹ޸�ī��");
		JLabel title2 = new JLabel("��ü ��");
		JLabel title3 = new JLabel("�ٴҶ� ��");
		JLabel title4 = new JLabel("������� ��");
		JLabel title5 = new JLabel("īǪġ��");
		title1.setBounds(80, 160, 150, 50);
		title2.setBounds(280, 160, 150, 50);
		title3.setBounds(480, 160, 150, 50);
		title4.setBounds(680, 160, 150, 50);
		title5.setBounds(880, 160, 150, 50);

		JLabel listTitle = new JLabel("*�ֹ����(��ٱ���)");
		listTitle.setBounds(40, 200, 150, 50);

		JPanel orderListPanel = new JPanel();
		orderListPanel.setBounds(30, 240, 700, 200);
		orderListPanel.setLayout(null);
		orderListPanel.setBackground(Color.white);
		if(orderList!=null) {
			for(int i=0; i<orderList.size(); i++) {
				JLabel orderLa = new JLabel(orderList.get(i).toString());
				orderLa.setBounds(5, (i-1)*20+8, 800, 50);
				orderListPanel.add(orderLa);
				amount += orderList.get(i).getPrice();
			}
		}

		JLabel amountLa = new JLabel("�ֹ� �ݾ� : 0��");
		amountLa.setText("�ֹ��ݾ� : "+amount+"��");
		amountLa.setBounds(750, 200, 150, 100);


		JButton orderBtn = new JButton("�ֹ��ϱ�");
		orderBtn.setBounds(750, 330, 100, 50);
		orderBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				//������������ orderList�Ѱ��ָ鼭 ȭ����ȯ (���������� orderList��������)


				/////////////////////////////////////////////////////////
				//�׽�Ʈ��

				//orderList�÷����� String�迭�� �ٲ��ִ� �κ�
				String orderListStr = "";
				StringBuilder sb = new StringBuilder();
				for(OrderCoffeeVO oc : orderList) {
					sb.append(oc.getName()+","+oc.getPrice()+"��,"+oc.getCount()+"��,"
							+(oc.getWhipping()==true ? "����ũ��," : "")
							+(oc.getDrizzle()==true ? "�帮��," : "")
							+(oc.getSyrup()==true ? "�÷�," : "")
							+(oc.getShot()==true ? "��," : "")
							+oc.getTemperature()+"&");
				}
				if(sb.length()>0) sb.setLength(sb.length()-1);
				orderListStr = sb.toString();
				//orderList�÷����� String�迭�� �ٲ��ִ� �κ�

				
				JPanel testClientPanel = new JPanel();
				testClientPanel.setBounds(0,0,1050,700);
				testClientPanel.setBackground(Color.cyan);
				JLabel waitingLa = new JLabel("��ٸ�����...");
				testClientPanel.add(waitingLa);

				f.remove(p);
				f.add(testClientPanel);
				f.repaint();
				f.validate();

				Thread client = new Thread(new Client(f, p, testClientPanel, orderListStr));
				client.start();
				///////////////////////////////////////////////////////////
			}
		});


		JButton cancelBtn = new JButton("���");
		cancelBtn.setBounds(880, 330, 100, 50);
		cancelBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				orderList.clear(); //orderList �� �����
				//������������ ���ư�

			}
		});


		HashMap<String, JButton> map = new HashMap<>();
		map.put("AmericanoVO.txt", picAme);
		map.put("DolceLatteVO.txt", picDolce);
		map.put("VanillaLatteVO.txt", picVanilla);
		map.put("HazelnutLatteVO.txt", picHazel);
		map.put("CappuccinoVO.txt", picCappu);

		Set<String> keys = map.keySet();
		for(String key : keys) {
			map.get(key).addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					f.remove(p);
					f.add(new DetailPanel(f, key, orderList));
					f.validate();
				}
			});
		}

		//		����ȭ�� ���ư��� �̺�Ʈ
		//		cancelBtn.addMouseListener(new PageMoveListener(f, pre, next));


		add(picAme);
		add(picDolce);
		add(picVanilla);
		add(picHazel);
		add(picCappu);
		add(title1);
		add(title2);
		add(title3);
		add(title4);
		add(title5);
		add(listTitle);
		add(orderListPanel);
		add(amountLa);
		add(orderBtn);
		add(cancelBtn);

		setVisible(true);
	}

}