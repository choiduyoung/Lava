package day07;

import java.util.Arrays;

/*
 	���� 10���� ������ �迭�� �����
	�����ϰ� ������ 1 ~ 50���� ���� �߻����Ѽ� 
	�迭�� ��� 
	�迭�� 5��°������ �����͸� ���� ����� �����ϼ���
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
