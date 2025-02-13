package lambdaExpert;

import java.util.Scanner;

public class MyMath {
	public static Calc caculater(String oper) {
	    
	       if(oper.equals("+")) {
	           return(a, b) -> a + b; // 덧셈
	        }else if(oper.equals("-")) {
	            return(a, b) -> a - b; // 뺄셈
	        }else if(oper.equals("*")) {
	            return(a, b) -> a * b; // 곱셈
	        }else if(oper.equals("/")) {
	            return(a, b) -> (b != 0 ? a / b : null); // 나눗셈 0으로 나누는 거
	        }else{
	            return null; // 잘못된 연산자
	        }
	    }
   public static void main(String[] args) {
	   	   
//      사용자가 수식을 입력
//      전체 수식에서 연산자만 분리하는 메서드를 구현
//      알맞게 연산 처리
//      결과값을 출력
//      문자열을 특수기호를 기준으로 나누는 메서드
        
//      기본 준비)
//      1. 유저가 입력한 문자열을 받는다. ex) 100+123/122-123
      
      
	   	Scanner sc = new Scanner(System.in);
	   	String[] operArray = null, inputDataArray = null;
	   	String result = null, 
			   message = "계산하고싶은 식을 띄어쓰기 없이 써 주십시오\n※주의사항: 위 프로그램은 소수를 계산하지 못합니다※\nex)1+2*3-4/5", 
			   inputData = null;
//      1. 유저가 입력한 문자열을 받는다. ex) 100+123/122-123
	   	System.out.println(message);
//      메세지 출력 후 유저의 입력을 받아 inputData에 넣는다
	   	inputData = sc.nextLine();
      
//      입력 받은 문자열을 사칙연산 기호를 기준으로 나눠 문자열 배열로 만든다.
	   	inputDataArray = inputData.split("\\+|\\-|\\*|\\/");
       
//      OperCheck의 선언부
//      String타입 Data(유저가 입력한 inputData)를받아 사칙연산 기호만 순서대로 배열로 반환하는 메서드
	   	OperCheck getOper = (Data) -> {
		   
		   	String oper = "";
		   	char c = ' ';
		   	for(int i = 0; i < Data.length(); i++) {
		   		c = Data.charAt(i);
		   		if(c == '+' || c == '-' || c == '*' || c == '/') {
		   			oper += c;
		   		}
		   	}
//                배열로 만들어서 반환
		   	return oper.split("");
       	};
//      OperCheck의 사용 operArray에 배열 리턴값을 담아둔다.
       	operArray = getOper.getOpers(inputData);
      
//      operArray 배열 출력 테스트
//      for(String i: operArray) {
//         System.out.println(i);
//      }
      
//      문제 해결 알고리즘) 
      
//      문제!) *, /  를 먼저 계산해야 한다!
//      연산자만 있는 operArray의 길이를 기준으로 반복을 돈다
//      반복을 돌다 요소 *또는 /를 만나면 연산을 실행한다
//      	*일 경우 multy객체의 매서드 calc를 /일 경우 div객체의 매서드 calc()를 실행한다.
//      연산기호의 인덱스 i는 구조적으로 숫자 배열의 i번째 인덱스의 요소와 i+1번째 요소를 계산한다.
//      연산을 성공한 뒤 inputDataArray의 i번째 인덱스에 계산한 값을 넣고 i+1번째 인덱스에는 빈 문자열값을 넣는다
//      문제발생) 곱하기와 나누기의 연산자가 연속하여 있을 때, 연산을 하기위해 들어가는 값이 빈 문자열로 들어간다
//      해결방법) 만약 계산을 하기 위한 값이 둘중 하나가 빈 문자열일 경우
//      	두 값중 먼저 들어오는 값은 유효한 값을 찾을 때 까지 인덱스 번호에 -1을 하며 값을 찾고,
//      	두 값중 나중에 들어오는 값은 유효한 값을 찾을 때 까지 인덱스 번호에 +1을 하며 값을 찾는다
//      곱하기와 나누기를 먼저 반복을 하고 그 후 값에 더하기와 빼기를 하며 반복을 한다.
//      두 반복문이 끝나면 배열에는 계산한 값(result)과 빈 문자열밖에 남지 않게 된다.
      
//      연산기호 배열의 길이를 기준으로 반복문을 돌린다
//      곱하기와 나누기 먼저
//      그다음 더하기와 빼기
//      총 연산기호 배열의길이의 두배의 반복을 돈다.
      
//      연산 기호가 곱하기 혹은 나누기일때 먼저 계산하기 위한 for문
       	for(int i = 0; i < operArray.length; i++) {
//         연산기호가 곱하기 또는 나누기일때 를 조건으로 인덱스 i값을 구함
       		if(operArray[i].equals("*") || operArray[i].equals("/")) {
//            문제를 해결하기 위한 String값의 초기화, num1은 계산할때 앞에오는 값, num2는 계산할때 뒤에오는 값
       			String num1 = null;
       			String num2 = null;
//            	num1의 초기 인덱스 값
       			int num1Index = i;
//            	num2의 초기 인덱스 값
       			int num2Index = i+1;
            
//       		num1이 유효한 값인지를 알기 위한 반복문
       			do {
//              일단 num1에 inputDataArray의 i번째 값을 넣는다 이때 값은 유효한값이거나 빈 문자열값일것이다.
       				num1 = inputDataArray[num1Index];
//              빈 문자열값이 들어갈 때를 대비해 인덱스값을 빼놓는다
       				num1Index--;
       			} while(num1.equals(""));   // num1에 빈 문자열이 아닌 유효한 값이 들어와 있으면 반복을 중단한다
       			do {
//              num2에는 inputDataArray의 i+1번째 값을 넣는다 이후는 num1과 동일하다
               num2 = inputDataArray[num2Index];
//               num2는 배열의 오른쪽으로 값을 찾으러 가기 위해 인덱스를 증가시킨다
               num1Index++;
       			} while(num2.equals(""));   // num2에 빈 문자열이 아닌 유효한 값이 들어와 있으면 반복을 중단한다

       			Calc operation = caculater(operArray[i]);
       			inputDataArray[num1Index] = String.valueOf(operation.calc(Integer.parseInt(num1),Integer.parseInt(num2))) ;
       			inputDataArray[num2Index] = "";
       		}
       	}
      
//      로직은 동일함
       	for(int i = 0; i < operArray.length; i++) {
         
       		if(operArray[i].equals("+") || operArray[i].equals("-"))  {
       			String num1 = null;
       			String num2 = null;
       			int num1Index = i;
       			int num2Index = i+1;
            
       			do {
       				num1 = inputDataArray[num1Index];
       				num1Index--;
       			} while(num1.equals(""));
       			do {
       				num2 = inputDataArray[num2Index];
       				num1Index++;
       			} while(num2.equals(""));
           
       			Calc operation = caculater(operArray[i]);
       			inputDataArray[num1Index] = String.valueOf(operation.calc(Integer.parseInt(num1),Integer.parseInt(num2))) ;
       			inputDataArray[num2Index] = "";
               
            
       		}
       	}
//      배열에 남은 값 = "" 아니면 유효한 String값
//      따라서 배열에 있는 유효한 값을 result에 넣는다!
       	for(String i : inputDataArray) {
       		if (!i.equals("")) {
       			result = i;
       		}
       	}
//      출력
       	System.out.println("답 : " + result);
   	}
}

