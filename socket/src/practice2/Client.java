package practice2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		String serverIP = "localhost";
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket(serverIP, 7675);
			System.out.println("서버에 연결되었습니다");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				System.out.println("서버에 보낼 메세지 > ");
				String outMessage = sc.nextLine();
				out.write(outMessage + "\n");
				out.flush();
				
				String inMessage = in.readLine();
				System.out.println("서버 > " + inMessage);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(socket != null) {
				socket.close();
			}
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		
	}
}
