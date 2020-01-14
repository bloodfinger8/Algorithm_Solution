package hash;

import java.util.HashMap;
import java.util.Map;

public class hash_01 {
	
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0; i<participant.length; i++) {
   
        	if(map.get(participant[i]) != null) {
        		map.put(participant[i], map.get(participant[i])+1);
        	}else {
        		map.put(participant[i], 1);
        	}
        }
//        System.out.println(map);
        
        for(int i=0; i<completion.length; i++ ) {
        	if(map.get(completion[i]) == null) {
        		answer = completion[i];
        		return answer;
        	}else {
        		map.put(completion[i], map.get(completion[i])-1);
        	}
        }
//        System.out.println(map);
        
        for(int i=0; i<participant.length; i++ ) {
        	if(map.get(participant[i]) == 1) {
        		answer = participant[i];
        		break;
        	}
        }
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		hash_01 h1 = new hash_01();
		String result =h1.solution(participant, completion);
		System.out.println(result);
		
	}

}
