package hash;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class hash_04 {
	
	
	
	public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i = 0; i < genres.length; i++) {
        	//같은 키가 존재한다면
            if (map.containsKey(genres[i])) {
                map.replace(genres[i], map.get(genres[i])+plays[i]);
            }else {
            	
                map.put(genres[i], plays[i]);
            }
        }
        
        
        
//        Map<String, HashMap<Integer, Integer>> map = new HashMap<String, HashMap<Integer, Integer>>();
//        HashMap<Integer, Integer> val = new HashMap<Integer, Integer>();
//        
//	    for (int i = 0; i < genres.length; i++) {
//	    	//같은 키가 존재한다면
//	    	if (map.containsKey(genres[i])) {
//	    		//val.put(i , plays[i]);
//	            map.replace(genres[i], val);
//	        }else {
//	        	val.put(i , plays[i]);
//				map.put(genres[i], val);
//	        }
//	    }
//	    
//	    System.out.println(map);
        
        
        
        
        
        
        return answer;
    }
	

	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		hash_04 h4 = new hash_04();
		System.out.println(h4.solution(genres, plays));
		
	}

}
