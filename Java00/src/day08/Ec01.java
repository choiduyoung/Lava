package day08;

import java.util.Arrays;

public class Ec01 {

	public static void main(String[] args) {
		// 2차 배열을 관리할 변수를 선언하고
		int[][] num;
		// 변수에 배열을 만들어서 기억 시키고
		num = new int[3][];
		
		num[0] = new int [3];
		num[1] = new int [5];
		num[2] = new int [7];
		
		//출력해본다.
		System.out.println(Arrays.deepToString(num));

	}

}
