package codingtest;

import java.util.HashSet;

public class L_42839 {
	
	
	 public int solution(String numbers) {
		 int answer = 0;
		 HashSet<Integer> hs = new HashSet<Integer>(); //소수 저장
		 
		 String[] ch = numbers.split("");
		 int[] arr = new int[ch.length];
		 int k =0;
		 
		 for (String string : ch) {
			arr[k]=Integer.parseInt(string);
			k++;
		}
		
		
		 
	    for (int i = 1; i <= arr.length; i++) {
	    	permutation(arr, 0, arr.length, i, hs);
		}
	    System.out.println(hs);
	    answer = hs.size();
	     return answer;
	}
	 
	 
	 
	 static void permutation(int[] arr, int depth, int n, int r, HashSet<Integer> hs) {
	    if(depth == r) {
	    	String k = "";
	        for(int i=0; i<r; i++) {
	            //System.out.print(arr[i]);
	            k = k + arr[i];
	        }
	        //소수 판별
	        sosuCheck(Integer.parseInt(k),hs);
	        
	        return;
	    }
	 
	    for(int i=depth; i<n; i++) {
	        swap(arr, depth, i);
	        permutation(arr, depth + 1, n, r, hs);
	        swap(arr, depth, i);
	    }
	}
		 
	static void swap(int[] arr, int depth, int i) {
	    int temp = arr[depth];
	    arr[depth] = arr[i];
	    arr[i] = temp;
	}

	
	static void sosuCheck(int k , HashSet<Integer> hs) {
		int n = 2;
		//사용자의 입력값을 대상으로 
		//나눗셈 연산을 수행할 변수(1씩 증가 예정) 
		boolean flag=true; 
		//--소수다~!!!(check~!!!) 
		while(n<k) { 
			if(k%n==0) { 
				flag = false; //-- 소수가 아니다~!!! 
				break; 
			} 
			n++;
		}
		
		if(flag == true && k != 1 && k != 0) {
			System.out.println("소수 : " + k);
			hs.add(k);
		}else {
			System.out.println("소수아님 : " + k);
		}


	}
	 

	 
	 
	 
	public static void main(String[] args) {
		L_42839 l = new L_42839();
		l.solution("011");
	}

}
