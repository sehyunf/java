package tms;

import java.util.Arrays;
import java.util.Objects;

public class Researcher extends Person{
	private String[] lotto;
	private String search;
	
	public Researcher() {;}

	public Researcher(String name, int age, String phone, String search) {
		super(name, age, phone, search);
		this.search = search;
	}
	
	@Override
	void work() {
		System.out.println("연구원은 " + search +"중이다.");
	}
	
	void investLab(String checkLotto) {
		if(checkLotto.equals("당첨")) {
			System.out.println("연구에 투자한다");
		}else {
			System.out.println("나에게 투자한다");
		}
	}
	void buyFood(String checkLotto) {
		if(checkLotto.equals("당첨")) {
			System.out.println("지인에게 밥을 산다");
		}else {
			System.out.println("집에 쌀을 산다");
		}
	}

	@Override
	public String toString() {
		return "Researcher [lotto=" + Arrays.toString(lotto) + ", search=" + search + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(lotto);
		result = prime * result + Objects.hash(search);
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
		Researcher other = (Researcher) obj;
		return Arrays.equals(lotto, other.lotto) && Objects.equals(search, other.search);
	}
	

	public String[] getLotto() {
		return lotto;
	}

	public void setLotto(String[] lotto) {
		this.lotto = lotto;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
	
}
