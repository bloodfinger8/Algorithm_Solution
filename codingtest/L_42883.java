package codingtest;

import java.util.LinkedList;
import java.util.List;

public class L_42883 {
	
	public String solution(String number, int k) {
        String answer = "";
        List<Integer> list = new LinkedList<Integer>();
        int retail = number.length()-k;
       
        String[] ch = number.split("");
		int[] arr = new int[ch.length];
		int j =0;
		 
		for (String string : ch) {
			arr[j]=Integer.parseInt(string);
			j++;
		}
		 
		permutation(arr, 0, arr.length, 2, list);
		list.sort(null);
		System.out.println(list.get(list.size()-1));
		
		System.out.println(list);
		answer = list.get(list.size()-1)+"";
        return answer;
    }
	
	
	static void permutation(int[] arr, int depth, int n, int r, List<Integer> list) {
	    if(depth == r) {
	    	String k = "";
	        for(int i=0; i<r; i++) {
	            k = k + arr[i];
	        }
	        list.add(Integer.parseInt(k));
	        return;
	    }
	 
	    for(int i=depth; i<n; i++) {
	        swap(arr, depth, i);
	        permutation(arr, depth + 1, n, r, list);
	        swap(arr, depth, i);
	    }
	}
		 
	static void swap(int[] arr, int depth, int i) {
	    int temp = arr[depth];
	    arr[depth] = arr[i];
	    arr[i] = temp;
	}
	
	

	public static void main(String[] args) {
		L_42883 l = new L_42883();
		l.solution("1924", 2);
	}

}
