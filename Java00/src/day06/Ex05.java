package day06;
/*
   	�Ǻ���ġ ���� 10���� ������ �迭�� �����
	�迭�� ���� �Է��ؼ�
	�迭�� ����� �����͸� ����ϼ���
 */
public class Ex05 {

	public static void main(String[] args) {
		int[] no = new int[10];
		no[0]= 1;
		no[1]= 1;
		
		for(int i=2; i < no.length; i++) {
			 no[i] = no[i-1] + no[i-2];
		}
		for(int i = 0; i< no.length; i++) {
			System.out.print(no[i]+" ");
		}
	}

}
