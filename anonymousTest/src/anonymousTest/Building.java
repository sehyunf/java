package anonymousTest;

// 실습
// 잠실점 오픈
// 무료나눔 행사중
// 무료나눔 행사중이라면, "무료나눔 행사 승인" 출력
// 무료나눔 행사 중이 아니라면, 판매
public class Building {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		boolean freeEvent = true;
		gangnam.register(new Form() {
			
			@Override
			public void sell(String menu) {
				String[] menus = getMenus();
				for(int i = 0; i < menus.length; i++) {
					if(menus[i].equals(menu)) {
						System.out.println(menus[i] + " 판매완료");
						break;
					}
				}
			}
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "에이드", "디카페인"};
			}

			@Override
			public void free(String menu) {
				// TODO Auto-generated method stub
				
			}
		});
		
//		잠실점 등록
		Starbucks jamsil = new Starbucks(freeEvent);
		
		System.out.println("-------잠실점 등록-------");
		
		jamsil.register(new FormAdapter() {
			@Override
			public void free(String menu) {
				String[] menus = getMenus();
				for(int i = 0; i < menus.length; i++) {
					if(menus[i].equals(menu)) {
						System.out.println(menus[i] + " 무료증정");
						break;
					}
				}
				
			}
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "에이드", "디카페인"};
			}
		});
	}
}
