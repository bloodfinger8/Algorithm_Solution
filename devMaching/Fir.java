package devMaching;

public class Fir {

	public int solution(String p, String s) {
		int answer = 0;
		String[] p2 = new String[p.length()];
		String[] s2 = new String[s.length()];
		
		p2 = p.split("");
		s2 = s.split("");
		
		for (int i = 0; i < s2.length; i++) {
			int p3 = Integer.parseInt(p2[i]);
			int s3 = Integer.parseInt(s2[i]);
			int calc = 0;
			
			calc = Math.abs(p3-s3);
			
			if(calc != 0) {
				if(calc > 10-calc) {
					answer += 10-calc;
				}else if(calc < 10-calc) {
					answer += calc;
				}
			}
		}
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		Fir f = new Fir();
		f.solution("82195", "64723");
	}

}
