package lotto;

public class Lotto {
	public String[] getLuckyNumber() {
		String[] luckyNumberArray = new String[6];
		
		for (int i = 0; i < 6; i++) {
			luckyNumberArray[i] = String.valueOf((int)Math.floor((Math.random() * 45 + 1)));
			for(int j = 0; j < i; j++) {
				if(luckyNumberArray[j].equals(luckyNumberArray[i])) {
					i--;
					break;
				}
			}
		}
		return luckyNumberArray;
	}
	
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		String[] lucky = null;
		lucky = lotto.getLuckyNumber();
		
		String message = "이번주 당첨번호";
		System.out.println(message);
		for(String luckyNum : lucky) {
			System.out.print(luckyNum + " ");
		}
	}
}
