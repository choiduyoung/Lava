package day04;
import java.util.*;
/*
 	���� 4] 
 	 5�ڸ� ������ �Է¹޾Ƽ� 
 	 �� ���ڰ� ȸ���� ���� �ƴ��� �Ǻ��ؼ� ����ϼ���
 	 
 	 ȸ������?
 	 	�տ��� ������ �ڿ��� ������ �Ȱ������� �Ѵ�.
 	 	12321 - ȸ����
 	 	12312 - ȸ���� �� �ƴ�
 	 ����]
 	 	���ڿ�.charAt(��ġ��) - ���ڿ��� Ư����ġ�� ���ڸ� ��ȯ���ִ� �Լ�
 	 	���ڿ�.toCharArray() - ���ڿ��� ���ڹ迭�� ��ȯ���ִ� �Լ�
 */
public class Ex05 {
public static void main(String[] args) {
	/*	
		System.out.println("abc".charAt(2));
		System.out.println("toCharArray(): "+"abc".toCharArray()[2] );
		*/
   Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
    int tmp = number;
    int result =0;
   
    while(tmp !=0) {
          result = result*10 + tmp % 10;
          tmp /= 10;
    }
   
    if(number == result)
          System.out.println( number + "�� ȸ���� �Դϴ�.");
    else
          System.out.println( number + "�� ȸ������ �ƴմϴ�.");
}


	}
/*
 		//�Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		//�޼��� ����ϰ�
		for(;;) {
		System.out.println("�ټ��ڸ� ���ڸ� �Է��ϼ���! :");
		//���ڿ��� �Է¹ް� ������ ���
		String msg = "ȸ����";
		String str = sc.nextLine();
		if(str.contentEquals("q")) break;
		//�ݺ��ؼ� ���ϰ�(12321) - >1, 2
		for(int i = 0; i < str.length() / 2; i++) {
		//���ڿ��� ���ڸ� ù ���ں��� ������  �ڿ��� ���� ���Ѵ�.
			if(str.charAt(i) == str.charAt((str.length() - 1) - i)) {
				//�̰��� �ι��ڰ� ���� ����̹Ƿ� �������ڸ� ������ ���ؾ߰ڴ�.
				continue;
			}
			// �� ���� �� ���ڰ� �ٸ� ����̹Ƿ� ȸ���簡 �ƴѰ���.
			msg = "ȸ������ �ƴϴ�";
			break;
		}
		System.out.println("�Է��� ����[" + str + "] �� [" + msg + "] �Դϴ�");
	}
		
	}
}

 */

