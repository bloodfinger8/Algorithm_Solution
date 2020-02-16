package codingtest;

import java.util.ArrayList;
import java.util.List;

public class L_12906 {
	
	public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        
        int k = 0;
        
        for (int i = 0; i < arr.length; i++) {
        	for (int j = i+1; j < arr.length; j++) {
        		
				if(arr[i] == arr[j]) {
					//마지막 인덱스라면
					if(j==arr.length-1) {
						list.add(arr[i]);
						answer = new int[list.size()];
				        for (int r = 0; r < answer.length; r++) {
				        	answer[r] = list.get(r);
						}
						return answer;
					}
				}else {
					list.add(arr[i]);
					k++;
					i=j-1;
					if(i==arr.length-2) {
						//list.add(arr[arr.length-1]);
						list.add(arr[i+1]);
						
						answer = new int[list.size()];
				        for (int r = 0; r < answer.length; r++) {
				        	answer[r] = list.get(r);
						}
						return answer;
					}
					break;
				}
			}
		}
        
        return answer;
	}
	

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1,1,1,1,2,3};
		L_12906 l = new L_12906();
		l.solution(arr);
	}

}
