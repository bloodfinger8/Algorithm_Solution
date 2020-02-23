package prgrammers;

public class Jump {
	
	 public int solution(int n) {
	        int ans = 0;
	        int gijun = n;
	        
	        while(true) {
	        	if(gijun == 0) {
		        	break;
		        }
		        if(gijun%2 == 0) { //나머지가 0
		        	gijun = gijun/2;
		        }
		        if(gijun%2 == 1) { //나머지가 1
		        	gijun = gijun -1;
		        	ans++;
		        }
	        }
	        return ans;
	    }
	 
	public static void main(String[] args) {
		Jump j = new Jump();
		int a = j.solution(5);
		System.out.println();
		System.out.println(a);
	}

}
