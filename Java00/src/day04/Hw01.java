package day04;
/*
 	두 수를 입력받은 후
 	두 수의 최대공약수를 구해서 출력해주는 프로그램을 작성하세요
 	
 	최대공약수 : 두수를 나눌수 있는 최대수 
 */
import java.util.*;
public class Hw01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = 0;
	int b = 0;
	int c = 0;
	System.out.println(" 수 를 입력하세요");
	a = sc.nextInt();
	System.out.println("수 를 입력하세요");
	b = sc.nextInt();
	for(int i= 100 ; i >= 1; i--) {
		if (a % i == 0 && b % i == 0) {
			c = i;
			break;
		}
	}
	 System.out.println("최대공약수 = " + c + "입니다");
	}

	}


