package abstractTest;

public abstract class Electronics {
	
	public Electronics() {;}
	
//	추상 메서드
	public abstract void on();
	public abstract void off();
	
//	상수 : final
	public final void safe() {
		System.out.println("안전장치가동");
	}
	
}
