package thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Server implements Runnable {

	private JPanel orderLiveListPanel;
	private JPanel liveListScrollpanel;
	private JScrollPane scroll;
	
	public Server(JPanel orderLiveListPanel, JPanel liveListScrollpanel, JScrollPane scroll) {
		this.orderLiveListPanel = orderLiveListPanel;
		this.liveListScrollpanel = liveListScrollpanel;
		this.scroll = scroll;
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
				ServerThread st = new ServerThread(socket, orderLiveListPanel, laHeight, liveListScrollpanel, scroll);
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

