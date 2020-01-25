package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Sort_01 {

//	https://programmers.co.kr/learn/courses/30/lessons/42748
	
	
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) { //행의 길이
        	List<Integer> list = new ArrayList<Integer>();
        	List<Integer> arrList = new ArrayList<Integer>();
        	
			for (int j = 0; j < commands[i].length; j++) { //열의 길이
				int a =commands[i][j];
				list.add(a);
			}
			//지정된 데이터를 가져와 정렬 후 k번째 값을 answer에 삽입한다.
			for (int j=list.get(0)-1; j < list.get(1); j++) {
				arrList.add(array[j]);
			}
			
			//정렬
			Collections.sort(arrList);
			
			answer[i]=arrList.get(list.get(2)-1);
			
		}

        
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		int [] array = {1,5,2,6,3,7,4};
		int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		Sort_01 s1 = new Sort_01();
		System.out.println(s1.solution(array, commands));
	}

}
