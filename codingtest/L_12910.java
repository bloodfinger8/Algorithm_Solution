package codingtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L_12910 {
	

	  public int[] solution(int[] arr, int divisor) {
	      int[] answer = {};
	      List<Integer> list = new ArrayList<Integer>();
	      
	      for (int i = 0; i < arr.length; i++) {
	    	  if(arr[i]%divisor ==0) {
	    		  list.add(arr[i]);
	    	  }
	      }
	      
	      if(list.size()==0) {
	    	  answer = new int[1];
	    	  answer[0]= -1;
	    	  return answer;
	      }
	      
	      Collections.sort(list);
	      answer = new int[list.size()];
	      
	      for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
	      }
	      
	      return answer;
	  }

	
	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		int divisor = 5;
		
		L_12910 l = new L_12910();
		l.solution(arr, divisor);
	}

}
