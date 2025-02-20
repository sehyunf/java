package catingTesk2;

public class Character {
	String name;
	String job;
	int level;
	
	static {
		System.out.println("여행을 시작합니다");
	}
	
	{
		this.level = 1;
	}
	public Character() {;}
	
	public Character(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	void hunting(Character character) {
		
		if(character instanceof Ork) {
//			Ork클래스의 매서드를 사용하고싶을 때
//			Ork ork = new Ork();
			System.out.println(name + "은(는)오크를 잡았다.\n가죽을 얻었다.");
		}else if(character instanceof Fairy) {
			System.out.println(name + "은(는)요정을 잡았다.\n날개을 얻었다.");
		}else if(character instanceof Human) {
			System.out.println(name + "은(는)사람을 잡았다.\n갑옷을 얻었다.");
		}
	}
//	// 오버라이딩을 이용
//	// 상속을 위한 매서드
//	void hunting() {
//		System.out.println("자살");
//	}
}

class Ork extends Character{
	
	public Ork() {;}
	
//	@Override
//	void hunting() {
//		System.out.println("가죽을 얻었다.");
//	}
	
}

class Fairy extends Character{
	
	public Fairy() {;}
	
//	@Override
//	void hunting() {
//		System.out.println(super.name + "은 날개를 얻었다.");
//	}
	
}

class Human extends Character{
	
	public Human() {;}
	
//	@Override
//	void hunting() {
//		System.out.println("갑옷을 얻었다.");
//	}
	
}