package day04;
/*
 	
 	2 ~ 100 사이의 수중 소수만 출력해주는 프로그램을 작성하세요.
 	
 	소수 : 1관 자기 자신 으로만 나눌수 있는수
 	comm]
 		위 문제의 결과로 찾아낸 소수의 갯수를 맨 마지막에 출력하세요.
 */
public class Hw03 {

	public static void main(String[] args) {
		int count =0;
		hyunwoo:
		
		for(int i =2 ; i <= 100; i++) {
			//나눌수 있는수가 있는지 검사
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					continue hyunwoo;
					
				}
			}
			//위 반복문이 정상 적으로 끝까지 반복처리가 됐다면 이 행을 실행할것이고
			//그 말은 나눌수 있는 수가 없다는 말이므로 
			//이 수(i)는 소수일 것이다.
			count++;
			System.out.print(i + ",");
		
		}
		System.out.println("총갯수" + count);
	}

}
