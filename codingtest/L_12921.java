package codingtest;

public class L_12921 {
	
	//소수 찾기 문제
	public int solution(int n) {
	      int answer = 0;
	      
	      
	      for (int i = 2; i <= n; i++) {
	    	  int end = (int) Math.sqrt(i);
	    	  
	    	  for (int j = 2; j <= end; j++) {
				if(i%j == 0) {
					answer++;
					break;
				}
	    	  }
	      }
//	      System.out.println(n-1-answer);
	      return n-1-answer;
	}
	
	
	

	public static void main(String[] args) {
		L_12921 l = new L_12921();
		l.solution(5);
	}

}
