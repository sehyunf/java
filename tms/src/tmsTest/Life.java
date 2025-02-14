package tmsTest;

public class Life {
	public static void main(String[] args) {
		String[] arr1 = {"2","1","3","4","5","6"}; 
		String[] arr2 = {"1","2","3","4","5","10"}; 
		Lotto operater = new Lotto("관리자");
		Lotto hong = new Lotto("학생", arr1);
		Lotto kim = new Lotto("회사원", arr2);
		Lotto park = new Lotto("연구원", arr1);
		operater.drawNumber();
		
//		for(String luckynum : )
		park.checkLotto();
		hong.checkLotto();
		park.checkLotto();
		kim.checkLotto();
		
		
	}
}
