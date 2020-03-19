package day04;
/*
  	문제2]
  	 두 개의 주사위를 던저셔 합이 6이 되는 경우를 출력하세요.
 */
public class Ex03 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 6 ; i++ ) {
			for(int j = 1; j <=6 ; j++) {
				if(i+j==6)
					System.out.println(i+ "[ + ]" +j + "=[" + " 6입니다 " +"]");
			}
		}

	}

}
