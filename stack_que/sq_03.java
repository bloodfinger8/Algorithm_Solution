package stack_que;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class sq_03 {
	//https://programmers.co.kr/learn/courses/30/lessons/42586
	//풀었다
	
	
	public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue que = new LinkedList();
        List<Integer> list = new ArrayList<Integer>();
        int[] count;
        
        for(int i=0; i<progresses.length; i++) {
        	//System.out.println(progresses[i]);
        	int target = 100 - progresses[i];
        	
        	for (int j = 1; j < 100; j++) {
				int sum = speeds[i] * j;
				//System.out.println(speeds[i]+" / " + j);
				if(sum >= target) {
					que.offer(j);
					break;
				}
			}

        }
        
       //큐에 담긴 값을 배열로 옮겼다.
       count = new int[que.size()];
       for(int i=0; i<count.length; i++) {
    	   //count[i] = (int) que.poll();
    	   list.add((Integer) que.poll());
       }
       
//       ---------------------------------------------------
       
       System.out.println(list);
       int eq = list.get(0);
       List<Integer> dapList = new ArrayList<Integer>();
       int co = 1;
       
       for (int i = 1; i < list.size(); i++) {
    	   if(eq > list.get(i)) {
    		   if(i == list.size()-1) {
    			   co++;
    			   dapList.add(co);
    			   break;
    		   }
    		   co++;
    		  
    	   }else if(eq < list.get(i)){
    		   dapList.add(co);
    		   eq = list.get(i);
    		   co = 1;
    		   if(i == list.size()-1) {
    			   dapList.add(co);
    			   break;
    		   }
    	   }else if(eq == list.get(i)) {
    		   co++;
    	   }
    	   
       }
       	System.out.println(dapList);
       	
       	answer = new int[dapList.size()];
       	for(int i=0; i<dapList.size(); i++) {
       		answer[i]=dapList.get(i);
        }
       	
        return answer;
    }
	
	public static void main(String[] args) {
		int[] progresses = {55, 90,90, 30,30};
		int[] speeds = {5, 1,1, 10,9};
		sq_03 sq3 = new sq_03();
		sq3.solution(progresses, speeds);
	}

}
