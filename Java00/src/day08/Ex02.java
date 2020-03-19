package day08;
/*
  구구단 프로그램 출력
 */
public class Ex02 {

	public static void main(String[] args) {
		int[][] gu = new int[10][10];
		
		for(int i = 2; i< gu.length; i++) {
				System.out.println("---------");
			for(int j = 1; j < gu.length; j++) {
					gu[i][j] = i * j;
					System.out.println(i+" X " + j + " = " + i*j);
				
			}
			
		}

	}

}
