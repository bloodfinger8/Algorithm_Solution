package heap;

import java.util.PriorityQueue;

public class Heap_01 {
	
	
	 public int solution(int[] scoville, int K) {
	        int answer = 0;
	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	        
	        for(int j : scoville) {
	        	pq.offer(j);
	        }
	        
	        while(pq.peek() <= K) {
	        	
	        	if(pq.size() == 1) {
	        		return -1;
	        	}
	        	int k = pq.poll();
	        	int k2 = pq.poll();
	        	Integer result = k + (k2 * 2);
	        	
	        	pq.offer(result);
	        	answer++;
	        }
	        
	        System.out.println(pq);
	        
			return answer;
	        
	    }
	 
	 
	 

	public static void main(String[] args) {
		
		int[] scoville= {1,2,3,9,10,12};
		int K = 7;
		
		Heap_01 h1 = new Heap_01();
		System.out.println(h1.solution(scoville, K));
		
	}

}
