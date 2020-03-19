package day03;

public class Ex02 {
	public Ex02() {
		solv();
	}
	public void solv() {
		int no1 = 15;
		int no2 = (int)(Math.random()*(100 - 0 + 1)) + 0;
		int no3 = 0;
		
		if(no2 == 0) {
			no3 = 1;
		}else if(no2 % no1 == 0) {
			
		}else {
			no3 =(no2 / no1) +1;
		}
		System.out.println("게시글[" + no2 + "]게시판[" + no3 + "] 입니다");
	}
	
/*
 	문제1]
 		게시판에 글을 한페이지에 15개 글을 표시할 수 있다.
 		게시물의 갯수를 랜덤하게 (0~100) 발생한후
 		필요한 페이지 수를 계산해서 출력해주는 프로그램을 작성하세요
 		단, 게시물 수가 0인 경우는 1페이지가 필요한것으로 한다.
 */
	public static void main(String[] args) {
		new Ex02();
		
	}

}
