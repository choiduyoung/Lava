package day06;
/*
 	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
	이라는 배열을 준비하고
	79456원을 준비된 화폐단위로 계살할 때 각각의 화폐단위가 몇개씩 필요한지
	갯수를 저장할 배열을 만들고
	출력하는 프로그램을 작성하세요.
 */
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] cnt = new int[8];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int don = sc.nextInt();
		for(int i = 0; i < coin.length; i++) {
			cnt[i] = don /coin[i];
			don %= coin[i];
		}
		for(int i = 0 ; i<coin.length;i++) {
			System.out.println(coin[i] +" : " +cnt[i]);
		}
	}

}
