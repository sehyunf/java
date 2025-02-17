package tms;

import java.util.Objects;

public class Person {
	private int id;
	private String name;
	private int age;
	private String phone;
	private String job;
	
	public Person() {;}
	
	public Person(String name, int age, String phone, String job) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.job = job;
	}
	
	void work() {
		System.out.println("일을 합니다");
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", phone=" + phone + ", job=" + job + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, id, job, name, phone);
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
		return age == other.age && id == other.id && Objects.equals(job, other.job) && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
}
