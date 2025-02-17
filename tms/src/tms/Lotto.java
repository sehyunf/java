package tms;

import java.util.Objects;

public class Lotto {
	private int id;
	private static String[] lottoNumbers;
	
	public Lotto() {;}
	
	public Lotto(int id) {
		this.id = id;
	}
	
	void drawNumber() {
		lottoNumbers = new String[6];
//		회사원A가 당첨되는 경우 테스트용
//		lottoNumbers[0] = "1";
//		lottoNumbers[1] = "2";
//		lottoNumbers[2] = "3";
//		lottoNumbers[3] = "4";
//		lottoNumbers[4] = "5";
//		lottoNumbers[5] = "6";
		
//		연구원B가 당청되는 경우 테스트용
//		lottoNumbers[0] = "7";
//		lottoNumbers[1] = "8";
//		lottoNumbers[2] = "9";
//		lottoNumbers[3] = "10";
//		lottoNumbers[4] = "11";
//		lottoNumbers[5] = "12";
		
//		테스트 시 아래 for문 전체를 주석처리 한다
		for(int i = 0; i < 6; i++) {
			lottoNumbers[i] = String.valueOf((int)Math.floor(Math.random() * 45 + 1));
			for(int j = 0; j < i; j++) {
				if(lottoNumbers[i].equals(lottoNumbers[j])) {
					i--;
					break;
				}
			}
		}
	}
	
	void sellLotto(Person person) {
		if(person instanceof Employee) {
			String[] lottoNumber = new String[6];
			for(int i = 0; i < 6; i++) {
				lottoNumber[i] = String.valueOf((int)Math.floor(Math.random() * 45 + 1));
				for(int j = 0; j < i; j++) {
					if(lottoNumber[i].equals(lottoNumbers[j])) {
						i--;
						break;
					}
				}
			}
			((Employee)person).setLotto(lottoNumber);
		}
		if(person instanceof Researcher) {
			String[] lottoNumber = new String[6];
			for(int i = 0; i < 6; i++) {
				lottoNumber[i] = String.valueOf((int)Math.floor(Math.random() * 45 + 1));
				for(int j = 0; j < i; j++) {
					if(lottoNumber[i].equals(lottoNumbers[j])) {
						i--;
						break;
					}
				}
			}
			((Researcher)person).setLotto(lottoNumber);
		}
		if(!(person instanceof Employee) && !(person instanceof Researcher)) {
			System.out.println("로또를 구매할 수 없습니다");
		}
	}
	
	public String checkLotto(Person person) {
		int count = 0;
		if(person instanceof Employee) {
			count = 0;
			for(String lottoNum : lottoNumbers) {
				for(String consumerNum:((Employee)person).getLotto()) {
					if(lottoNum.equals(consumerNum)) {
						count++;
					}
				};
			}
		}
		if(person instanceof Researcher) {
			count = 0;
			for(String lottoNum : lottoNumbers) {
				for(String consumerNum:((Researcher)person).getLotto()) {
					if(lottoNum.equals(consumerNum)) {
						count++;
					}
				};				
			}
		}
		if(!(person instanceof Employee) && !(person instanceof Researcher)) {
			System.out.println("로또를 구매할 수 없습니다");
		}
		return count == 6? "당첨" : "꽝!";
	}

	@Override
	public String toString() {
		return "Lotto [id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lotto other = (Lotto) obj;
		return id == other.id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String[] getLottoNumbers() {
		return lottoNumbers;
	}

	public static void setLottoNumbers(String[] lottoNumbers) {
		Lotto.lottoNumbers = lottoNumbers;
	}
	
	public static void main(String[] args) {
		long count = 0;
		while(true)
			{
			Lotto lotto = new Lotto(1);
			Person[] employee = new Person[5];
			Employee[] dangback = new Employee[5];
			boolean luck = false;
			
			for(int i = 0; i < 5; i++) {
				employee[i] = new Employee("일당백", 20, "01077776666", "IT");
			}
			
			for(int i = 0; i < 5 ; i++) {
				dangback[i] = (Employee)employee[i];			
			}
				
			
//			Person researcher1 = new Researcher("한우물", 35, "01044467878", "식물연구");
//			Researcher woomool = (Researcher)researcher1;
//			Person testMan = new Person("박세현", 20, "01012345678", "학생");	// 로또 구매 가능여부 테스트
//			String[] testMansLotto = {"1", "2", "3", "4", "5", "6"};		
//			lotto.sellLotto(testMan, testMansLotto);
			lotto.drawNumber();
			
//			String[] woomoolsLotto = {"7", "8", "9", "10", "11", "12"};
			
			for(Employee emp: dangback) {
				lotto.sellLotto(emp);				
				emp.byeCompany(lotto.checkLotto(emp));
				emp.saveMoney(lotto.checkLotto(emp));
				if(lotto.checkLotto(emp).equals("당첨")) luck = true;
			}

//			lotto.sellLotto(woomool, woomoolsLotto);
			
//			System.out.println("당첨번호");	// 당첨번호 확인용
//			for(String s : lottoNumbers) {
//				System.out.print(s + " ");
//			} 
//			System.out.println();
			
			
//			woomool.buyFood(lotto.checkLotto(woomool));
//			woomool.investLab(lotto.checkLotto(woomool));
			count++;
			if(luck) {
				System.out.println("매 주 5000원 로또를 사던 당백씨는 " + count / 52 + "년 뒤에 \n드디어 1등에 당첨되었습니다 정말 경사로군요!");
				System.out.println(count + "회 당첨");
				System.out.println(count * 7 + "일 걸림");
				System.out.println(count / 52 + "년 걸림");
				System.out.println("당백씨가 사용한 돈 : " + count * 5000 + "원");
				break;				
			}
		}
	}
}
