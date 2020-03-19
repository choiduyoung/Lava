package day06;

import java.util.Arrays;

/*
 	'A' ~ 'J' 까지의 문자를 순차적으로 만들어서
	배열에 넣고 각 문자를 하나씩 꺼내서 소문자로 변경하고 
	출력하세요.
	
	배열에 담긴 내용을 문자열로 확인해서 출력하세요
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
