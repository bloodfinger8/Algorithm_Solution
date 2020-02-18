package codingtest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L_12928 {
	
	
	public int solution(int n) {
	      int answer = 0;
	      int end = (int) Math.sqrt(n);
	      Set<Integer> set = new HashSet<Integer>();
	      
	      for (int i = 1; i <= n; i++) {
	    	  for (int j = i; j <= n; j++) {
	    		  if(i * j  == n) {
		    		  set.add(i);
		    		  set.add(j);
		    	  }
	    	  }
	      }
	      
	      List<Integer> list = new ArrayList<Integer>(set);
	      for (Integer integer : list) {
	    	  answer += integer;
	      }
	      return answer;
	}

	public static void main(String[] args) {
		L_12928 l = new L_12928();
		l.solution(12);
	}

}
