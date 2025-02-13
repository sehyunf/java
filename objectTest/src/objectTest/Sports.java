package objectTest;

public class Sports {
//	1. 기본생성자
//	2. 초기화 생성자
//	3. private 붙이기
//	4. getter, setter 만들기
//	5. toString 재정의
//	6. hashCode, equals 재정의
	
//	alt + shift + a 그리드모드
	private String type;
	private int total;
	
	public Sports() {;}	
	public Sports(String type, int total) {
		this.type = type;
		this.total = total;
	}
	
//	alt + shift + s  -> alt + r -> a -> r
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + "]";
	}
	
	
	public static void main(String[] args) {
		Sports sports = new Sports();
//		System.out.println(sports.hashCode());
		System.out.println(sports);
//		sports.equals(sports);
	}
}
