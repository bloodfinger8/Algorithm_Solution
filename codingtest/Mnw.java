package codingtest;

import java.util.ArrayList;
import java.util.List;
public class Mnw {
	
	
	public void s1() {
		
	}
	
	public void s2(String k) {
		System.out.println("솔루션2===========");
		
		
		String[] a = new String[k.length()];
		for (int i = 0; i < k.length(); i++) {
			a[i]=k.substring(i, i+1);
		}
		
		int index=0;
		int count=1;
		
		for (index = 0; index < a.length-1; index++) {
			//System.out.println(":" + index);
			for (int i = index+1; i < a.length; i++) {
				//System.out.println("i의 값 : " + i);
				if(a[index].equals(a[i])) {
					count++;
					if(i == a.length-1 ) {
						System.out.print(a[index] + count);
						
						return;
					}
				}else if(!a[index].equals(a[i])) {
					if(i == a.length-1) {
						System.out.print(a[index] + count);
						System.out.print(a[i] + 1);
						return;
					}
					index = i-1;
					break;
				}
			}
			
			
			System.out.print(a[index] + count);
			count =1;
		}
		
		
	}
	
	public void s3(String a, String b) {
		//String[] k = a.split(",", 0);
		String k =a.replace(".", "");
		String k2 =b.replace(".", "");
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for (int i = 0; i < k.length(); i++) {
			list.add(Integer.parseInt(k.substring(i, i+1)));
		}
		
		for (int i = 0; i < k2.length(); i++) {
			list2.add(Integer.parseInt(k2.substring(i, i+1)));
		}
		
		for (int i = 0; i < list.size(); i++) {
			 if(list2.get(i) > list.get(i)) {
				 System.out.println(list + "<" + list2);
				 break;
			 }else if(list2.get(i) < list.get(i)) {
				 System.out.println(list + ">" + list2);
				 break;
			 }
			 
		}
		
		
	}
	
	public int s4(int k) {
		//!12 의 결과값의 마지막 값에 0이 몇개가 출력되는가? 
		int count=0;
		long total = 1;
		
		for (int i = 1; i <= k; i++) {
			total *= i;
		}
		
		//변환 int -> String
		String change = Long.toString(total);
		System.out.println(change);
		
		int i =change.length()-1;
		
		while (true) {
			if(change.substring(i,i+1).equals("0")) {//문자열 맨뒤가 0이면
				count++;
			}else {//맨뒤가 0이 아니면
				break;
			}
			i--;
		}
		
		System.out.println("0의 개수는" + count);
		return count;
	}
	
	

	public static void main(String[] args) {
		Mnw m = new Mnw();
		m.s1();
		m.s2("aaaaavvvvdd");
		System.out.println();
		m.s3("0.5.3" , "0.7");
		m.s4(20);
	}

}

