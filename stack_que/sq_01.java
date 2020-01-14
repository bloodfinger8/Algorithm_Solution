package stack_que;

import java.util.Stack;

public class sq_01 {
//https://programmers.co.kr/learn/courses/30/lessons/42588
	
	public int[] solution(int[] heights) {
        
		Stack<Integer> stack = new Stack<Integer>();
        int count = 0;
        
        for (int i = heights.length-1; i > 0; i--) {
        	//System.out.println(stack.size() + " ///" + count);
        	for(int j=i-1; j >= 0; j--) {
        		if(heights[i] < heights[j]) {
        			stack.push(j+1);
        			
        			break;
            	}
        	}
        	count++;
        	
    		if(stack.size() != count) {
				stack.push(0);
				//System.out.println("스택사이즈와 카운트가 다르다");
			}
    		
		}
        stack.push(0);
//        System.out.println(stack);
//        System.out.println("stck size : " + stack.size());
        
        int[] answer = {};
        answer = new int[stack.size()];
//        System.out.println("answer size : " + answer.length);
        for(int i=0; i<answer.length; i++) {
        	answer[i]=stack.pop();
        	//System.out.println(stack.pop());
        }
       
        
        //System.out.println(answer.length);
        return answer;
    }
	
	public static void main(String[] args) {
		int[] heights = {6,9,5,7,4};
		sq_01 sq1 = new sq_01();
		System.out.println(sq1.solution(heights));
		
	}

}
