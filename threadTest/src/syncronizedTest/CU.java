package syncronizedTest;

public class CU {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread sh = new Thread(atm, "세현");
		Thread gd = new Thread(atm, "길동");
		
		sh.start();
		gd.start();
	}
}
