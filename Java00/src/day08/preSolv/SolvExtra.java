package day08.preSolv;
/*
 	extra]
 		영문 문자열을 입력받아서
 		해당 알파벳이 출현하는 빈도를 저장하고
 		빈도를 * 로 표현하세요
 		"We are the World"
 		
 */
import javax.swing.*;
public class SolvExtra {

	public static void main(String[] args) {
		String str = "We are the World!";
		
		String tmp = "";
		
		loop:
		for(int i = 0; i < str.length(); i++) {
			char imsi = str.charAt(i);
			//tmp에 같은 문자가 있는지 검사하고 없으면 더해준다
			for(int j = 0; j < tmp.length(); j++) {
				if(imsi == tmp.charAt(j)) {
					continue loop;
				}
			}
			tmp = tmp + imsi;
		}
		
		
		int cnt = tmp.length();
/*
		loop:
		for(int i =0; i< str.length(); i++) {
			for(int j = 0; j < i; j++) {
				if(str.charAt(j) == str.charAt(i)) {
					continue loop;
				}
			}
			++cnt;
			*/
		
		// 2. 포함된 문자의 배열을 만들 수 있게 되었으므로 문자배열과 카운트 배열을 만든다.
		char[] ch = tmp.toCharArray();
		for(int i = 0 ; i < ch.length - 1; i++) {
			for(int j = i+1 ; j < ch.length; j++) {
				if(ch[i] > ch[j]) {
					char c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
				}
			}
		}
		int[] count = new int[cnt];
		// 문자 마다 출현하는 카운트를 구해준다.
		for(int i = 0 ; i < ch.length; i++) {
			char c = ch[i];
			for(int j = 0; j < str.length(); j++) {
				if(c == str.charAt(j)) {
					count[i] +=1;
				}
			}
		}
		//3.출력한다.
		for(int i = 0; i < ch.length ; i++) {
			System.out.printf("%3c :", ch[i]);
			for(int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
}
}				
			
			
	
	


