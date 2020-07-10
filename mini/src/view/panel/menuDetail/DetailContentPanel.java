package view.panel.menuDetail;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.vo.AmericanoVO;
import model.vo.CappuccinoVO;
import model.vo.CoffeeVO;
import model.vo.DolceLatteVO;
import model.vo.HazelnutLatteVO;
import model.vo.OrderCoffeeVO;
import model.vo.VanillaLatteVO;
import view.panel.menu.MenuPanel;

public class DetailContentPanel extends JPanel implements ActionListener, ChangeListener {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1229748075323723332L;
	
	private JFrame f;
	private JPanel p;
	private String fileName = "";
	
	private String name = "";
	private int price = 0;
	private char temperature = 'I';
	private boolean whipping = false;
	private boolean drizzle = false;
	private boolean syrup = false;
	private boolean shot = false;
	private int count = 1;
	private JRadioButton tempRa1, tempRa2, whipRa1, whipRa2, drizzleRa1, drizzleRa2, syrupRa1, syrupRa2, shotRa1,shotRa2;
	private SpinnerModel spinner;
	private JSpinner countSpinner;
	
	public DetailContentPanel(JFrame f, JPanel p, String fileName, ArrayList<OrderCoffeeVO> orderList) throws IOException {
		this.f = f;
		this.p = p;
		this.fileName = fileName;
		setBounds(10,160,1010,450);
		setLayout(null);

		String picPath = "";
		String detailInfo = "";
		String detailNutri = "";
		String detailAll = "";
	
		
		CoffeeVO cf = new CoffeeVO();
		switch(fileName) {
		case "AmericanoVO.txt": cf = new AmericanoVO(); picPath="images/ame.jpg"; break;
		case "DolceLatteVO.txt": cf = new DolceLatteVO(); picPath="images/dolce.jpg"; break;
		case "VanillaLatteVO.txt": cf = new VanillaLatteVO(); picPath="images/vanilla.jpg"; break;
		case "HazelnutLatteVO.txt": cf = new HazelnutLatteVO(); picPath="images/hazel.png"; break;
		case "CappuccinoVO.txt": cf = new CappuccinoVO(); picPath="images/cappu.jpg"; break;
		default : System.out.println("메뉴 선택지에서 오류남");
		}
		
		
		if(fileName.length()<1) {
			System.out.println("메뉴 선택지에서 오류남");
		}else {
			File file = new File(fileName);
			if(!file.exists()) {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
				oos.writeObject(cf);
			}
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
			try {
				CoffeeVO readC = (CoffeeVO)ois.readObject();
				StringTokenizer st = new StringTokenizer(readC.toString(),",");
				while(st.hasMoreTokens()) {
					name = st.nextToken();
					price = Integer.parseInt(st.nextToken());
					detailInfo = st.nextToken();
					detailNutri = st.nextToken();
					detailAll = st.nextToken();
				}
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			
		}
		
		
		JPanel detailPanel = new JPanel();
		detailPanel.setLayout(null);
		 
		JLabel pic = new JLabel(new ImageIcon(picPath));
		pic.setBounds(450, 20, 150, 150);
		detailPanel.add(pic);
		
		tempRa1 = new JRadioButton("HOT");
		tempRa2 = new JRadioButton("ICED");
		ButtonGroup tempG = new ButtonGroup();
		tempG.add(tempRa1);
		tempG.add(tempRa2);
		tempRa2.setSelected(true);
		tempRa1.setBounds(470, 180, 50, 50);
		tempRa2.setBounds(530, 180, 100, 50);
		detailPanel.add(tempRa1);
		detailPanel.add(tempRa2);
		tempRa1.addActionListener(this);
		tempRa2.addActionListener(this);
		
		JButton backBtn = new JButton("← 메뉴로 돌아가기");
		backBtn.setBounds(800, 50, 150, 50);
		detailPanel.add(backBtn);
		
		JLabel nameLa = new JLabel("메뉴이름 :  ");
		nameLa.setBounds(340, 190, 150, 150);
		nameLa.setText("메뉴이름 :  "+name);
		detailPanel.add(nameLa);
		
		JLabel detailInfoLa = new JLabel("메뉴 상세 정보 :  ");
		if(detailInfo.length() > 35) {
			StringBuilder sb = new StringBuilder(detailInfo);
			sb.insert(38, "<br/>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;");
			detailInfo = sb.toString();
		}
		detailInfoLa.setBounds(340, 230, 700, 150);
		detailInfoLa.setText("<html>메뉴 상세 정보 :  "+detailInfo+"</html>");
		detailPanel.add(detailInfoLa);
		
		JLabel detailNutriLa = new JLabel("영양 정보 :  ");
		detailNutriLa.setBounds(340, 320, 200, 120);
		detailNutriLa.setText("<html>영양 정보 :  "+detailNutri+"</html>");
		detailPanel.add(detailNutriLa);
		
		JLabel detailAllLa = new JLabel("알레르기 정보 : ");
		detailAllLa.setBounds(340, 410, 300, 100);
		detailAllLa.setText("<html>"+detailAll+"</html>");
		detailPanel.add(detailAllLa);
		
		JLabel addLa = new JLabel("= = = = = = = = = = = = = = = ↓ [ 추가 옵션 ] ↓ = = = = = = = = = = = = = = =");
		addLa.setBounds(340, 460, 400, 50);
		detailPanel.add(addLa);
		
		JLabel whippingLa = new JLabel("휘핑크림 추가(+600원)");
		whippingLa.setBounds(340, 490, 150, 100);
		detailPanel.add(whippingLa);
		whipRa1 = new JRadioButton("추가");
		whipRa2 = new JRadioButton("선택 안함");
		ButtonGroup whipG = new ButtonGroup();
		whipG.add(whipRa1);
		whipG.add(whipRa2);
		whipRa2.setSelected(true);
		whipRa1.setBounds(340, 550, 80, 30);
		whipRa2.setBounds(420, 550, 130, 30);
		detailPanel.add(whipRa1);
		detailPanel.add(whipRa2);
		whipRa1.addActionListener(this);
		whipRa2.addActionListener(this);
		
		
		
		JLabel drizzleLa = new JLabel("드리즐 추가(+600원)");
		drizzleLa.setBounds(340, 580, 150, 100);
		detailPanel.add(drizzleLa);
		drizzleRa1 = new JRadioButton("추가");
		drizzleRa2 = new JRadioButton("선택 안함");
		ButtonGroup drizzleG = new ButtonGroup();
		drizzleG.add(drizzleRa1);
		drizzleG.add(drizzleRa2);
		drizzleRa2.setSelected(true);
		drizzleRa1.setBounds(340, 640, 80, 30);
		drizzleRa2.setBounds(420, 640, 130, 30);
		detailPanel.add(drizzleRa1);
		detailPanel.add(drizzleRa2);
		drizzleRa1.addActionListener(this);
		drizzleRa2.addActionListener(this);
		
		JLabel syrupLa = new JLabel("시럽 추가(+600원)");
		syrupLa.setBounds(340, 670, 150, 100);
		detailPanel.add(syrupLa);
		syrupRa1 = new JRadioButton("추가");
		syrupRa2 = new JRadioButton("선택 안함");
		ButtonGroup syrupG = new ButtonGroup();
		syrupG.add(syrupRa1);
		syrupG.add(syrupRa2);
		syrupRa2.setSelected(true);
		syrupRa1.setBounds(340, 730, 80, 30);
		syrupRa2.setBounds(420, 730, 130, 30);
		detailPanel.add(syrupRa1);
		detailPanel.add(syrupRa2);
		syrupRa1.addActionListener(this);
		syrupRa2.addActionListener(this);
		
		JLabel shotLa = new JLabel("샷 추가(+600원)");
		shotLa.setBounds(340, 760, 150, 100);
		detailPanel.add(shotLa);
		shotRa1 = new JRadioButton("추가");
		shotRa2 = new JRadioButton("선택 안함");
		ButtonGroup shotG = new ButtonGroup();
		shotG.add(shotRa1);
		shotG.add(shotRa2);
		shotRa2.setSelected(true);
		shotRa1.setBounds(340, 820, 80, 30);
		shotRa2.setBounds(420, 820, 130, 30);
		detailPanel.add(shotRa1);
		detailPanel.add(shotRa2);
		shotRa1.addActionListener(this);
		shotRa2.addActionListener(this);
		
		JLabel countLa = new JLabel("커피 수량");
		countLa.setBounds(340, 870, 100, 50);
		detailPanel.add(countLa);
		spinner = new SpinnerNumberModel(1, 1, 10, 1);
		countSpinner = new JSpinner(spinner);
		countSpinner.setBounds(410, 880, 50, 30);
		detailPanel.add(countSpinner);
		spinner.addChangeListener(this);
		
		
		JButton basketBtn = new JButton("장바구니");
		basketBtn.setBounds(340, 940, 100, 50);
		detailPanel.add(basketBtn);
		basketBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				price += whipping==true ? 600 : 0;
				price += drizzle==true ? 600 : 0;
				price += syrup==true ? 600 : 0;
				price += shot==true ? 600 : 0;
				price = count*price;
				orderList.add(new OrderCoffeeVO(name, price, count, whipping, drizzle, syrup, shot, temperature));   // ****여기가 orderList에 add한 부분이예요****
				f.remove(p);
				f.add(new MenuPanel(f,orderList));
				f.validate();
			}
		});
		
		JButton orderBtn = new JButton("바로 구매");
		orderBtn.setBounds(450, 940, 100, 50);
		detailPanel.add(orderBtn);
		orderBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//결제페이지에 orderList넘겨주면서 화면전환 (결제끝나면 orderList비워줘야함)
				
			}
		});
		
		
		
		//이벤트
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				f.remove(p);
				f.add(new MenuPanel(f,orderList));	
				f.validate();
			}
		});
		
		
		//스크롤 코드
		JScrollPane scroll = new JScrollPane(detailPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		Dimension size = new Dimension();
		size.setSize(1000, 1000);
		detailPanel.setPreferredSize(size);
		scroll.setViewportView(detailPanel); 
		scroll.getVerticalScrollBar().setUnitIncrement(20);
		scroll.setBounds(0, 0, 1010, 450);	
		add(scroll);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tempRa1) {
			temperature = 'H'; 
			System.out.println(temperature);
		}
		if(e.getSource()==tempRa2) {
			temperature = 'I'; 
			System.out.println(temperature);
		}
		if(e.getSource()==whipRa1) {
			whipping = true;
			System.out.println(whipping);
		}
		if(e.getSource()==whipRa2) {
			whipping = false;
			System.out.println(whipping);
		}
		if(e.getSource()==drizzleRa1) {
			drizzle = true;
			System.out.println(drizzle);
		}
		if(e.getSource()==drizzleRa2) {
			drizzle = false;
			System.out.println(drizzle);
		}
		if(e.getSource()==syrupRa1) {
			syrup = true;
			System.out.println(syrup);
		}
		if(e.getSource()==syrupRa2) {
			syrup = false;
			System.out.println(syrup);
		}
		if(e.getSource()==shotRa1) {
			shot = true;
			System.out.println(shot);
		}
		if(e.getSource()==shotRa2) {
			shot = false;
			System.out.println(shot);
		}
		
		
	}


	@Override
	public void stateChanged(ChangeEvent e) {
		if(e.getSource()==spinner) {
			count = (int)spinner.getValue();
			System.out.println(count);
		}
	}
	
	

}


