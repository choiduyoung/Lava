package day06;

import java.util.Arrays;

/*
 	���丮�� 10���� ������ �迭�� �����
	1���� ���������� 10������ ���丮���� ���� �迭�� ���
	������ ����ϼ���
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
