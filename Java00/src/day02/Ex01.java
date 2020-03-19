package day02;

import java.util.*;
public class Ex01 {
	/*
	2. 반지름이 7인 원의 넓의, 둘레를 계산해서 출력하세요.
			원의 둘레 : 2*반지름* 3.14
			원의 넓이 : 반지름 * 반지름 *3.14
	*/
	public static void main(String[] args) {
		//1. 입력받을 준비
		Scanner sc = new Scanner(System.in);
		//2. 메시제를 출력한다.
		System.out.print("반지름을 입력해주세요 : ");
		//3. 입력받은 데이터를 문자열변수에 담느다.
		int str = sc.nextInt();
		//	입력을 받은후 필요없으면 닫아준다.
		//4. 문자열 데이터를 정수로 변환한다
		//5. 변환된 정수를 계산한다.
		float result1 = 2* str+ 3.14f ;
		double result2 = str *= str * 3.14;
		//6. 계산결과를 출력한다.
		System.out.println("둘레는" + result1 + "입니다.");
		System.out.println("넓이는" + result2 + "입니다.");
	}
}
