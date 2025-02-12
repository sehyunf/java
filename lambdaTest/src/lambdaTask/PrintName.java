package lambdaTask;

@FunctionalInterface
public interface PrintName {
	public void plusName(String firstName,String lastName);
	
	public static void main(String[] args) {
		System.out.println("안녕");
	}
}
