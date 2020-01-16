package stack_que;

import java.util.LinkedList;
import java.util.Queue;

public class sq_02 {

	//https://programmers.co.kr/learn/courses/30/lessons/42583
	//꽤 난이도
	
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 1;
        Queue<Object> comingTruckQue = new LinkedList<Object>();
        Queue<Object> waitingTruckQue = new LinkedList<Object>();
        //견딜수있는 무게
        int tot_weight = 0;
        
        //대기큐에 Truck 객체를 넣음
        for(int i=0; i<truck_weights.length; i++) {
        	Truck truck = new Truck();
        	truck.setMyWeight(truck_weights[i]);
        	truck.setTime(bridge_length);
        	
        	waitingTruckQue.offer(truck);
        }
        
        tot_weight += ((Truck) waitingTruckQue.peek()).getMyWeight();
        //comingQue에 대기큐의 peek() 객체를 집어넣는다. 
        comingTruckQue.offer(waitingTruckQue.poll());
        
        
        while(!comingTruckQue.isEmpty()) {
        	
        	for ( Object a : comingTruckQue) {
        		int k = ((Truck) a).getTime();
				((Truck) a).setTime(k-1);
			}
        	//다리위에 있는 시간이(bridge_length)이 지났다면
        	
        	if(((Truck) comingTruckQue.peek()).getTime() <= 0) {
        		tot_weight -= ((Truck) comingTruckQue.poll()).getMyWeight();
        	}
        	
        	if(!waitingTruckQue.isEmpty() && tot_weight + ((Truck) waitingTruckQue.peek()).getMyWeight() <= weight) {
        		tot_weight += ((Truck) waitingTruckQue.peek()).getMyWeight();
        		comingTruckQue.offer(waitingTruckQue.poll());
        	}
        	time++;
        	//System.out.println("번 확인"+time);
        }
        
        return time;
    }
	
		
	public static void main(String[] args) {
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
		
		sq_02 sq2 = new sq_02();
		System.out.println(sq2.solution(bridge_length, weight, truck_weights));
	}

}


