package catingTesk2;

public class CastingTask2 {
	public static void main(String[] args) {
//		캐릭터는 오크, 요정, 인간을 사냥할 수 있다
//		오크 : 가죽을 얻는다.
//		요정 : 날개를 얻는다.
//		인간 : 갑옷을 얻는다.
		Character ork = new Ork();
		Character fairy = new Fairy();
		Character human = new Human();
		Character gildong = new Character("홍길동", "회사원");
		Character bogo = new Character("장보고", "택시기사");
		
		gildong.hunting(ork);
		gildong.hunting(fairy);
		gildong.hunting(human);
		gildong.hunting(fairy);
		
		bogo.hunting(ork);
		bogo.hunting(fairy);
		bogo.hunting(human);
		
		System.out.println((int)'가');
//		gildong.hunt(gildong);
		
	}
}
