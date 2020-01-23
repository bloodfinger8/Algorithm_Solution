package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;


public class Heap_04 {

	//https://programmers.co.kr/learn/courses/30/lessons/42628
	
	public int[] solution(String[] operations) {
        int[] answer = new int[2];
        Queue maxQue = new PriorityQueue<>(Collections.reverseOrder());
        Queue minQue = new PriorityQueue<>();
        
        for(String operation : operations) {
            String[] cmd = operation.split(" ");
            
            if(cmd[0].equals("I")) {
               maxQue.offer(Integer.parseInt(cmd[1]));
               minQue.offer(Integer.parseInt(cmd[1]));
            }else if(!maxQue.isEmpty()){
               if(cmd[1].equals("1")){
            	   minQue.remove(maxQue.poll());
               }else {
            	   maxQue.remove(minQue.poll());
               }
            }
         }
         //System.out.println("최대값 : " + maxQueue);
         //System.out.println("최소값 : " + minQueue);
        
         answer[0] = maxQue.isEmpty() ? 0 : (int) maxQue.poll();
         answer[1] = minQue.isEmpty() ? 0 : (int) minQue.poll();
        
        
         return answer;
    }
	
	
	public static void main(String[] args) {
		//String[] operations = {"I 7","I 5","I -5","D -1"};
		String[] operations ={"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
		Heap_04 h4 = new Heap_04();
		System.out.println(h4.solution(operations));
	}

}
