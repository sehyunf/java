package classTest;

public class Student {
//	학생의 학번, 이름, 국어점수, 영어점수, 수학점수 입력받고
//	총점과 평균을 출력하기
	int studentNumber;
	private int kor;
	private int eng;
	private int math;
	String name;
	
	public Student() {;}
	
	public Student(int studentNumber, String name, int kor, int eng, int math) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	double getAvg() {
		return (kor + eng + math)/3.0;
	}
	
	public static void main(String[] args) {
		Student sehyun = new Student(70011098, "박세현", 70, 80, 90);
		System.out.println("총점 : " + sehyun.getTotal());
		System.out.println("평균 : " + sehyun.getAvg());
	}
	
}
