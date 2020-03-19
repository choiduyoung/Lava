package day07;

import java.util.Arrays;

/*
 	정수 10개를 저장할 배열을 만들고
	랜덤하게 정수를 1 ~ 50까지 수중 발생시켜서 
	배열에 담고 
	배열의 5번째까지의 데이터를 깊은 복사로 복사하세요
 */
public class Ex02 {

	public static void main(String[] args) {
		int[] no = new int[10];
		int[] no2 = new int[10];
		
		for(int i = 0; i < 10; i++) {
		int no1 = (int)(Math.random() * (50 - 1 + 1) + 1);
			no[i] = no1;
	}
		System.arraycopy(no, 0, no2, 0, 5);

		System.out.println(Arrays.toString(no2));
}
}
