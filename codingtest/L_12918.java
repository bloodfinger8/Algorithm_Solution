package codingtest;

public class L_12918 {
	
	public boolean solution(String s) {
	      boolean answer = false;
	      int a = 0;
	      
	      
    	  try {
			  a = Integer.parseInt(s);
			  if(s.length()==4 || s.length()==6) {
				  return true;
			  }
		  } catch (NumberFormatException e) {
			 return false;
		  }
		  
	      
	      return answer;
	  }
	
	

	public static void main(String[] args) {
		L_12918 l = new L_12918();
		l.solution("a234");
	}

}
