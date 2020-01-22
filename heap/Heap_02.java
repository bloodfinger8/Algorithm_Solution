package heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Heap_02 {

	
	
	public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        Queue priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        int index = 0;
        for (int i = 0; i < k; i++) {
            if(index < dates.length && i == dates[index])
                priorityQueue.add(supplies[index++]);

            if(stock == 0) {
                stock += priorityQueue.poll();
                answer++;
            }
            stock -= 1;
        }
        return answer;
    }
	
	
	
	
	public static void main(String[] args) {
		
		int stock = 4; 
		int [] dates= {4,10,15} ;
		int [] supplies = {20,5,10};
		int k = 30;
		Heap_02 h2 =new Heap_02();
		System.out.println(h2.solution(stock, dates, supplies, k));
	}
}

class Overseas implements Comparable<Overseas>{
	public int date;
	public int supplie;
	
	public Overseas(int date , int supplie) {
		this.date = date;
		this.supplie = supplie;
	}

	public int getDate() {
		return date;
	}

	public int getSupplie() {
		return supplie;
	}

	@Override
	public int compareTo(Overseas o) {
		// TODO Auto-generated method stub
		if(this.date > o.getDate()) {
			return 1;
		}else if(this.date < o.getDate()) {
			return -1;
		}
		return 0;
	}
	
	
}