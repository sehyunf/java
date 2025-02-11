package inheritanceTask;

//상속 및 분리 실습
// Person 클래스
// 이름, 나이, 주소, 핸드폰 번호
// work 
// sleep 
// eat
class Person {
	String name;
	int age;
	String address;
	String phoneNumber;
	
	public Person() {;}

	public Person(String name, int age, String address, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	void work() {
		System.out.println(name + "은(는) 일을 한다.");
	}
	
	void sleep() {
		System.out.println("잠을 잔다.");
	}
	
	void eat() {
		System.out.println("세 끼를 먹는다.");
	}
}

// Student 클래스
// 인스타 아이디
// work 아르바이트를 한다
// sleep 수업시간에 잠을 잔다
// eat 아침을 거른다
class Student extends Person {
	String instagramId;
	public Student() {;}
	public Student(String name, int age, String address, String phoneNumber, String instagramId) {
		super(name, age, address, phoneNumber);
		this.instagramId = instagramId;
	}
	
	@Override
	void work() {
		System.out.println("아르바이트를 한다");
	}
	
	@Override
	void sleep() {
		System.out.println("수업시간에 잠을 잔다");
	}
	
	@Override
	void eat() {
		System.out.println("아침을 거른다");
	}
}
 
//Employee 클래스
//비상금
//work 하루 종일 일을 한다
//sleep 잠을 설친다
//eat 야식을 먹는다
class Employee extends Person{
	int emergencyMoney;

	public Employee() {;}
	public Employee(String name, int age, String address, String phoneNumber, int emergencyMoney) {
		super(name, age, address, phoneNumber);
		this.emergencyMoney = emergencyMoney;
	}
	
	@Override
	void work() {
		System.out.println("하루 종일 일을 한다");
	}
	
	@Override
	void sleep() {
		System.out.println("잠을 설친다");
	}
	
	@Override
	void eat() {
		System.out.println("야식을 먹는다");
	}
	
}

public class InheritanceTask2 {
//	메인 메서드 생성 후 객체화
//	각 메서드 출력하기
	public static void main(String[] args) {
		Person person = new Person("이순신", 10, "제주", "010-0000-1111");
		Student student = new Student("홍길동", 20, "서울", "010-1234-5678", "strong_hong");
		Employee employee = new Employee("장보고", 34, "부산", "010-8765-4321", 100000);
		Person[] arr1 = {person, student, employee};
		
		for(Person i: arr1) {
			i.work();
			i.sleep();
			i.eat();
			System.out.println();
		}
	}
}
