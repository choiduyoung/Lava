package day03;

import java.util.*;
public class Ex03 {

/*
 	���� 2]
 		���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
 		
 				�ڵ� 		�⺻���		�����
 		������	(1)		3800		245
 		�����	(2)		2400		157
 		������	(3)		2900		169
 		�����	(4)		3200		174
		������ = �⺻���� + ��뷮  * �����
		����� �ڵ� �� ��뷮�� �Է¹޾Ƽ� 
		�������� ������ִ� ���α׷��� �ۼ��ϼ���
 */
	public static void main(String[] args) {
		//�Է¹��� �غ��ϰ�
/*
		Scanner in = new Scanner(System.in);
		System.out.println("1.[������]");
		System.out.println("2.[�����]");
		System.out.println("3.[������]");
		System.out.println("4.[�����]");
		System.out.println("5.[�Ѻθ���]");
		System.out.println("[�ڵ尪�� �Է����ּ���]");
		int in2 = 0;
		
		int in4 = in.nextInt();
		System.out.println("��뷮�� �Է����ּ���");
		int in3 = in.nextInt();
*/
/*		
		switch(in4) {
		case 1 : 
			in2=3800 + in3 * 245;
			System.out.println("�̹��޿��[" + in2 +"]������Դϴ�");
			break;
		case 2 : 
			in2=2400 + in3 * 157;
			System.out.println("�̹��޿��[" + in2 +"]������Դϴ�");
			break;
		case 3 : 
			in2=2400 + in3 * 169;
			System.out.println("�̹��޿��[" + in2 +"]������Դϴ�");
			break;
		case 4 : 
			in2=2400 + in3 * 174;
			System.out.println("�̹��޿��[" + in2 +"]������Դϴ�");
			break;
		default :
			System.out.println("[�����Դϴ�]");
*/
		Scanner sc = new Scanner(System.in);
		
		int code = 0 ;
		System.out.print("�����ڵ带 �Է��ϼ���! :");
		code = sc.nextInt();
		
		int used = 0 ;
		System.out.print("��뷮�� �Է��ϼ���! :");
		used = sc.nextInt();
		
		int calc = 0;
		String yongdo = "������";
		
		if(code == 1) {
			calc = 3800 + used * 245;
		} else if(code == 2) {
			yongdo = "�����";
			calc = 2400 + used * 157;
		} else if(code == 3) {
			yongdo = "������";
			calc = 2900 + used * 169;
		} else if(code == 4) {
			yongdo = "�����";
			calc = 3200 + used * 174;
			
		}else {
			System.out.println("�ڵ尡 �߸��Ǿ����ϴ�. ��������մϴ�");
			return;
		}
		System.out.println("������ڵ�" + code + 
							"\n�뵵 :" + yongdo + 
							"\n��뷮" + used + "\n������" + calc);
	
	
	}
}