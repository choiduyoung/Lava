package day06;
/*
 	반지름 5개를 기억할 배열을 만들고
	각각의 2~30 반지름을 가진 원의 넓이를 계산해서 저장할 배열을 만들고
	각 원의 둘레를 계산해서 저장할 배열도 만들어서
	결과를 출력하는 프로그램을 작성하세요
	단, 출력형태는
		예] 반지름: 10, 원의 둘레  : 62.8, 원의넓의 : 314
	의 형태로 출력되게 하세요.
 */
public class Ex04 {
	public static void main(String[] args) {
		int[] no = new int[5];
		float[] no2 = new float[5];
		float[] no3 = new float[5];
		
		for(int i = 0 ; i < 5; i++) {
			int tmp = (int)(Math.random()*(30 - 2 + 1) + 2);
			no[i] = tmp;
			
		}
		for(int i = 0 ; i < 5; i++) {
			no2[i] = no[i] * 2 * 3.14f;
		}
		for(int i = 0 ; i < 5; i++) {
			no3[i] = no[i] * no[i] * 3.14f;
		}
		for(int i =0; i < 5; i++) {
		System.out.println("반지름[" + no[i] + "]원의둘레[" + no2[i] + "]원의넓이[" + no3[i]+"]");
		}
	}
}