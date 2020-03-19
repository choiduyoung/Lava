package day04;
/*
  	문제3]
  		2x + 4y = 10의 방정식의 결과를 출력하세요.
  		단, x,y는 모두 0 이상  10 이하 사이의 정수
 */
public class Ex04 {

	public static void main(String[] args) {
		for(int i = 0; i <  11; i++) {
			for(int j = 0; j < 11; j++) {
				if(2*i + 4*j == 10) {
					System.out.println("x = " + i +  "y ="+  j );
				}
			}
		}
	}
}
