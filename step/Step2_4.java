package step;

import java.util.Scanner;

public class Step2_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		
		if(b>=45) {
			b= b-45;
		}else if(b<45) {
			a = a-1;
			b = b+15;
			if(a<0) {
				a= a+24;
			}
		}
		System.out.println(a +" " + b);
		
	}

}
