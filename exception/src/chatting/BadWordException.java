package chatting;

// Exception 상속 : 프로그램종료
// RuntimeException 상속 : 종료 안함

public class BadWordException extends RuntimeException{
	public BadWordException() {;}
	public BadWordException(String message) {
		super(message);
	}
}
