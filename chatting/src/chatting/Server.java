package chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// 서버에서 모든 클라이언트에 메세지를 전송
class ServerThread extends Thread {
   private final Socket socket;
   private final List<PrintWriter> outputList;
   private PrintWriter output;
   private BufferedReader input;
   
   public ServerThread(Socket socket, List<PrintWriter> outputList) {
      this.socket = socket;
      this.outputList = outputList;
      
      try {
         output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
         input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         
         synchronized (outputList) {
            outputList.add(output);
         }
         
      } catch (IOException e) {
         e.printStackTrace();
         closeResources();
      } 
      
   }
   
   @Override
   public void run() {
      String line;
      try {
         while((line = input.readLine()) != null) {
//            서버 콘솔에 수신한 메세지를 출력
            System.out.println(line);
            
            synchronized (outputList) {
               for(PrintWriter out: outputList) {
                  out.println(line);
               }
            }
            
         }
      } catch (IOException e) {
         System.out.println("메세지를 수신중에 오류가 발생");
         e.printStackTrace();
      } finally {
         closeResources();
      }
      
   }
   
   
   private void closeResources() {
      try {
         synchronized (outputList) {
            outputList.remove(output);
         }
         
         if(input != null) {
            input.close();
         }
         
         if(output != null) {
            output.close();
         }
         
         if(socket != null){
            socket.close();
         }
         
      } catch (IOException e) {
         System.out.println("자원을 해제중에 오류 발생");
      }
   }
}

// 서버에서 직접 메세지를 입력 받아 클라이언트에 전송하는 스레드
class ServerInputThread extends Thread {
   private final List<PrintWriter> outputList;
   
   public ServerInputThread(List<PrintWriter> outputList) {
      this.outputList = outputList;
   }
   
   @Override
   public void run() {
      try (
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))
         ){
         
         String message;
         while((message = bufferedReader.readLine()) != null) {
            System.out.println("서버 :" + message);
            synchronized (outputList) {
               for(PrintWriter out : outputList) {
                  out.println("서버 " + message);
               }
            }
         }
         
      } catch (IOException e) {
         System.out.println("서버 입력을 처리하는 중 오류 발생");
         e.printStackTrace();
      } 
      
   }
   
}

public class Server {
   public static void main(String[] args){
      ServerSocket serverSocket = null;
      List<PrintWriter> outputList = Collections.synchronizedList(new ArrayList<>());
      
      try {
         serverSocket = new ServerSocket(8000);
         System.out.println("[서버 실행 : 클라이언트 대기중...]");

         ServerInputThread serverInputThread = new ServerInputThread(outputList);
         serverInputThread.start();
         
         while(true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("[접속 : " + clientSocket + "]");
            ServerThread serverThread = new ServerThread(clientSocket, outputList);
            serverThread.start();
         }
         
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         if(serverSocket != null && !serverSocket.isClosed()) {
            try {
               serverSocket.close();
            } catch (IOException e) {
               System.out.println("서버 소켓 오류");
               e.printStackTrace();
            }
         }
      }
   }
}






















