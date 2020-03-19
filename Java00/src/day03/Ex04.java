package day03;

import java.util.Scanner;

/*
 	문제 3] 
 		부선 번호를 입력하면
 		부서이름을 출력해주는 프로그램을 작성하세요
 		
 		10 - 총무부
 		20 - 회계부
 		30 - 영업부
 		40 - 기술부
 		나머지 - 다음기회에...
 */
public class Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int no1 = 10;
		int no2 = 20;
		int no3 = 30;
		int no4 = 40;
		String st1 = "총무부";
		String st2 = "회계부";
		String st3 = "영업부";
		String st4 = "기술부";
		System.out.print("부서번호를 입력해주세요 : ");
		int no = in.nextInt();
/*		
		switch(no) {
		case 10 : 
			System.out.println(st1 +"입니다");
			break;
		case 20 : 
			System.out.println(st2 +"입니다");
			break;
		case 30 : 
			System.out.println(st3 +"입니다");
			break;
		case 40 : 
			System.out.println(st4 +"입니다");
			break;
		default :
			System.out.println("다음기회에");
*/			
		if(no == no1) {
			System.out.println("[" + st1 +"]입니다");
		}else if(no == no2) {
			System.out.println("[" + st2 + "]입니다");
		}else if (no == no3) {
			System.out.println("[" + st3 + "]입니다");
		}else if (no == no4) {
			System.out.println("[" + st3 + "]입니다" );
		}else {
			System.out.println("다음기회에");
		}
	}
}
	
