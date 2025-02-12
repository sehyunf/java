package abstractTest;

public class WashingMachine extends Electronics {

	@Override
	public void on() {
		System.out.println("버튼을 눌러서 전원 켜기");
	}

	@Override
	public void off() {
		System.out.println("버튼을 눌러서 전원 끄기");
	}
	
}
