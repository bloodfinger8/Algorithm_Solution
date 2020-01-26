package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort_02 {

	
	public String solution(int[] numbers) {
		String answer = "";
        List<String> stringList = new ArrayList<>();
        
        
        for(int anInt : numbers) {
        	stringList.add(String.valueOf(anInt));
        }
        
        System.out.println("전 : " + stringList);
        //람다 사용시 한줄로 끝날수도 있다.
        //stringList.sort( (o1, o2) -> (o2+o1).compareTo(o1+o2) );
        
        stringList.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) { 
                    return o2.compareTo(o1); // order by num desc
                }
				
                String sum = o1 + o2;
                String reverseSum = o2 + o1;
 
                return reverseSum.compareTo(sum);
			}
		});
        
        System.out.println("후 : " + stringList);
        
        for(String s : stringList) {
        	answer+=s;
        }
        
        return answer.charAt(0) == '0' ? "0" : answer;
    }
	
	
	
	public static void main(String[] args) {
		int [] numbers = {3, 30, 34, 5, 9};
		
		Sort_02 s2 = new Sort_02();
		System.out.println(s2.solution(numbers));
				
	}

}
