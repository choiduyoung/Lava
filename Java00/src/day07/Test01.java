package day07;

import java.util.Arrays;

public class Test01 {
	
	
	
	public static void main(String[] args) {
		int[] num1 = {1, 2, 3, 4, 5};
		
		int[] num2 = num1; // ¾èÀº º¹»ç
		
//		float[] no = num1;
		
		num1[2] = 30;
		System.out.println("num1 : " + Arrays.toString(num1));
		System.out.println("num1 : " + Arrays.toString(num2));

	}

}
