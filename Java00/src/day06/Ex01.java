package day06;

import java.util.Arrays;

/*
 	'A' ~ 'J' ������ ���ڸ� ���������� ����
	�迭�� �ְ� �� ���ڸ� �ϳ��� ������ �ҹ��ڷ� �����ϰ� 
	����ϼ���.
	
	�迭�� ��� ������ ���ڿ��� Ȯ���ؼ� ����ϼ���
 */
public class Ex01 {

	public static void main(String[] args) {
		char[] ch = new char[10];
		char[] ch1 = new char[10];
		char ch2 = 'A';
		char ch3 = 'a';
		
		for(int i = 0 ; i < ch.length; i++) {
			ch[i] = ch2;
			ch1[i] = ch3;
			ch2++;
			ch3++;
		}
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(ch1));
		System.out.println();

		
		
	}

}
