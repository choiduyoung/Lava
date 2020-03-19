package day01;
/**
 *  클래스의정보를 담는 주석 이부분에 클래스의 설명을 작석하는게 원칙
 * @author 최두용
 *	@since 2020.03.09 (작성일 기입하는부분)
 *	@version v.1.0	(해당 클래스의 버젼을 지정하는부분)
 *	@see			(참고해야할 클래스들을 나열하는부분)
 *
 *		변경이력
 *			2020.03.09 - 클래스 제작  - 담당자 : 최두용
 */
public class Test04 {
	public static void main(String[] args) {
		/*
		 	java 의 주석처리
		 		1.// - 한행에 한해서 주석 처리하는 방버
		 			 // 이후의  내용을 주석으로 처리한다.
		 		2./**/ // <= 여러행을 주석처리하는방법, 기호 사이의 내용은 모두 주석처리
		/*
		 	증감연산자
		 		++, --
		 		: 변수에 붙여지면 붙여진 변수의 값을 1또는 -1 해준다
		 			기호 이후에 처음나오는 변수에 한해서 한번만
		 */
		int no1 = 10;
		int no2 = no1++ + ++no1;
		
		System.out.println("no2 : " + no2);
		
		/*
		 	문자열을 결합해주는 연산자는 +로 처리를한다.
		 */
		int num1 = 10;
		int num2 = ++num1 + num1++;
		System.out.println("num2 : " +num2);
	}
}
