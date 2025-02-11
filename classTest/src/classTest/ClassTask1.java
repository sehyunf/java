package classTest;

class Market {
//	상품, 가격, 재고
//	sell 메서드
	String product;
	int price;
	int stock;
	public Market() {;}
	
	public Market(String product, int price, int stock) {
		this.product = product;
		this.price = price;
		this.stock = stock;
	}
//	메서드 sell 기능: 상품.스톡-1, 고객.머니에서 할인율적용 후 가격 차감
//	, 재고없을경우 취소하고 재고없다 하기 가격 부족 시 가격부족하다 하기
	void sell(Customer customer, Market product) {
		if(product.stock != 0) {
			if(customer.money - product.price*(1-0.01*customer.salePrice) >= 0) {
				customer.money -= product.price*(1-0.01*customer.salePrice);
				product.stock--;							
			}else {
				System.out.println("돈이 부족합니다!");
			}
		}else {
			System.out.println("재고가 없습니다");
		}
		
	}
	
	
}

class Customer {
//	이름, 전화번호, 돈, 할인율
	String name;
	String phone;
	int money;
	int salePrice;	
	
//	기본 생성자
	public Customer() {;}

	
	public Customer(String name, String phone, int money, int salePrice) {
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.salePrice = salePrice;
	}
	
//	초기화 생성자
	
	
	
	
	
}

public class ClassTask1 {
	public static void main(String[] args) {
//		sell() 사용
//		사람의 돈 출력
//		마켓 상품의 재고 출력
		Market apple = new Market("사과", 1500, 10);
		Customer hong = new Customer("홍길동", "010-1234-5678", 50000, 10);
		System.out.println("길동이 돈 :"+hong.money);
		System.out.println("사과 재고 :"+apple.stock);
		
		apple.sell(hong,apple);
		
		System.out.println("길동이 돈 :"+hong.money);
		System.out.println("사과 재고 :"+apple.stock);
		apple.sell(hong,apple);
		
		System.out.println("길동이 돈 :"+hong.money);
		System.out.println("사과 재고 :"+apple.stock);
		
	}
//	
	
}