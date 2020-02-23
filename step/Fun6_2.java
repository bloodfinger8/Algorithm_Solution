package step;

public class Fun6_2 {

	public static void main(String[] args) {
		
		
		int temp =0; //임시저장
		int a =0; //100 자리
		int b =0; //10 자리
		int c = 0; //1의 자리
		int d=0;  //1000의 자
		int total=0;
		int count=0;
		
		for (int i = 1; i < 10000; i++) {
			for (int j = 1; j <i; j++) {
				temp=j;
				d=temp/1000;
				temp = temp - d*1000;
				a=temp/100; 
				temp = temp - a*100;
				b=temp/10;
				temp = temp - b*10;
				c = temp;
				
				total=d+a+b+c+j;
				
				if(total==i) {
					count++;
					break;   //브레이크의 중요성!!!
				}
			}
			if(count!=1) {
				System.out.println(i);
			}
			count=0;
		}
		
	}

}
