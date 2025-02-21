package foldMoney;

class Solution {
	public void setBigAndSmallSide(int[] data) {
		
	}
	
	public int solution(int[] wallet, int[] bill) {
		int answer = 0;
		boolean isNotInWallet = true;
		int walletBigSide = 0;
		int walletSmallSide = 0;
		int billBigSide = 0;
		int billSmallSide = 0;
		
		if(wallet[0] - wallet[1] > 0) {
			walletBigSide = wallet[0];
			walletSmallSide = wallet[1];
		}else {
			walletBigSide = wallet[1];
			walletSmallSide = wallet[0];			
		}
		if(bill[0] - bill[1] > 0) {
			walletBigSide = wallet[0];
			walletSmallSide = wallet[1];
		}else {
			walletBigSide = wallet[1];
			walletSmallSide = wallet[0];			
		}
//		알고리즘
//		들어가냐?
//			재는법 지폐의 큰수가 지갑의 큰수보다 작아야 함
//			동시에 지폐의 작은수가 지갑의 작은수보다 작아야 함
//				반복마다 지폐의 큰 수 작은 수 비교해서 넣기
//				
		
//		두수중 더 큰수를 반으로 나눔 answer++
//		들어가냐? 반복
//		while(true) {
//			
//		}
		return answer;
    }
}