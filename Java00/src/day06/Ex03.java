package day06;
/*
 	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
	�̶�� �迭�� �غ��ϰ�
	79456���� �غ�� ȭ������� ����� �� ������ ȭ������� ��� �ʿ�����
	������ ������ �迭�� �����
	����ϴ� ���α׷��� �ۼ��ϼ���.
 */
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] cnt = new int[8];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���");
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
