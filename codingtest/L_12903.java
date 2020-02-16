package codingtest;

public class L_12903 {

	
	
	public String solution(String s) {
	      String answer = "";
	      
	      if(s.length()%2 == 0) {
	    	  int mok=s.length()/2;
	    	  answer += s.substring(mok-1, mok+1);
	    	  System.out.println(answer);
	    	  
	      }else {
	    	  int mok=s.length()/2;
	    	  answer += s.substring(mok, mok+1);
	    	  System.out.println(answer);
	      }
	      
	      
	      return answer;
	  }
	
	
	public static void main(String[] args) {
		L_12903 l  = new L_12903();
		l.solution("abcdee");

	}

}
