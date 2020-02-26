package codingtest;

import java.util.Stack;

public class L_42841 {
	
	//미완성...어떤부분이 잘못됐는지 체크가 안된다...
	public int solution(int[][] baseball) {
        int answer = 0;
        
        Stack<String> st=new Stack<>();
        
        //중복 없는 숫자 생성
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                for(int k=1;k<=9;k++){
                    if(i!=j&&j!=k&&k!=i){
                        st.push(String.valueOf(100*i+10*j+k));
                    }
                }
            }
        }
        
        
        while(!st.empty()) {
	        String[] mk = st.pop().split("");
	        int count=0; //4가 나오면 정답이 가능하다
	        
	        for (int i = 0; i < baseball.length; i++) { //4번
	        	String[] orginal = String.valueOf(baseball[i][0]).split(""); // {1,2,3} 할것
	        	int strike =0;
		        int ball = 0;
		        
	        	for (int t = 0; t < baseball[i].length; t++) { //3번
	        		for (int j = 0; j < orginal.length; j++) { //3번
						if(mk[t].equals(orginal[j])) {
							if(t==j) {
								strike++;
							}else {
								ball++;
							}
						}
					}
				}
//	        	System.out.print(mk[0]+mk[1]+mk[2]+ "-> 만든값 /");
//	        	System.out.println(baseball[i][1] +" : "+ strike +"///"+ baseball[i][2] +" : "+ ball);
	        	if(baseball[i][1] == strike && baseball[i][2] == ball) {
	        		count++;
	        	}
			}
	        if(count==4 ) {
	        	answer++;
	        }
	        
	        
        }
        System.out.println("dap : " + answer);
        
        
        
        return answer;
    }

	public static void main(String[] args) {
		//baseball의 각 행은 [세 자리의 수, 스트라이크의 수, 볼의 수] 를 담고 있습니다.
		int[][] baseball = {{123, 1, 1}, 
							{356, 1, 0}, 
							{327, 2, 0}, 
							{489, 0, 1}};
		
		L_42841 l  = new L_42841();
		l.solution(baseball);
		
		
	}

}
