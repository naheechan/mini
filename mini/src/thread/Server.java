package thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JPanel;


public class Server implements Runnable {

	private JPanel orderListPanel;

	public Server(JPanel orderListPanel) {
		this.orderListPanel = orderListPanel;
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
		ServerSocket server = null;
		Socket socket = null;
		int port = 8888;
		int[] laHeight = {0};
		
		server = new ServerSocket(port);
		
		System.out.println("***서버 실행***");
		try {
			while(true) {
				socket = server.accept();
				ServerThread st = new ServerThread(socket, orderListPanel, laHeight);
				Thread serverThread = new Thread(st);
				serverThread.start();
			}
		}finally {
			if(server!=null) {
				server.close();
			}
			if(socket!=null) {
				socket.close();
			}
			System.out.println("***서버 종료***");
		}
	}

}

