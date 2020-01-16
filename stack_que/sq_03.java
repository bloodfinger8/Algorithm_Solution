package stack_que;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class sq_03 {
	//https://programmers.co.kr/learn/courses/30/lessons/42586#
	//통과 불가 근데 코드의 문제를 모르겠다. 추후에 확인! 
	
	
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
       int min = list.get(0);
       int max = list.get(0);
       int index = 0;
       int checkIndex = 0;
       int whileCount =0;
       
       while(!list.isEmpty()) {
	       Iterator<Integer> it = list.iterator();
	       while(it.hasNext()) {
	    	   int k=it.next();
	    	   if(min >= k) {
	    		   min = k;
	    		   checkIndex = index;
	    	   }
	    	   if(max<k) {
	    		   max = k;
	    	   }
	    	   index++;
	       }
	       index = 0;
	       
	       //System.out.println("checkIndex의 값 " + checkIndex);
	       for(int i=0; i<=checkIndex; i++) {
	    	   //System.out.println(list.get(0));
	    	   if(max <= list.get(0) && whileCount == 0) {
	    		   que.clear();
	 	    	   que.offer(progresses.length);
	 	    	  System.out.println(que);
	 	    	   answer = new int[1];
	 	      	   answer[0]=(int) que.poll();
	 	      	   return answer;
	    	   }
	    	   list.remove(0);
	       }
	       
	       //System.out.println("사라진걸 확인 " + list + "/" + checkIndex);
	       
	       if(!list.isEmpty()) {
	    	   que.offer(checkIndex+1);
	    	   min=list.get(0); //min 초기화
	       }else {
	    	   que.offer(checkIndex+1);
	       }
	       
	       checkIndex = 0;
	       whileCount++;
       }
       
       answer = new int[que.size()];
       System.out.println(que);
       //최종 배열에 넣는다
       for(int i=0; i<answer.length; i++) {
    	   answer[i]=(int) que.poll();
       }
       	
        return answer;
    }
	
	public static void main(String[] args) {
		int[] progresses = {10,93,30,50,90};
		int[] speeds = {2,1,30,5,2};
		sq_03 sq3 = new sq_03();
		
		System.out.println(sq3.solution(progresses, speeds));
	}

}
