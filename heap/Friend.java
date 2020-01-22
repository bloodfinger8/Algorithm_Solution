package heap;

public class Friend implements Comparable<Friend> {
	String name;
	int location;
	
	public Friend(String name, int location) {
		this.name = name;
		this.location = location;
	}
	
	
	@Override
	public int compareTo(Friend bf) {
		if(this.location > bf.location) {
			return 1;
		}else if(this.location < bf.location) {
			return -1;
		}
		
		return 0;
	}

}
