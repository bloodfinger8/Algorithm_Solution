package codingtest;

public class L_12912 {
	
	
	
	public long solution(int a, int b) {
	    long answer = 0;
	    
	    int start = 0;
	    int end = 0;
	    
	    if(a > b) {
	    	start = b;
	    	end = a;
	    }else{
	    	start = a;
	    	end = b;
	    }
	    
	    
	    for (int i = start; i <= end; i++) {
			answer += i;
		}
	    return answer;
	    
	}	

	
	
	
	public static void main(String[] args) {
		L_12912 l = new L_12912();
		l.solution(5, 3);
	}

}
