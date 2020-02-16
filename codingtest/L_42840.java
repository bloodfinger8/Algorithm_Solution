package codingtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class L_42840 {
	
	public int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();
        //답안지 1,2,3,4,5 
        
//        1번 - 1, 2, 3, 4, 5
//        2번 - 2, 1, 2, 3, 2, 4, 2, 5
//        3번 - 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
        int[] test1 = {1,2,3,4,5};
        int[] test2 = {2,1,2,3,2,4,2,5};
        int[] test3 = {3,3,1,1,2,2,4,4,5,5};
        int count1=0;
        int count2=0;
        int count3=0;
        
        for (int i = 0; i < answers.length; i++) {
			
        	if(answers[i] == test1[i]) {
        		hs.add(1);
        		count1++;
        	}else if(answers[i] == test2[i]) {
        		hs.add(2);
        		count2++;
        	}else if(answers[i] == test3[i]) {
        		hs.add(3);
        		count3++;
        	}
        	
		}
        if(hs.size() == 0) {
        	hs.add(1);
        	hs.add(2);
        	hs.add(3);
        }
        answer = new int[hs.size()];
        List hsList = new ArrayList(hs);
        
        if(count1 == count2 && count1 == count3 && count2 == count3){
        	Collections.sort(hsList);
        }
        
        for (int i = 0; i < hsList.size(); i++) {
         	answer[i]=(int) hsList.get(i);
 		}
       
        //System.out.println(hsList);
        return answer;
    }
	
	

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		
		L_42840 l_42840 = new L_42840();
		
		l_42840.solution(answers);
	}

}
