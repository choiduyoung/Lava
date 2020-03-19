package day03;
import java.util.*;

public class Hw06 {
	public Hw06() {
		solv();
	}
/*
 	문제 6]
 		임의의 년도를 입력받아서
 		해당 년도가 윤년인지 평년이지 판별해서 출력해주는 프로그램을 작성하세요.
 		
 		단 삼항연산자를 사용해서 처리하세요.
 		윤년의 정의]
 			4로 나눠 떨어지고 100으로 나눠떨어지지 않으며
 			400으로 나눠 떨어지는 해를 윤년이라 한다.
 */
	public void solv() {
		//1입력받을 준비하고
			Scanner sc = new Scanner(System.in);
		//2메시지 출력하고
			System.out.print("년도를 입력하세요 : ");
		//3입력한 숫자 변수에 담고
			int year = sc.nextInt();
		//4윤년인지 평년이지 판별하고
			String result = (year % 4 != 0) ? ("평년입니다") : 
				(year % 100 != 0) ? ("윤년입니다") : (
				(year % 400 == 0) ? "윤년" : "평년"
						);
		//5출력하고
				System.out.println("입력한 해[" + year + "] 는 [" + result +"] 입니다");
	}
	public static void main(String[] args) {
		new Hw06();

	}

}
