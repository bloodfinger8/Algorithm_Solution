package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_03 {
	//https://programmers.co.kr/learn/courses/30/lessons/42747
	
	public int solution(int[] citations) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        
        for (int a : citations) {
        	list.add(a);
		}
        //정렬
        Collections.sort(list);
        System.out.println(list);
        
        for (int i = 0; i < list.size(); i++) {
        	if(list.size()-i <= list.get(i)) {
        		answer = list.size()-i;
        		break;
        	}
				
		}
        
        
        return answer;
	}

	public static void main(String[] args) {
		int [] citations = {3, 0,  1};
		Sort_03 s3 = new Sort_03();
		System.out.println(s3.solution(citations));
		
		
	}

}
