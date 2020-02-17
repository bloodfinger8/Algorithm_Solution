package codingtest;

public class L_12919 {
	
	
	public String solution(String[] seoul) {
	    String answer = "";
	    String k = "Kim";
	    
	    for (int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals(k)) {
				answer="김서방은 "+i+"에 있다";
				break;
			}
		}
	    
	    return answer;
	}

	public static void main(String[] args) {
		
		String[] seoul = {"Jane", "Kim"};
		L_12919 l = new L_12919();
		l.solution(seoul);
		
		
		
	}

}
