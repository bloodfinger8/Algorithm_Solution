package prgrammers;

import java.util.HashSet;

public class English {
	public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        
        char wordEnd =words[0].charAt(words[0].length()-1);
        char wordStart;
        
        HashSet<String> hs = new HashSet<String>(); //단어 중복방지에 사용
        hs.add(words[0]); //첫번째 단어를 담는다.
        
        for(int i=1 ; i<words.length ; i++) {
        	hs.add(words[i]);
        	wordStart = words[i].charAt(0);
        	
        	//단어의 시작과끝이 다르거나 중복이 발생하는 경우
        	if(wordStart != wordEnd || hs.size() < i+1) { 
        		answer[0] = i % n + 1;
        		answer[1] = i / n + 1;
        		break;
        	}
        	wordEnd = words[i].charAt(words[i].length()-1);
        	
        }
        
        return answer;
    }

	public static void main(String[] args) {
		String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		
		English eng = new English();
		int[] answer = eng.solution(5, words);
		System.out.println(answer[0] +" "+ answer[1]);
	}

}
