package day07;

import java.util.Arrays;

/*
 	���ĺ� 10���� ������ �迭�� �����
	�빮�� 10���� �����ϰ� �����ؼ� �迭�� �����ϰ�
	����� �迭�� ���� ����� �����ؼ�
	����ϰ�
	���� �迭�� �ҹ��ڷ� ������ �� 
	�� �迭�� ����ϼ���.
 */
public class Ex01 {

	public static void main(String[] args) {
		char[] str = new char[10];
		char[] str2 = str;
		char ch1 = 'a'-'A';
		
		for(int i = 0; i < str.length ; i++ ) {
			char ch = (char) (Math.random() * ('Z' - 'A' + 1) + 'A');
				str[i] = ch;
		}
		System.out.println(Arrays.toString(str));
			
			for(int j =0; j < str2.length; j++) {
				str[j] += ch1;
      

		}
			System.out.println(Arrays.toString(str2));
		}
	}


