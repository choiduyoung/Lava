package day04;
/*
 	
 	2 ~ 100 ������ ���� �Ҽ��� ������ִ� ���α׷��� �ۼ��ϼ���.
 	
 	�Ҽ� : 1�� �ڱ� �ڽ� ���θ� ������ �ִ¼�
 	comm]
 		�� ������ ����� ã�Ƴ� �Ҽ��� ������ �� �������� ����ϼ���.
 */
public class Hw03 {

	public static void main(String[] args) {
		int count =0;
		hyunwoo:
		
		for(int i =2 ; i <= 100; i++) {
			//������ �ִ¼��� �ִ��� �˻�
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					continue hyunwoo;
					
				}
			}
			//�� �ݺ����� ���� ������ ������ �ݺ�ó���� �ƴٸ� �� ���� �����Ұ��̰�
			//�� ���� ������ �ִ� ���� ���ٴ� ���̹Ƿ� 
			//�� ��(i)�� �Ҽ��� ���̴�.
			count++;
			System.out.print(i + ",");
		
		}
		System.out.println("�Ѱ���" + count);
	}

}
