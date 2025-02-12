package marker;

// 인터페이스도 타입이라면 instanceof로 검사할 수 있다.
public class Lab {

	public void checkKinds(Animal[] arAnimal) {
		for(int i = 0; i < arAnimal.length; i++) {
			if(arAnimal[i] instanceof CanivoreMarker) {
				System.out.println("육식동물");
			}else if(arAnimal[i] instanceof HerbivoreMarker) {
				System.out.println("초식동물");
			}else {
				System.out.println("잡식동물");
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Lab().checkKinds(new Animal[] {
				new Bear(),
				new Cow(),
				new Dog(),
				new Tiger()
		});
	}
}
