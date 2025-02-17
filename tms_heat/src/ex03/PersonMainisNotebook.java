package ex03;

public class PersonMainisNotebook {
	public static void main(String[] args) {
		Person per1 = new Student("홍길동", 15, "학생", "게임", 1);
		Person per2 = new Programmer("장보고", 20, "프로그래머", "잠자기", true);
		Student stu1 = (Student)per1;
		Programmer prog1 = (Programmer)per2;
		stu1.work();
		stu1.hobby();
		stu1.printNumber();
		System.out.println("================================");
		prog1.work();
		prog1.hobby();
		prog1.isNotebook();
		
		System.out.println(per1.hashCode());
		
	}
}
