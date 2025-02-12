package abstractTest;

public class Cat implements Pet{

	@Override
	public void sitDown() {
		System.out.println("안기다린다");
	}

	@Override
	public void waitNow() {
		System.out.println("도망간다");
	}

	@Override
	public void poop() {
		System.out.println("고양이 모래에 배변훈련");
		
	}
	
}
