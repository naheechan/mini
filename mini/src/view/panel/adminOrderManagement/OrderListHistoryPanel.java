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

		//전체 주문내역 테이블
		String[] headers = {"커피 이름", "가격", "갯수", "휘핑크림", "드리즐", "시럽", "샷", "핫/아이스", "주문시간"};
		String[][] contents = new String[100][9];
		for(int i=0; i<100; i++) {
			for(int j=0; j<9; j++) {
				contents[i][j] = "2";
			}
		}
		JTable table = new JTable(contents, headers);
		JScrollPane scroll=  new JScrollPane(table);
		scroll.setBounds(0,0,1010,360);

		
		//가격의 총합 구하는 부분(table에서 가져옴)
		int amount = 0;
		for(int i=0; i<contents.length; i++) {
			amount += Integer.parseInt((String)table.getValueAt(i, 1));
		}
		System.out.println(amount);

		//총 수입 테이블
		String[] amountHeaders = {"hi", "hi"};
		String[][] amountContents = {{"총 수입(원)", amount+"원"}};
		JTable amountTable = new JTable(amountContents, amountHeaders);
		amountTable.setBounds(0, 360, 1010, 50);




		add(scroll);
		add(amountTable);

	}

}
