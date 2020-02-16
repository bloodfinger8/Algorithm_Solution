package codingtest;

import java.util.ArrayList;
import java.util.List;

public class L_60057 {

	
	
	 public int solution(String s) {
	        int answer = 0;
	        List<String> list = new ArrayList<String>();
	        
	        for (int i = 0; i < s.length(); i++) {
				list.add(s.substring(i, i+1));
			}
	        
	        
	        
	        
	        return answer;
	}
	
	
	public static void main(String[] args) {
		String s = "aabbaccc";
		L_60057 l_60057 = new L_60057();
		
		
		l_60057.solution(s);
		
	}

}
