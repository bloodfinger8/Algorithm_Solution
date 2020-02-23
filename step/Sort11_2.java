package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Sort11_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		int[] arr = new int[input];
		int temp =0;
		for (int i = 0; i < input; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int j = 0; j < input - 1; j++) {
			for (int i = 0; i< arr.length - j-1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		
		for (int i = 0; i < input; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int input = Integer.parseInt(br.readLine());
//		int temp = 0;
//
//		int[] arr = new int[input];
//
//		for (int i = 0; i < input; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//
//		for (int i = 0; i < input - 1; i++) {
//			for (int j = i + 1; j < input; j++) {
//				if (arr[i] > arr[j]) {
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
//
//		for (int i = 0; i < input; i++) {
//			System.out.println(arr[i]);
//		}

	}

}
