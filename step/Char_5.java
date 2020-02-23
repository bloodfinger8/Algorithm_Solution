package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Char_5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int len = input.length();

		int [] arr = new int[26]; //알파벳의 숫자를 count해서 넣을거다

		for (int i = 0; i < len; i++) {  //문자의 대문자를 모두 소문자로 바꿔준다!
			int a = Character.toLowerCase(input.charAt(i)) - 'a';
			arr[a] += 1;
		}
		
		int max = -1;
        char answer = '?';
 
        for(int i=0; i<26; i++) {
        	
            if(arr[i] > max) {
                max = arr[i];
                answer = (char) (i+65);
            } else if(arr[i] == max) {
                answer = '?';
            }
        }
 
        System.out.println(answer);
		
		
		
		
		
		
	}

}
