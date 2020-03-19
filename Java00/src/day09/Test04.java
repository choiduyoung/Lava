package day09;

/*
 	반지름을 랜덤하게 발생해서
	그 반지름을 입력하면 
	원의 넓이를 구해주는 함수와
	원의 둘레를 구해주는 함수를 제작하고
	실행해서 출력하세요
 */
public class Test04 {
	
	public Test04() {
		
	}
	public int ban (int no1) {
	int no2 = (int)(Math.random()*(100 + 1 + 1) -1); 
		return no2;
	}
	
	public static void main(String[] args) {
		new Test04();

	}
}
