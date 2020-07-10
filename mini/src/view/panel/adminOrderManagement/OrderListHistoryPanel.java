package view.panel.adminOrderManagement;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class OrderListHistoryPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7698016344417143442L;

	public OrderListHistoryPanel() {
		setBounds(10,260,1010,380);
		setLayout(null);
		setBackground(Color.yellow);

		//��ü �ֹ����� ���̺�
		String[] headers = {"Ŀ�� �̸�", "����", "����", "����ũ��", "�帮��", "�÷�", "��", "��/���̽�", "�ֹ��ð�"};
		String[][] contents = new String[100][9];
		for(int i=0; i<100; i++) {
			for(int j=0; j<9; j++) {
				contents[i][j] = "2";
			}
		}
		JTable table = new JTable(contents, headers);
		JScrollPane scroll=  new JScrollPane(table);
		scroll.setBounds(0,0,1010,360);

		
		//������ ���� ���ϴ� �κ�(table���� ������)
		int amount = 0;
		for(int i=0; i<contents.length; i++) {
			amount += Integer.parseInt((String)table.getValueAt(i, 1));
		}
		System.out.println(amount);

		//�� ���� ���̺�
		String[] amountHeaders = {"hi", "hi"};
		String[][] amountContents = {{"�� ����(��)", amount+"��"}};
		JTable amountTable = new JTable(amountContents, amountHeaders);
		amountTable.setBounds(0, 360, 1010, 50);




		add(scroll);
		add(amountTable);

	}

}
