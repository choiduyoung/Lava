package day03;

public class Ex02 {
	public Ex02() {
		solv();
	}
	public void solv() {
		int no1 = 15;
		int no2 = (int)(Math.random()*(100 - 0 + 1)) + 0;
		int no3 = 0;
		
		if(no2 == 0) {
			no3 = 1;
		}else if(no2 % no1 == 0) {
			
		}else {
			no3 =(no2 / no1) +1;
		}
		System.out.println("�Խñ�[" + no2 + "]�Խ���[" + no3 + "] �Դϴ�");
	}
	
/*
 	����1]
 		�Խ��ǿ� ���� ���������� 15�� ���� ǥ���� �� �ִ�.
 		�Խù��� ������ �����ϰ� (0~100) �߻�����
 		�ʿ��� ������ ���� ����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���
 		��, �Խù� ���� 0�� ���� 1�������� �ʿ��Ѱ����� �Ѵ�.
 */
	public static void main(String[] args) {
		new Ex02();
		
	}

}
