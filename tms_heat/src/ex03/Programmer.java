package ex03;

import java.util.Objects;

public class Programmer extends Person {
	private boolean notebook;
	
	public Programmer() {;}

	public Programmer(String name, int age, String job, String hobby, boolean notebook) {
		super(name, age, job, hobby);
		this.notebook = notebook;
	}

	@Override
	void work() {
		System.out.println(this.getJob()+"은 코딩을 합니다.");
	}
	
	@Override
	void hobby() {
		char[] arData = {'A', 'B', 'C', 'D'};
		for(char c: arData) {
			System.out.println(c);
		}
	}
	
	@Override
	public String toString() {
		return "Programmer [notebook=" + notebook + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(notebook);
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
		Programmer other = (Programmer) obj;
		return notebook == other.notebook;
	}

	public void isNotebook() {
		if(notebook) {
			System.out.println("노트북이 있습니다.");
		}else {
			System.out.println("노트북이 없습니다.");			
		}
	}

	public void setNotebook(boolean notebook) {
		this.notebook = notebook;
	}
	
	
	
	
	
}
