package day09;
/*
 	1차원 배열에 정수 'A' ~ 'E' 까지 초기화 해주는 함수를 제작해서
 	전역 변수 ch에 초기화를 해주고
 	문자를 대문자을 입력하면 소문자로 반환해주는 함수를 만들어서
 	ch의 문자를 소문자로 모두 변경 하세요.
 	
 	심화 학습]
 		
 		문자 배열을 입력하면
 		문자배열을 'A' ~ 'E'초기화 해주는 기능을 가진 함수를 작성하고
 		실행해서 출력하세요. 
 */
public class Test03 {

	char[] ch;
	
	public Test03() {
		setCh();
		
		
		
		
		System.out.println();
		// 배열에 담긴 내용을 소문자로 변경해주자.
		for(int i = 0; i < ch.length; i++) {
			char d = ch[i];
			char e = toso(d);
			ch[i] = e;
		}
		for(char c : ch) {
			System.out.printf("%2c | " , c);
	}
	}
	// 문자배열  초기화 시키는 기능의 함수
	public void setCh() {
		ch = new char[5];
		for(int i = 0; i < 5; i++) {
			ch[i] = (char)('A' + i);
			
		}
	}
	// 대문자를 소문자로 반환해주는 함수
	public char toso(char d) {
		char result = (char)(d + ('a' - 'A'));
		return result;
	}
	
	
	public static void main(String[] args) {
		new Test03();
			
	}

}
