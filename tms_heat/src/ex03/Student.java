package ex03;

import java.util.Objects;

public class Student extends Person {
	private int number;
	
	
	public Student() {;}
	public Student(String name, int age, String job, String hobby, int number) {
		super(name, age, job, hobby);
		this.number = number;
	}
	
	@Override
	void work() {
		System.out.println(this.getName() + "은 공부를 합니다.");
	}
	
	@Override
	void hobby() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
	
	void printNumber() {
		System.out.println("학생의 이름은 " + this.getName() + "이며 학번은 " + this.getNumber() + "입니다");
	}
	
	@Override
	public String toString() {
		return "Student [number=" + number + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(number);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return number == other.number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
