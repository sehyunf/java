package ex03;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	private String job;
	private String hobby;
	
	public Person() {;}
	
	public Person(String name, int age, String job, String hobby) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.hobby = hobby;
	}
	
	void printName() {
		System.out.println(this.getName());
	}
	
	void work() {
		System.out.println(this.getJob()+"은 하는 일이 없습니다.");
	}

	void hobby() {
		System.out.println("취미는 잠자기 입니다.");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job + ", hobby=" + hobby + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, hobby, job, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(hobby, other.hobby) && Objects.equals(job, other.job)
				&& Objects.equals(name, other.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	
	
	
}
