package day07;

import java.util.Arrays;

/*
 	알파벳 10개를 저장할 배열을 만들고
	대문자 10개를 랜덤하게 추출해서 배열에 저장하고
	저장된 배열을 얕은 복사로 복사해서
	출력하고
	원래 배열을 소문자로 변경한 후 
	두 배열을 출력하세요.
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


