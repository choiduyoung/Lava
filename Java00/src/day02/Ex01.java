package day02;

import java.util.*;
public class Ex01 {
	/*
	2. �������� 7�� ���� ����, �ѷ��� ����ؼ� ����ϼ���.
			���� �ѷ� : 2*������* 3.14
			���� ���� : ������ * ������ *3.14
	*/
	public static void main(String[] args) {
		//1. �Է¹��� �غ�
		Scanner sc = new Scanner(System.in);
		//2. �޽����� ����Ѵ�.
		System.out.print("�������� �Է����ּ��� : ");
		//3. �Է¹��� �����͸� ���ڿ������� �����.
		int str = sc.nextInt();
		//	�Է��� ������ �ʿ������ �ݾ��ش�.
		//4. ���ڿ� �����͸� ������ ��ȯ�Ѵ�
		//5. ��ȯ�� ������ ����Ѵ�.
		float result1 = 2* str+ 3.14f ;
		double result2 = str *= str * 3.14;
		//6. ������� ����Ѵ�.
		System.out.println("�ѷ���" + result1 + "�Դϴ�.");
		System.out.println("���̴�" + result2 + "�Դϴ�.");
	}
}
