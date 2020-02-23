package stack_que;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class sq_04 {
	
	//https://programmers.co.kr/learn/courses/30/lessons/42587
	
	public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Order> que = new LinkedList<Order>();
        ArrayList<Order> list = new ArrayList<Order>();
        //객체 저장
        for (int i = 0; i < priorities.length; i++) {
        	Order or = new Order(priorities[i], i);
        	list.add(or);
        	que.offer(or);
		}
        //첫번째 값을 가지고 온다
        while (que.size() >0) {
			
	        int check = que.peek().getData();
	        
	        //배열의 최댓값을 가지고 온다
	        int max = list.get(0).getData();
	        for (int i = 0; i < list.size(); i++) {
	        	if(max<list.get(i).getData()) {
	            	//max의 값보다 array[i]이 크면 max = array[i]
	            	max = list.get(i).getData();
	            }
			}
	        //System.out.println("max 의 값 ? " + max);
	        //최댓값이 첫번째 꺼내온 값보다 클때 맨뒤로 배치
	        if(max > check) {
	        	Order a = que.peek();
	        	que.offer(que.poll());
	        	
	        	list.remove(0);
	        	list.add(a);
	        //location의 값이 같고 , 더 크면
	        }else if(location == que.peek().getIndex()){
	        	que.poll();
	        	answer++;
	        	break;
	        }else {
	        	list.remove(0);
	        	que.poll();
	        	answer++;
	        }
        }
        
        return answer;
    }
	
	
	
	class Order{
		public int data;
		public int index;
		
		public Order(int data, int index) {
			this.data = data;
			this.index = index;
		}
		
		public int getData() {
			return data;
		}
		public int getIndex() {
			return index;
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		int location = 2;
		
		sq_04 sq4 = new sq_04();
		System.out.println(sq4.solution(priorities, location));
		
	}

}
