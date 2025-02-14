package tmsTest;

public class Lotto {
	private static String[] luckyNumberArray;
	private String job;
	private String[] consumerNumber;
	private boolean isbuy;
	private boolean canDraw;
	private int count = 0;
	
	public Lotto() {;}
	
	public Lotto(String job) {
		this.job = job;
		if(job.equals("관리자")) {
			this.canDraw = true;
		}
	}

	public Lotto(String job, String[] consumerNumber) {
		this.job = job;
		this.consumerNumber = consumerNumber;
		if(job.equals("회사원") || job.equals("연구원")) {
			this.isbuy = true;
		}
		if(job.equals("관리자")) {
			this.canDraw = true;
		}
	}
	
	void drawNumber() {
		if(canDraw) {
			
			luckyNumberArray = new String[6];
			luckyNumberArray[0] = "1";
			luckyNumberArray[1] = "2";
			luckyNumberArray[2] = "3";
			luckyNumberArray[3] = "4";
			luckyNumberArray[4] = "5";
			luckyNumberArray[5] = "6";
				
	//		for (int i = 0; i < 6; i++) {
	//			luckyNumberArray[i] = String.valueOf((int)Math.floor((Math.random() * 45 + 1)));
	//			for(int j = 0; j < i; j++) {
	//				if(luckyNumberArray[j].equals(luckyNumberArray[i])) {
	//					i--;
	//					break;
	//				}
	//			}
	//		}
			System.out.println("이번 주 당첨 번호");
			for(String num : luckyNumberArray) {
				System.out.print(num + " ");
			}
			System.out.println();
			
		}else {
			System.out.println("추첨 시작은 관리자만 할 수 있습니다");
		}
	}
	
	void checkLotto() {
		count = 0;
		if(isbuy) {
			for(String luckyNumber : luckyNumberArray) {
				for(String Number : consumerNumber) {
					if (luckyNumber.equals(Number)) {
						count++;
					}
				}
			}
			if (count >= 5) {
				congratulation();
			} else {
				System.out.println("아쉽지만 낙첨 되셨습니다.");
			}
		} else {
			System.out.println("로또를 구매할 수 없습니다");
		}
	}
	
	void congratulation() {
		if (count == 5) {
			if(job.equals("회사원")) {
				System.out.println("전액을 저축한다");
			}else {
				System.out.println("지인에게 밥을 산다");
			}
		}else if(count == 6){
			if(job.equals("회사원")) {
				System.out.println("직장을 그만둔다");
			}else {
				System.out.println("연구에 투자한다");
			}
		}
	}
	
	public static void setLuckyNumberArray(String[] luckyNumberArray) {
		Lotto.luckyNumberArray = luckyNumberArray;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String[] getConsumerNumber() {
		return consumerNumber;
	}
	public void setConsumerNumber(String[] consumerNumber) {
		this.consumerNumber = consumerNumber;
	}
	public boolean isIsbuy() {
		return isbuy;
	}
	public void setIsbuy(boolean isbuy) {
		this.isbuy = isbuy;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
