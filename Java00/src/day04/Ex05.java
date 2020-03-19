package day04;
import java.util.*;
/*
 	문제 4] 
 	 5자리 정수를 입력받아서 
 	 그 숫자가 회문수 인지 아닌지 판별해서 출력하세요
 	 
 	 회문수란?
 	 	앞에서 읽으나 뒤에서 읽으나 똑같은수라 한다.
 	 	12321 - 회문수
 	 	12312 - 회문수 가 아님
 	 참고]
 	 	문자열.charAt(위치값) - 문자열의 특정위치의 문자를 반환해주는 함수
 	 	문자열.toCharArray() - 문자열을 문자배열로 반환해주는 함수
 */
public class Ex05 {
public static void main(String[] args) {
	/*	
		System.out.println("abc".charAt(2));
		System.out.println("toCharArray(): "+"abc".toCharArray()[2] );
		*/
   Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
    int tmp = number;
    int result =0;
   
    while(tmp !=0) {
          result = result*10 + tmp % 10;
          tmp /= 10;
    }
   
    if(number == result)
          System.out.println( number + "는 회문수 입니다.");
    else
          System.out.println( number + "는 회문수가 아닙니다.");
}


	}
/*
 		//입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		//메세지 출력하고
		for(;;) {
		System.out.println("다섯자리 숫자를 입력하세요! :");
		//문자열로 입력받고 변수에 담고
		String msg = "회문수";
		String str = sc.nextLine();
		if(str.contentEquals("q")) break;
		//반복해서 비교하고(12321) - >1, 2
		for(int i = 0; i < str.length() / 2; i++) {
		//문자열중 문자를 첫 문자부터 꺼내서  뒤에서 부터 비교한다.
			if(str.charAt(i) == str.charAt((str.length() - 1) - i)) {
				//이경우는 두문자가 같은 경우이므로 다음문자를 꺼내서 비교해야겠다.
				continue;
			}
			// 이 경우는 두 문자가 다른 경우이므로 회문사가 아닌경우다.
			msg = "회문수가 아니다";
			break;
		}
		System.out.println("입력한 숫자[" + str + "] 는 [" + msg + "] 입니다");
	}
		
	}
}

 */

