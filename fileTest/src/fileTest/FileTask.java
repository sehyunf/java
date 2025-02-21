package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileTask {
   public static void main(String[] args) throws IOException {
//      음식을 4개 출력(Writer)
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("food.txt"));
//      String[] foods = {"햄버거", "떡볶이", "김밥", "라면"};
//      
//      Arrays.asList(foods).stream().forEach(food -> {
//         try {
//            bufferedWriter.write(food + "\n");
//         } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//         }
//      });
//      
//      bufferedWriter.close();
   
//      음식을 모두 가져와서 콘솔에 출력
	   BufferedReader buffredReader = new BufferedReader(new FileReader("food.txt"));
	   String line = null;
	   String temp = "";
      
//      값을 가져와서 출력
//      while((line = buffredReader.readLine()) != null) {
//         System.out.println(line);
//      }
//      
//      buffredReader.close();
      
//      값을 수정하기
//      while((line = buffredReader.readLine()) != null) {
//         if(line.equals("김밥")) {
//            temp += "부대찌개\n";
//            continue;
//         }
//         temp += line + "\n";
//      }
//      buffredReader.close();
//
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("food.txt"));
//      bufferedWriter.write(temp);
//      bufferedWriter.close();
      
//      햄버거 삭제
      while((line = buffredReader.readLine()) != null) {
         if(line.equals("햄버거")) {
            continue;
         }
         temp += line + "\n";
      }
      
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("food.txt"));
      bufferedWriter.write(temp);
      bufferedWriter.close();
      
   }
}













