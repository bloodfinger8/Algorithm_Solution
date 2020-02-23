package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Mnwise {
	
	public String solution(String num) {
		String answer = "";
		
		String k =num.substring(7, 8);
		if(k.equals("1")) {
			System.out.println("남자입니다.");
		}else {
			System.out.println("여자입니다.");
		}
		
		String k2 = num.replace("-", "");
		System.out.println(k2.length());
		
		String k3 = num.trim();
		System.out.println(k3.length());
		
		System.out.println("============================================");
		String str1 = "안녕하세요. ";
        String str2 = "벌써 여기까지 오셨네요. 끝까지 화이팅!!";

        System.out.println(str1.concat(str2));
        
		System.out.println(str2.indexOf("오"));
        
		
        
        return answer;
    }
	
	
	




	public static void main(String[] args) {
		String num = "940302-1232332";
		
		Mnwise m = new Mnwise();
		System.out.println(m.solution(num));
		
		
		
	}
}
