package codingtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class L_12915 {
	
	
	//너무 좋은 문제
	  public String[] solution(String[] strings, int n) {
	      String[] answer = {};
	      List<Al> list = new ArrayList<Al>();
	      
	      for (int i = 0; i < strings.length; i++) {
	    	  String a = strings[i];
	    	  answer = a.split("");
	    	  Al al = new Al(strings[i], i, answer[n]);
	    	  
	    	  list.add(al);
	      }
	      
	      Comparator<Al> com = new Comparator<L_12915.Al>() {

			@Override
			public int compare(Al o1, Al o2) {
				if(o1.getCha().equals(o2.getCha())) {
					return o1.getSpel().compareTo(o2.getSpel());
				}
				return o1.getCha().compareTo(o2.getCha());
			}
		};
	      
	      Collections.sort(list, com);
	      answer = new String[list.size()];
	      for (int i = 0; i < answer.length; i++) {
	    	  answer[i]=list.get(i).getSpel();
	      }
	      
	      
	      return answer;
	  }
	
	  
	  class Al {
		  private String spel;
		  private int index;
		  private String cha;
		  
		  public Al(String spel , int index, String cha) {
			  this.spel = spel;
			  this.index = index;
			  this.cha = cha;
		  }
		  
		public String getSpel() {
			return spel;
		}
		public int getIndex() {
			return index;
		}
		public String getCha() {
			return cha;
		}

		  
	  }

	
	public static void main(String[] args) {
		
		String[] strings = {"sun", "bud", "car"};
		int n=1;
		
		L_12915 l = new L_12915();
		l.solution(strings, n);
	}
}
