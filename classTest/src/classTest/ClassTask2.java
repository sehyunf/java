package classTest;

public class ClassTask2 {
   
//   클래스로 리턴 할 때
//   각 필드로 직접 접근하여 원하는 위치에 사용할 때
   
//   배열로 리턴 할 때
//   모든 데이터를 순서대로 사용할 때
   
   Result getMaxAndMin(int[] arData) {
      Result result = new Result(arData[0], arData[0]);
      
      for(int i = 0; i < arData.length; i++) {
         if(result.min > arData[i]) { result.min = arData[i];};
         if(result.max < arData[i]) { result.max = arData[i];};
      }
      return result;
   }
   
   
   public static void main(String[] args) {
      ClassTask2 ct2 = new ClassTask2();
      int[] arData = {5, 6, 10, 12, 15};
      
      Result result = ct2.getMaxAndMin(arData);
      System.out.println(result.min);
      System.out.println(result.max);
   }
}

