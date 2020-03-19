package day04;
/*
 	4자리 숫자로된 년도를 입력받아서 
 	윤년인지 평년인지 판단해서 출력하세요.
 	단, switch ~ case 구문으로 처리하세요
 */
import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		//입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		//메시지 출력하고
		System.out.println("4자리 년도 : ");
		//입렵받고
		int year = sc.nextInt();
		//코드 만들고
		int code = 0;
		String hae = "평년";
		if(year % 400 ==0) {
			code = 3;
		}else if(year % 100 ==0 ) {
			code = 2;
		}else if(year % 4 == 0) {
			code = 1;
		}
			switch(code) {
			
			case 1 : 
					hae = "윤년" ;
					break;
			case 3 : 
					hae = "윤년";
					break;
			default :
			}
					System.out.println("입력한 년도 [" + year + "] 는[" + hae + "");
			
						
		}

}
