package day06;
/*
 	������ 5���� ����� �迭�� �����
	������ 2~30 �������� ���� ���� ���̸� ����ؼ� ������ �迭�� �����
	�� ���� �ѷ��� ����ؼ� ������ �迭�� ����
	����� ����ϴ� ���α׷��� �ۼ��ϼ���
	��, ������´�
		��] ������: 10, ���� �ѷ�  : 62.8, ���ǳ��� : 314
	�� ���·� ��µǰ� �ϼ���.
 */
public class Ex04 {
	public static void main(String[] args) {
		int[] no = new int[5];
		float[] no2 = new float[5];
		float[] no3 = new float[5];
		
		for(int i = 0 ; i < 5; i++) {
			int tmp = (int)(Math.random()*(30 - 2 + 1) + 2);
			no[i] = tmp;
			
		}
		for(int i = 0 ; i < 5; i++) {
			no2[i] = no[i] * 2 * 3.14f;
		}
		for(int i = 0 ; i < 5; i++) {
			no3[i] = no[i] * no[i] * 3.14f;
		}
		for(int i =0; i < 5; i++) {
		System.out.println("������[" + no[i] + "]���ǵѷ�[" + no2[i] + "]���ǳ���[" + no3[i]+"]");
		}
	}
}