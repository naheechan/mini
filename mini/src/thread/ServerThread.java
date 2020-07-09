package thread;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ServerThread implements Runnable {

	private Socket socket;
	private JPanel orderListPanel;
	private int[] laHeight;
	

	public ServerThread(Socket socket, JPanel orderListPanel, int[] laHeight) {
		super();
		this.socket = socket;
		this.orderListPanel = orderListPanel;
		this.laHeight = laHeight;
	}

	@Override
	public void run() {
		try {
			multiRunner();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void multiRunner() throws IOException {

		System.out.println("서버에 클라이언트("+socket.getLocalAddress().getHostAddress()+") 접속");

		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter pw = new PrintWriter(socket.getOutputStream());

		while(true) {
			String receiveMessage = br.readLine();
			if(!receiveMessage.equals("close")) {

				//주문 들어온거 화면에 표시하는 부분
				StringTokenizer st = new StringTokenizer(receiveMessage,"&");
				while(st.hasMoreTokens()) {
					JLabel la = new JLabel(st.nextToken());
					la.setBounds(5, 5+laHeight[0], 500, 50);
					laHeight[0]+=20;
					orderListPanel.add(la);
				}
				JButton deliveryBtn = new JButton("배달");
				deliveryBtn.setBounds(550, laHeight[0]-5, 100, 25);
				orderListPanel.add(deliveryBtn);
				JLabel justLine = new JLabel("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
				justLine.setBounds(5, laHeight[0]+=15, 800, 20);
				orderListPanel.add(justLine);
				deliveryBtn.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						deliveryBtn.setText("배달 완료");
						deliveryBtn.setEnabled(false);

						pw.println("delivery");
						pw.flush();
					}
				});




				orderListPanel.repaint();
				orderListPanel.validate();

				//주문 들어온거 화면에 표시하는 부분

				System.out.println(socket.getInetAddress().getHostAddress()+"님의 메세지 : "+receiveMessage);
				pw.println("서버에 정상적으로 메세지전달");
				pw.flush();
			}else {
				System.out.println(socket.getInetAddress().getHostAddress()+"님 연결해제");
				break;
			}



		}
		br.close();
		pw.close();
		socket.close();


	}




}
