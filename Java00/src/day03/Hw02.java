package day03;

public class Hw02 {
		public Hw02() {
			solv1();
		}
	//���ڸ� �����ϰ� ����� ���ڷ� �����ϰ� ���������� �ƴ��� �Ǻ��ϴ� �Լ�
	public void solv1() {
		// 1. 0~255���� ������ ���ڸ� �����
		int num = (int)(Math.random()*256); 
		// 2. ���ڷ� �����ϰ�
		char ch = (char)num;
		// 3. ���ڸ� �Ǻ��ؼ� ����ϰ�
		String msg = (ch >= 'A' && ch <= 'Z' ) ? 
									("���빮��") : 
										(
											(ch >= 'a' && ch <= 'z') ? ("���ҹ���") : ("�����ڰ� �ƴ�")	
												);
		// 4. ����ϰ�
			System.out.println("�����ϰ� �߻��� ���� [" + ch + "]�� [" + msg + "]�Դϴ�");
			
	}
	
	public static void main (String[] args) {
		new Hw02();
	}
}
