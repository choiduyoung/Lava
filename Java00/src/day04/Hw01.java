package day04;
/*
 	�� ���� �Է¹��� ��
 	�� ���� �ִ������� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���
 	
 	�ִ����� : �μ��� ������ �ִ� �ִ�� 
 */
import java.util.*;
public class Hw01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = 0;
	int b = 0;
	int c = 0;
	System.out.println(" �� �� �Է��ϼ���");
	a = sc.nextInt();
	System.out.println("�� �� �Է��ϼ���");
	b = sc.nextInt();
	for(int i= 100 ; i >= 1; i--) {
		if (a % i == 0 && b % i == 0) {
			c = i;
			break;
		}
	}
	 System.out.println("�ִ����� = " + c + "�Դϴ�");
	}

	}


