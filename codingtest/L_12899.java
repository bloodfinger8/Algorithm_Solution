package codingtest;

public class L_12899 {
	
	public String solution(int n) {
	    String answer = "";
	    Long n1 =Long.parseLong(String.valueOf(n));
	    Long total = Long.parseLong(String.valueOf(1));
	    
	    for (long i = 1; i < n1; i=i+3) {
	    	total += 1;
		}
	    for (long i = 2; i < n1; i=i+3) {
	    	total += 2;
		}
	    for (long i = 3; i < n1; i=i+3) {
	    	total += 7;
		}
	      
	    answer = String.valueOf(total);
	    System.out.println(answer);
	    return answer;
	}

	public static void main(String[] args) {
		L_12899 l = new L_12899();
		l.solution(13);
	}

}
