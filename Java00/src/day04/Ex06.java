package day04;
/*
 	����5]199 -100 
 		1  - 2  + 3     - 4  + 5 -  6 . .  .. 
 		�̷��� ����� �� ��� ������� 100�� �Ѿ�� ó�� ���ڴ� ������ ������� �Բ�����ϼ���
 */

public class Ex06 {

	public static void main(String[] args) {
		int sum = 0;
		int s = 1;
		int num = 0; 
		System.out.println("dddd");
						
		for (int i = 1; sum < 100 ; i++) {
			num = i*s;
			s= -s;  
			sum += num;
		}
		
		System.out.println(num);
		System.out.println(sum);
	}	
}