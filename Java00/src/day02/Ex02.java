package day02;

import java.util.*;
public class Ex02 {
/*
 	문제1]
  	3자리로 구성된 숫자 하나를 입력을 받은후  또는 랜덤하게 만든후 
 	백자리 이하를 버린 숫자를 만들어서 출력하세요.
 	예]
 		456 --> 400 으로
 		
 	문제2]
 		0~255 사이의 숫자를 랜덤하게만들고
 		그 숫자를 코드 값으로 하는 문자를 만들어서
 		해당 문자가 영문자 인지 아닌지 판별해서 출력하세요.
 		단 삼항 연산자를 사용해서 처리하세요.
 		
 	문제3]
 		화씨(Fahrenheit) 온도 100도는 
 		섭씨(Celcius) 온도 몇도인지 알아보는 프로그램을 작성하세요.
 		공식]
 		 	섭씨 온도는 = 5 / 9 x (화씨 온도 -32)
 	
 	문제4]
 		소수점이 있는 숫자를 입력한 후 
 		소수점 이하 세째자리에서 반올림한 결과를 출력하세요.
 		
 		원리]
 			+0.005을 하면 세째자리에서 변화가 일어날 것이고
 			여기에 x100 해주면 두째까지 정수부에 들어갈 것이고
 			이것을 정수로 바꾸면 원 숫자의 서째자리 이하는 버릴것이고
 			다시 / 100 을해주면  원 소수점 형태로 변환될 것이고..
 			
 	문제5]
 		랜덤한 숫자 10 ~ 99 사이의 숫자를 발생시킨후
 		그 숫자가 가까운 10의 배수 차를 출력하는 프로그램을 작성하세요.
 		예] 
 		45 는 50 과의 차가 5가 난다.
 		
 		53 은 50 과의 차가 3이 난다.
 		
 	문제6]
 		임의의 년도를 입력받아서
 		해당 년도가 윤년인지 평년이지 판별해서 출력해주는 프로그램을 작성하세요.
 		
 		단 삼항연산자를 사용해서 처리하세요.
 		윤년의 정의]
 			4로 나눠 떨어지고 100으로 나눠떨어지지 않으며
 			400으로 나눠 떨어지는 해를 윤년이라 한다.
 */
	// 기본 생성자 함수 정의
	public Ex02() {
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num,result;
		num = (int)(Math.random()*(999 - 1 + 1)) + 100;
		System.out.println("숫자를 입력하세요 : ");
		num = in.nextInt();
		result = (num/100)*100;
		System.out.println("결과 : " + result);
	
		for(int i = 0; i<=100; i++) {
		int num1 = (int)(Math.random()*(255 -0 +1)) +0;
		char ch = (char)num1;
		String str = (num1 >= 'A' && num1 <= 'Z')? ("영문대문자" + ch + "입니다."):
					(num1 >= 'a' && num1 <='z')? ("영문소문자" + ch + "입니다."): ("영문자가 아닙니다");
					System.out.println(str);
	}
			
				
	}

}


