package tms;

import java.util.Arrays;
import java.util.Objects;

public class Employee extends Person {
	private int id;
	private String[] lotto;
	private String company;
	
	public Employee() {;}
	public Employee(String name, int age, String phone, String job) {
		super(name, age, phone, job);
	}

	@Override
	void work() {
		System.out.println(super.getJob()+"은 하루종일 일을 한다");
	}
	
	void byeCompany(String checkLotto) {
		if(checkLotto.equals("당첨")) {
			System.out.println("직장을 그만둔다");
		}else {
			System.out.println("다시 일한다");
		}
	}
	void saveMoney(String checkLotto) {
		if(checkLotto.equals("당첨")) {
			System.out.println("전액을 저축한다");
		}else {
			System.out.println("다시 돈 번다");
		}
	}
	
	@Override
	public String toString() {
		return "Employee [lotto=" + Arrays.toString(lotto) + ", company=" + company + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(lotto);
		result = prime * result + Objects.hash(company);
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
		Employee other = (Employee) obj;
		return Objects.equals(company, other.company) && Arrays.equals(lotto, other.lotto);
	}
	public String[] getLotto() {
		return lotto;
	}
	public void setLotto(String[] lotto) {
		this.lotto = lotto;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}
