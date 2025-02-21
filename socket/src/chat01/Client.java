package chat01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws IOException {
//		소켓
		Socket socket = null;
		
//		출력스트림 PrintWriter
		PrintWriter writer = null;
		
		String serverIp = "noIp";
		
		try {
			
			socket = new Socket(serverIp, 1100);
			System.out.println("서버와 연결 되었습니다.");
			
			writer = new PrintWriter(socket.getOutputStream(),true);
			
			String message = "안녕 나는 클라이언트야 😺";
			writer.println(message);
			
			System.out.println("서버로 [" + message + "]라는 메세지를 보냈습니다");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(writer != null) {
				writer.close();
			}
			if(socket != null) {
				socket.close();
			}
		}
		
	}
}
