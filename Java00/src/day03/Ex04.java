package day03;

import java.util.Scanner;

/*
 	���� 3] 
 		�μ� ��ȣ�� �Է��ϸ�
 		�μ��̸��� ������ִ� ���α׷��� �ۼ��ϼ���
 		
 		10 - �ѹ���
 		20 - ȸ���
 		30 - ������
 		40 - �����
 		������ - ������ȸ��...
 */
public class Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int no1 = 10;
		int no2 = 20;
		int no3 = 30;
		int no4 = 40;
		String st1 = "�ѹ���";
		String st2 = "ȸ���";
		String st3 = "������";
		String st4 = "�����";
		System.out.print("�μ���ȣ�� �Է����ּ��� : ");
		int no = in.nextInt();
/*		
		switch(no) {
		case 10 : 
			System.out.println(st1 +"�Դϴ�");
			break;
		case 20 : 
			System.out.println(st2 +"�Դϴ�");
			break;
		case 30 : 
			System.out.println(st3 +"�Դϴ�");
			break;
		case 40 : 
			System.out.println(st4 +"�Դϴ�");
			break;
		default :
			System.out.println("������ȸ��");
*/			
		if(no == no1) {
			System.out.println("[" + st1 +"]�Դϴ�");
		}else if(no == no2) {
			System.out.println("[" + st2 + "]�Դϴ�");
		}else if (no == no3) {
			System.out.println("[" + st3 + "]�Դϴ�");
		}else if (no == no4) {
			System.out.println("[" + st3 + "]�Դϴ�" );
		}else {
			System.out.println("������ȸ��");
		}
	}
}
	
