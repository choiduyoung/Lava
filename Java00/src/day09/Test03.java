package day09;
/*
 	1���� �迭�� ���� 'A' ~ 'E' ���� �ʱ�ȭ ���ִ� �Լ��� �����ؼ�
 	���� ���� ch�� �ʱ�ȭ�� ���ְ�
 	���ڸ� �빮���� �Է��ϸ� �ҹ��ڷ� ��ȯ���ִ� �Լ��� ����
 	ch�� ���ڸ� �ҹ��ڷ� ��� ���� �ϼ���.
 	
 	��ȭ �н�]
 		
 		���� �迭�� �Է��ϸ�
 		���ڹ迭�� 'A' ~ 'E'�ʱ�ȭ ���ִ� ����� ���� �Լ��� �ۼ��ϰ�
 		�����ؼ� ����ϼ���. 
 */
public class Test03 {

	char[] ch;
	
	public Test03() {
		setCh();
		
		
		
		
		System.out.println();
		// �迭�� ��� ������ �ҹ��ڷ� ����������.
		for(int i = 0; i < ch.length; i++) {
			char d = ch[i];
			char e = toso(d);
			ch[i] = e;
		}
		for(char c : ch) {
			System.out.printf("%2c | " , c);
	}
	}
	// ���ڹ迭  �ʱ�ȭ ��Ű�� ����� �Լ�
	public void setCh() {
		ch = new char[5];
		for(int i = 0; i < 5; i++) {
			ch[i] = (char)('A' + i);
			
		}
	}
	// �빮�ڸ� �ҹ��ڷ� ��ȯ���ִ� �Լ�
	public char toso(char d) {
		char result = (char)(d + ('a' - 'A'));
		return result;
	}
	
	
	public static void main(String[] args) {
		new Test03();
			
	}

}
