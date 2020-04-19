package devMaching;

public class Thr {

	public int solution(int[][] office, int r, int c, String[] move) {
	      int answer = office[r][c];
	      office[r][c] = 0;
	      
	      int dir = 1; //동:2, 서:4, 남:3, 북:1 
	      int testR = r;
    	  int testC = c;
	      
			for (int i = 0; i < move.length; i++) { // move의 명령의 수까지
				if ("go".equals(move[i])) { // 현재 바라보고 있는 방향으로 한 칸 전진
					if (dir == 1) testR--;
					else if (dir == 2) testC++;
					else if (dir == 3) testR++;
					else if (dir == 4) testC--;
					System.out.println("r : " + testR + ", c : " + testC );
					if((testR >= 0 && testR < 3 && testC >= 0 && testC < 3)&&(office[testR][testC] != -1)) {
						r = testR ;
						c = testC ;
						answer += office[r][c];
						office[r][c] = 0;
					}else {
						testR = r;
						testC = c;
					}
				} else if ("right".equals(move[i])) { // 방향 전환 오른쪽으로
					// 방향 전환
					dir = dir % 4 + 1;
				} else if ("left".equals(move[i])) { // 방향 전환 왼쪽으로
					if(dir == 1) {
						dir = 4;
					}else {
						dir = (dir - 1) % 4;
					}
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
