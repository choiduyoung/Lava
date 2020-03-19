package day03;

import java.util.*;
public class Ex03 {

/*
 	문제 2]
 		전기 요금을 계산하는 프로그램을 작성하세요.
 		
 				코드 		기본요금		사용요금
 		가정요	(1)		3800		245
 		산업용	(2)		2400		157
 		교육용	(3)		2900		169
 		상업용	(4)		3200		174
		전기요금 = 기본여금 + 사용량  * 사용요금
		사용자 코드 와 사용량을 입력받아서 
		전기요금을 계산해주는 프로그램을 작성하세요
 */
	public static void main(String[] args) {
		//입력받을 준비하고
/*
		Scanner in = new Scanner(System.in);
		System.out.println("1.[가정용]");
		System.out.println("2.[산업용]");
		System.out.println("3.[교육용]");
		System.out.println("4.[상업용]");
		System.out.println("5.[한부모가정]");
		System.out.println("[코드값을 입력해주세요]");
		int in2 = 0;
		
		int in4 = in.nextInt();
		System.out.println("사용량을 입력해주세요");
		int in3 = in.nextInt();
*/
/*		
		switch(in4) {
		case 1 : 
			in2=3800 + in3 * 245;
			System.out.println("이번달요금[" + in2 +"]사용요금입니다");
			break;
		case 2 : 
			in2=2400 + in3 * 157;
			System.out.println("이번달요금[" + in2 +"]사용요금입니다");
			break;
		case 3 : 
			in2=2400 + in3 * 169;
			System.out.println("이번달요금[" + in2 +"]사용요금입니다");
			break;
		case 4 : 
			in2=2400 + in3 * 174;
			System.out.println("이번달요금[" + in2 +"]사용요금입니다");
			break;
		default :
			System.out.println("[무료입니다]");
*/
		Scanner sc = new Scanner(System.in);
		
		int code = 0 ;
		System.out.print("구분코드를 입력하세요! :");
		code = sc.nextInt();
		
		int used = 0 ;
		System.out.print("사용량을 입렵하세요! :");
		used = sc.nextInt();
		
		int calc = 0;
		String yongdo = "가정용";
		
		if(code == 1) {
			calc = 3800 + used * 245;
		} else if(code == 2) {
			yongdo = "산업용";
			calc = 2400 + used * 157;
		} else if(code == 3) {
			yongdo = "교육용";
			calc = 2900 + used * 169;
		} else if(code == 4) {
			yongdo = "상업용";
			calc = 3200 + used * 174;
			
		}else {
			System.out.println("코드가 잘못되었습니다. 즉시종료합니다");
			return;
		}
		System.out.println("사용자코드" + code + 
							"\n용도 :" + yongdo + 
							"\n사용량" + used + "\n전기요금" + calc);
	
	
	}
}