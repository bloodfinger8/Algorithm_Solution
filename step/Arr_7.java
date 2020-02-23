package step;

import java.util.Scanner;

public class Arr_7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		String []arr = new String[input]; //크기가 input인 배열.
		String val;
		String dom; //한글자씩 담기
		String cnt; //O의 횟수를 체크
		int sum = 0 ;
		for (int i = 0; i <input; i++) {
			arr[i]=scan.next();
		}
		
		for (int i = 0; i < input-1; i++) {
			val =arr[i];
			for (int j = 0; j < arr.length; j++) {
				dom=val.substring(i,i+1);
				if(dom.equals("O")) {
					sum++;
				}
				
			}
			System.out.println(sum);
		}
	
		
		
		
		
	}

}
