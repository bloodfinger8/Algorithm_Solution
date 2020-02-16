package codingtest;

import java.util.ArrayList;
import java.util.List;


public class L_42862 {

	
	public int solution(int n, int[] lost, int[] reserve) {
        
        
        List<Integer> lostList = new ArrayList<Integer>();
        List<Integer> reserveList = new ArrayList<Integer>();
        
        for (int i = 0; i < lost.length; i++) {
        	lostList.add(lost[i]);
		}
        for (int i = 0; i < reserve.length; i++) {
        	reserveList.add(reserve[i]);
		}
        
        int answer = n-lost.length;
        
        for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				
				if(lostList.contains(reserveList.get(j))) {
					lostList.remove(lostList.indexOf(reserveList.get(j)));
					reserveList.remove(j);
					answer++;
					if(reserveList.size()==0) {
						System.out.println("1번 :"+answer);
						return answer;
					}
					
				}
				if(lostList.get(i)-1 == reserveList.get(j) || lostList.get(i)+1 == reserveList.get(j)) {
					answer++;
					reserveList.remove(j);
					if(reserveList.size()==0) {
						System.out.println("2번 :"+answer);
						return answer;
					}
					break;
				}
			}
			
		}
        System.out.println("3번 :"+answer);
        return answer;
    }
	
	
	public static void main(String[] args) {
		int n = 10;
		int[] lost = {2,8,9};
		int[] reserve = {1,7};
		
		L_42862 l = new L_42862();
		l.solution(n, lost, reserve);
	}

}
