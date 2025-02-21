package bandage;

class Solution {
	public int solution(int[] bandage, int health, int[][] attacks) {
		int answer = 0;
		int lastAtteck = attacks[attacks.length-1][0];
		int attacksCount = 0;
		int maxHealth = health;
		int successCount = 0;
//		t초동안 x만큼 회복 
//		몬스터가 공격시 공격을 버티면 바시 시작 매 초마다 실행
//		캐릭터의 체력이 0이하가 되면 사망 -1 return
//		for문을 시간단위로 돌리다 어택만나면 실행
		for(int time = 0; time <= lastAtteck; time++) {
			if(time == attacks[attacksCount][0]) {
				health -= attacks[attacksCount][1];
				attacksCount++;
				if(health <= 0) {
					return -1;
				}
			}else {
				health += bandage[1];
				successCount++;
				if(successCount == bandage[0]) {
					health += bandage[2];
				}
				if(health > maxHealth) {
					health = maxHealth;
				}
				
				answer = health;
				
			}
		}
		
		
		return answer;
	}
}
//	public int healthCheck(int health) {
//		if(health)
//	}
