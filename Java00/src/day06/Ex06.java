package day06;

import java.util.Arrays;

/*
 	팩토리얼 10개를 저장할 배열을 만들고
	1부터 수차적으로 10까지의 팩토리얼을 만들어서 배열에 담고
	꺼내서 출력하세요
 */
public class Ex06 {

	public static void main(String[] args) {
		int[] no = new int[10];
		int tmp = 1;
		for(int i = 0; i < 10; i++) {
			for(int j = 1; j <= i + 1 ; j++) {
				tmp = j*tmp;
				
			}
			no[i] = tmp;
			tmp = 1;
		}System.out.println(Arrays.toString(no));

	}

}
