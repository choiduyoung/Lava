package day04;
/*
 	4�ڸ� ���ڷε� �⵵�� �Է¹޾Ƽ� 
 	�������� ������� �Ǵ��ؼ� ����ϼ���.
 	��, switch ~ case �������� ó���ϼ���
 */
import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		//�Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		//�޽��� ����ϰ�
		System.out.println("4�ڸ� �⵵ : ");
		//�Էƹް�
		int year = sc.nextInt();
		//�ڵ� �����
		int code = 0;
		String hae = "���";
		if(year % 400 ==0) {
			code = 3;
		}else if(year % 100 ==0 ) {
			code = 2;
		}else if(year % 4 == 0) {
			code = 1;
		}
			switch(code) {
			
			case 1 : 
					hae = "����" ;
					break;
			case 3 : 
					hae = "����";
					break;
			default :
			}
					System.out.println("�Է��� �⵵ [" + year + "] ��[" + hae + "");
			
						
		}

}
