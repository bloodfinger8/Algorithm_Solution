package hash;

import java.util.Arrays;

public class hash_02 {
	
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        
        for(int i=0; i<phone_book.length-1; i++) {
        	boolean check = phone_book[i+1].startsWith(phone_book[i]);
        	if(check) {
        		answer = false;
        		break;
        	}
        }
        
        return answer;
    }
	
	
	
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		hash_02 h2 = new hash_02();
		
		System.out.println(h2.solution(phone_book));
	}

}
