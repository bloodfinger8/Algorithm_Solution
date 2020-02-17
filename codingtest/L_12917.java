package codingtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class L_12917 {
	
	
	
	public String solution(String s) {
	      String answer = "";
	      String[] spel =s.split("");
	      List<String> list = new ArrayList<String>();
	      
	      for (String string : spel) {
			list.add(string);
	      }
	      
	      Comparator<String> com = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2)*-1;
			}
	    	  
		};
	      
		Collections.sort(list,com);
		
		for (int i = 0; i < list.size(); i++) {
			answer += list.get(i);
		}
	      return answer;
	      
	      
	  }

	public static void main(String[] args) {
		L_12917 l = new L_12917();
		l.solution("Zbcdefg");
	}

}
