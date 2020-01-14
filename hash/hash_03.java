package hash;

import java.util.HashMap;
import java.util.Map;

public class hash_03 {
	
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i = 0; i < clothes.length; i++) {
        	//같은 키가 존재한다면
            if (map.containsKey(clothes[i][1])) {
                map.replace(clothes[i][1], map.get(clothes[i][1])+1);
            }else {
                map.put(clothes[i][1], 1);
            }
        }
        System.out.println(map);
        
        for (int value : map.values()) {
            answer*=(value+1);
        }
        answer-=1;
        
        return answer;
    }

	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		hash_03 h3 = new hash_03();
		System.out.println(h3.solution(clothes));
	}

}
