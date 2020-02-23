package prgrammers;

public class Sosu {
	
	public int solution(String numbers) {
        String[] array_word; // 스트링을 담을 배열
        int answer = 0;
        array_word = numbers.split(""); //배열에 한글자씩 저장하기

        for(int i=0; i<array_word.length; i++) {
        	int arr = Integer.parseInt(array_word[i]);
            int k = (int)Math.sqrt(arr);
            
            
            for(int j = 2; j <= k; j++) {
               if( arr%j == 0) {
                   break;
               } else {
            	   answer++;
               }
            }
            
            
        }
        return answer;
    }

	public static void main(String[] args) {
		Sosu so = new Sosu();
		int a =so.solution("23");
		System.out.println("a : " + a);
	}

}
