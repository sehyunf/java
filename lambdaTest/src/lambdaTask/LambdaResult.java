package lambdaTask;

public class LambdaResult {
	public static void main(String[] args) {
//		람다식 수현, 성과 이름을 전달하고 전체 이름을 콘솔에 출력
		PrintName printName = (firstName, lastName) -> System.out.println(firstName+lastName);
		printName.plusName("박", "세현");
		
	}
}
