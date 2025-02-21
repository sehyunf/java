package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

class ClientThread extends Thread{
   private BufferedReader input;
   
   public ClientThread(BufferedReader input) {
      this.input = input;
   }
   
   @Override
   public void run() {
      String line;
      try {
         
         while((line = input.readLine()) != null) {
            System.out.println(line);
         }
         
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         try {
            if(input != null) {
               input.close();
            }
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      
   }
}

public class Client {
   public static void main(String[] args) throws IOException{
      String name = "김동건";
      String ip = "";
      
//      try-with-resources
      try (
            Socket socket = new Socket(ip, 8000);
            PrintWriter output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader keyInput = new BufferedReader(new InputStreamReader(System.in));
         ){
         System.out.println("서버와 연결이 되었습니다.");
         
//         서버로부터 메세지를 처리하는 스레드
         ClientThread clientThread = new ClientThread(input);
         clientThread.start();
         
         String line;
         while((line = keyInput.readLine()) != null) {
            output.println(line);
         }
         
      } catch (UnknownHostException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } 
   }
}




















