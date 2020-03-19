package day04;
/*
 	문제5]199 -100 
 		1  - 2  + 3     - 4  + 5 -  6 . .  .. 
 		이렇게 계산을 할 경우 결과값이 100이 넘어가는 처음 숫자는 몇인지 결과값과 함께출력하세요
 */

public class Ex06 {

	public static void main(String[] args) {
		int sum = 0;
		int s = 1;
		int num = 0; 
		System.out.println("dddd");
						
		for (int i = 1; sum < 100 ; i++) {
			num = i*s;
			s= -s;  
			sum += num;
		}
		
		System.out.println(num);
		System.out.println(sum);
	}	
}