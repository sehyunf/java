package chat01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
//		소켓선언
//		서버소켓 선언
		ServerSocket serverSocket = null;
		
//		클라이언트 소켓 선언
		Socket socket = null;
		
//		입력 스트림을 읽기 위한 BufferedReader를 선언
		BufferedReader reader = null;
		
		try {
	//		포트번호 1100번에서 서버소켓 생성
			serverSocket = new ServerSocket(1100);
			System.out.println("서버가 시작되었습니다. 클라이언트를 대기중...");
	
	//		~~~ 클라이언트가 서버에 연결 요청이 들어올 때 까지 대기한다.
	//		이후 요청이 들어오면 ACCEPT가 받아들인다.
			
			socket = serverSocket.accept();
			System.out.println("클라이언트가 연결 되었습니다.");
			
	//		클라이언트로부터 데이터를 읽어오기 위해 BufferedReader를 생성한다.
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String message = reader.readLine();
			System.out.println("클라이언트에게 받은 메세지 : " + message);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(reader != null) {
				reader.close();
			}
			if(socket != null) {
				socket.close();
			}
			if(serverSocket != null) {
				serverSocket.close();
			}
		}
		
	}
}
