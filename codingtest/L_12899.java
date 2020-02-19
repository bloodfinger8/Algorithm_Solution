package codingtest;

public class L_12899 {
	
	public String solution(int n) {
	    String answer = "";
	    int rest =0;
	    
	    while(n>0) {
	    	rest = n%3; //나머지
	    	n = n / 3; // 몫 바꿔주기
	    	if(rest == 0) {
	    		rest = 4;
	    		System.out.println(n+"//");
	    		n -= 1;
	    		System.out.println(n);
	    	}
	    	answer += rest;
	    }
	    
	    System.out.println(answer);
	    
	    return answer;
	}

	public static void main(String[] args) {
		L_12899 l = new L_12899();
		l.solution(10);
	}

}
