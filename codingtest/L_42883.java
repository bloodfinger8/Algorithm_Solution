package codingtest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class L_42883 {
	
	public String solution(String number, int k) {
        String answer = "";
        char[] result = new char[number.length() -k];
        Stack<Character> st = new Stack<Character>();
        
        for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);
			while (!st.isEmpty()   &&   st.peek() < c   &&   k-- > 0) { //st에 값이 있을때
				st.pop();
			}
			st.push(c);
		}
        
        System.out.println(st);
//		for (int i = 0; i < result.length; i++) {
//			result[i] = st.get(i);
//			System.out.print(result[i]);
//		}
		
        return new String(result);
    }
	
	
	
	

	public static void main(String[] args) {
		L_42883 l = new L_42883();
		l.solution("4177252841", 4);
	}

}
