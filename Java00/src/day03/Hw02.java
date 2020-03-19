package day03;

public class Hw02 {
		public Hw02() {
			solv1();
		}
	//숫자를 랜덤하게 만들고 문자로 변경하고 영문자인지 아닌지 판별하는 함수
	public void solv1() {
		// 1. 0~255까지 랜덤한 숫자를 만들고
		int num = (int)(Math.random()*256); 
		// 2. 문자로 변경하고
		char ch = (char)num;
		// 3. 문자를 판별해서 출력하고
		String msg = (ch >= 'A' && ch <= 'Z' ) ? 
									("영대문자") : 
										(
											(ch >= 'a' && ch <= 'z') ? ("영소문자") : ("영문자가 아님")	
												);
		// 4. 출력하고
			System.out.println("랜덤하게 발생한 문자 [" + ch + "]는 [" + msg + "]입니다");
			
	}
	
	public static void main (String[] args) {
		new Hw02();
	}
}
