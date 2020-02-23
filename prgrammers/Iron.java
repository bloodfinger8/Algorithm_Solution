package prgrammers;

import java.util.ArrayList;

public class Iron {
	
	 public int solution(String arrangement) {
	        int answer = 0;
	        
	        String arr = arrangement.replace("()", "0");
	        
	        ArrayList<Character> list = new ArrayList<Character>();
	        ArrayList<Character> stack = new ArrayList<Character>();
	        
	        for(int i =0; i<arr.length(); i++) {
	        	list.add(arr.charAt(i));
	        	
	        }
	        System.out.println(list);
	        
	        for(int i =0; i<list.size(); i++) {
	        	if(list.get(i) == '(') {
	        		stack.add(list.get(i));
	        	}else if(list.get(i) == ')'){
	        		stack.remove(stack.size()-1);
	                answer += 1;
	            }else if(list.get(i) == '0'){
	                answer += stack.size();
	            }
	        }
	        System.out.println(answer);
	        
	        return answer;
	    }

	 
	 
	public static void main(String[] args) {
		Iron iron = new Iron();
		iron.solution("()(((()())(())()))(())");
	}

}
