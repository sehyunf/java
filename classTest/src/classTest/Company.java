package classTest;

public class Company {
	
//	회사 클래스 필드 구성하기
//	이름, 나이, 수입
	String name;
	int age, won;
	
//	회사의 총 수입
	static int total = 0;
	
	public Company() {;}
	
//	생성자로 필드 초기화
	public Company(String name, int age, int won) {
		this.name = name;
		this.age = age;
		this.won = won;
		total += won;
	}

//	메서드로 필드 초기화
//	void employee(String name, int age, int won) {
//		this.name = name;
//		this.age = age;
//		this.won = won;
//		total += won;
//	}
//	회사원 총 4명
//	1번 +10000원
//	2번 +1000원
//	3번 +2000원
//	4번 -20000원
//	각 회사의 총 수입을 출력하기
	public static void main(String[] args) {
		
//		메서드 사용시 생성자 매개변수 없을 때
//		Company employee1 = new Company();
//		Company employee2 = new Company();
//		Company employee3 = new Company();
//		Company employee4 = new Company();
		
//		employee1.employee("이순신", 10, 10000);
//		employee2.employee("장보고", 11, 1000);
//		employee3.employee("을지문덕", 12, 2000);
//		employee4.employee("박세현", 13, -20000);
	
		Company employee1 = new Company("이순신", 10, 10_000);
		Company employee2 = new Company("장보고", 11, 1_000);
		Company employee3 = new Company("홍길동", 12, 2_000);
		Company employee4 = new Company("박세현", 13, -20_000);
//		
		System.out.println("총수입 : "+total);
	}
	
}
