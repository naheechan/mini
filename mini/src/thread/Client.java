package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Client implements Runnable {

	private JFrame f;
	private JPanel p;
	private JPanel testP;
	private String orderListStr;
	
	public Client(JFrame f, JPanel p, JPanel testP, String orderListStr) {
		super();
		this.f = f;
		this.p = p;
		this.testP = testP;
		this.orderListStr = orderListStr;
	}

	@Override
	public void run() {
		try {
			runner();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void runner() throws IOException {
		int serverPort = 8888;
		String serverIp = InetAddress.getLocalHost().getHostAddress();

		Socket socket = new Socket(serverIp, serverPort);
		BufferedReader br = null;
		PrintWriter pw =  null;

		if(socket!=null) {
			System.out.println("������ ���Ӽ���(����Ŭ���̾�Ʈ)");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			
			pw.println(orderListStr);
			pw.flush();

			while(true) {
				String receiveMessage = br.readLine();
				System.out.println("���� : "+receiveMessage);
				if(receiveMessage.equals("delivery")) {
					pw.println("close");
					pw.flush();
					System.out.println("Ŀ�� ��޹���. ���� ���� ����");
					break;
				}
			}

		}else {
			System.out.println("�������� ����");
		}

		br.close();
		pw.close();
		socket.close();

		f.remove(testP);
		f.add(p);
		f.repaint();
		f.validate();		

	}

}










