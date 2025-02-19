package syncronizedTest;

public class ATM implements Runnable{
	
	int money = 10000;
	
	public ATM() {;}
	
	public synchronized void withdraw(int money) {
//		synchronized(this) {
//			this.money -= money;
//		}
			this.money -= money;
		
		System.out.println(Thread.currentThread().getName() + "이(가)" + money + "원 출금");
		System.out.println("현재 잔액 : " + this.money + "원");
	}
	
//	Thread.interrupted()
//	쓰레드가 멈추있을때만 종료할 수 있다.
	
//	기본 로직
//	while(!Thread.interrupted()) {
//		System.out.println("쓰레드 작업중");
//		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			withdraw(1000);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
