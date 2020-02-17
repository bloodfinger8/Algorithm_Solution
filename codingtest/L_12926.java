package codingtest;

public class L_12926 {

	
	public String solution(String s, int n) {
	    String answer = "";
	   
	    for (int i = 0; i < s.length(); i++) {
			char k = s.charAt(i);
			
			if(k == ' ') {
				answer += " ";
			}else if(k <= 90 && k >= 65) {
				if(k+n > 90) {
					answer += (char)(k+n-26);
				}else {
					answer += (char)(k+n);
				}
			}else if(k <= 122 && k >= 97) {
				if(k+n > 122) {
					answer += (char)(k+n-26);
				}else {
					answer += (char)(k+n);
				}
			}
				
		}
	    return answer;
	}
	
	
	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		
		L_12926 l = new L_12926();
		l.solution(s, n);
	}
}
