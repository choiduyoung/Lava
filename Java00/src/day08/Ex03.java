package day08;
/*
 	"Pengsoo Good!"
 	�̶�� ���ڿ��� �ѹ��ھ� ������
 	�迭�� �����ϰ�
 	�ϳ��� ������ ����ϼ���.
 */
public class Ex03 {

	public static void main(String[] args) {
		String str = "Pengsoo Good!";
		char[] ch1 = new char[str.length()];
		
		for(int i = 0; i< ch1.length; i++) {
			ch1[i] = (str.charAt(i));
			System.out.print(ch1[i] + " | ");
		}
		
		
	}

}
