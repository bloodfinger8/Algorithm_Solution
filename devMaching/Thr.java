package devMaching;

public class Thr {

	public int solution(int[][] office, int r, int c, String[] move) {
	      int answer = 0;
//	      int r2 = r;
//	      int c3 = c;
	      
	      
	      for (int i = 0; i < move.length; i++) { // move의 명령의 수까지
	    	  int mybot = office[r][c]; //이 값을 통해서 비교
	    	  
	    	  if("go".equals(move[i])) { // 현재 바라보고 있는 방향으로 한 칸 전진
	    		  
	    		  if(true) { //격자를 벗어나는 경우
	    			  
	    		  }else if() { //물건이 있는 경우
	    			  
	    		  }else { //문제 없는경우
	    			  answer += office[r][c];
	    			  office[r][c] = 0;
	    			  //r을 증가시킬지 c를 증가시킬지 방향을 통해서 결정
	    		  }
	    	  }else if("right".equals(move[i])) { //방향 전환 오른쪽으로
	    		  
	    	  }else if("left".equals(move[i])) { //방향 전환 왼쪽으로
	    		  
	    	  }
	      }
	      
	      
	      return answer;
	 }
	
	
	public static void main(String[] args) {
		int[][] office= {{5,-1,4},
						 {6,3,-1},
						 {2,-1,1}};
		String[] move = {"go","go","right","go","right","go","left","go"};
		
		Thr t = new Thr();
		t.solution(office, 1, 0, move);
	}

}
