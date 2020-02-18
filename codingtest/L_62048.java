package codingtest;

public class L_62048 {
	
	public long solution(int w,int h) {
		long answer = Long.parseLong(String.valueOf(w)) * Long.parseLong(String.valueOf(h));
		long val1,val2;
        long r=1;
        
        val1 = Long.parseLong(String.valueOf(w));
        val2 = Long.parseLong(String.valueOf(h));
     
        long tmp1=val1;
        long tmp2=val2;//최소공배수를 구하기 위해 입력받은 값 저장
        if(val1<val2){//2번째 입력수가 클 경우 큰수를 val1으로 변경
            val1 = tmp2;
            val2 = tmp1;
         }
 
         while(r>0){
             r = val1 % val2;
             val1 = val2;
             val2 = r;
         }
        
         //최대공약수
        //System.out.println(val1);
         
        long val3 = w / val1;
        long val4 = h / val1;
        long k = val1 * (val3 + val4 - 1);
        answer = answer-k;
        System.out.println("dap : " + answer);
		return answer;
	}
	
	public static void main(String[] args) {
		int w = 10000000;
		int h = 10000000;
		L_62048 l = new L_62048();
		l.solution(w, h);
		
	}

}
