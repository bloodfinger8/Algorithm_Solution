package codingtest;

import java.util.ArrayList;
import java.util.List;

public class L_12916 {

	boolean solution(String s) {
        boolean answer = true;
        String [] spel = s.split("");
        List<String> list = new ArrayList<String>();
        int pNum = 0;
        int yNum = 0;
        
        for (String string : spel) {
			list.add(string);
		}
        
        for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("y") || list.get(i).equals("Y")) {
				yNum++;
			}else if(list.get(i).equals("p") || list.get(i).equals("P")) {
				pNum++;
			}
		}
        
        if(yNum != pNum) {
        	return false;
        }
        
        
        return answer;
    }
	
	
	
	public static void main(String[] args) {
		L_12916 l = new L_12916();
		l.solution("pPoooyY");
	}

}
