package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Netman {

	
    public String[] solution(String[] card, String[] word) {
        String[] answer = {};
        boolean find = false;
        //체크된 라인 넣기 중복x 
        Set<Integer> set = new HashSet<Integer>();
        
        ArrayList<String> cardList = new ArrayList<>(Arrays.asList(card));
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(word));
        
        //System.out.println(wordList.get(2).length());
        
        //단어 갯수별로
        for (int i = 0; i < word.length; i++) {
        	//단어별로
        	for (int j = 0; j < word[i].length(); j++) {
        		//라인에서 찾기
        		for (int k = 0; k < 3; k++) {
        			String[] w = wordList.get(i).split("");
        			String[] c = card[k].split("");
        			
        			for (int l = 0; l < card[k].length(); l++) {
        				System.out.println(w[k] +"/" +c[l]);
						if(w[k].equals(c[l])) {
							set.add(k);
							//System.out.println(k);
							break;
						}
					}
				}
        		System.out.println("=====================");
        		//System.out.println( i + " / "+set);
    			set.clear();
			}
		}
        
        return answer;
    }
	
    
    public int solution2(int n) {
    	int ans = 0;
        for (int i=5; i<=n; i*=5) {
            ans += n/i;
        }
        System.out.println(ans);
        return ans;
    }
	
	
    public int[] solution3(int n, int[][] quests) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<Integer>();
        
        List<Order> list = new ArrayList<Netman.Order>();
        
        for (int i = 0; i < quests.length; i++) {
        	for (int j = 0; j < quests[i].length-1; j++) {
        		Order o = new Order(quests[i][j], quests[i][j+1]);
        		list.add(o);
			}
		}
        //선행이 없는것 부터 집어넣기
        for (int i = 1; i <= n; i++) {
        	int count=0;
        	for (int j = 0; j < list.size(); j++) {
            	if(list.get(j).getTarget() == i) {
            		count++;
            	}
			}
        	if(count == 0) {
        		answerList.add(i);
        	}
		}
        System.out.println("선행이 없는거 : "+answerList);
        
        //answerList안에 값이 선행인것을 집어넣기, 중복 주의
        for (int i = 0; i < answerList.size(); i++) {
        	for (int j = 0; j < list.size(); j++) {
        		if(answerList.get(i) == list.get(j).getFirst()) {
    				//target값이 중복이 되는지 체크
        			boolean check = false;
        			for (int j2 = j+1; j2 < list.size(); j2++) {
						if(list.get(j).getTarget() == list.get(j2).getTarget()) {
							if(answerList.contains(list.get(j2).getFirst())) {
								answerList.add( list.get(j2).getTarget() );
								check=true;
								
							}
						}
					}
        			if(!check) { //target이 같지않을떄
        				answerList.add(list.get(j).getTarget());
        			}
    			}
			}
		}
        System.out.println(answerList);
        
        return answer;
    }
    
    
    class Order{
    	private int first;
    	private int target;
    	
    	Order(int first , int target){
    		this.first = first;
    		this.target = target;
    	}

		public int getFirst() {
			return first;
		}
		public int getTarget() {
			return target;
		}
    	
    }
    
	
	public static void main(String[] args) {
		String[] card = {"ABACDEFG", "NOPQRSTU", "HIJKLKMM"};
		String[] word = {"GPQM", "GPMZ", "EFU", "MMNA"};
		Netman n = new Netman();
		n.solution(card, word);
		
//		n.solution2(10);
//		int[][] quests = {{1,3},
//						  {1,4},
//						  {3,5},
//						  {5,4}};	
//		n.solution3(5, quests);
		
	}

}
