package anonymousTest;

public class Starbucks {
	boolean freeEvent;
	
	public Starbucks() {;}
	public Starbucks(boolean freeEvent) {
		this.freeEvent = freeEvent;
	}
//	
	public void register(Form form) {
		String[] menu = form.getMenus();
		for(int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + "." + menu[i]);
		}
		
//		판매중인 곳인지, 무료나눔을 하고있는곳인지 판별
		if(freeEvent) {
			System.out.println("무료증정 행사 승인");
			form.free("아메리카노");;			
		}else {
			form.sell("아메리카노");						
		}
		
		if(form instanceof FormAdapter) {
			System.out.println("무료나눔 행사중");
		}else {
			System.out.println("판매완료완료");
		}
	}
}
