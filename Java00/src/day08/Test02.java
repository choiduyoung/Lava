package day08;

import java.util.Arrays;

/*
 	�������� �̸� , ��ȭ��ȣ, �̸��� �� ������ �迭��
 	������ �迭�� ����� �����͸� �Է��ϰ� 
 	����ϼ���.
 */
public class Test02 {

	public static void main(String[] args) {
		// ���� 2���� �迭�� �����. ���̴� 3��¥�� ������ �迭�� ���̴�  6���� �Ѵ�.
		String[][] samTeam = {
				{"�ֵο�", "�����", "�ڱ�ȣ", "������","��ҿ�","�Ӽ���"},
				{"010-1111-1111","010-2222-2222","010-3333-3333",
				"010-4444-4444","010-5555-5555","010-6666-6666"},
				{"c@naver.com","j@naver.com","p@naver.com",
					"y@naver.com","k@naver.com","s@naver.com"}
	};
	String[] name =	{"�ֵο�", "�����", "�ڱ�ȣ", "������","��ҿ�","�Ӽ���"};
	String[] tel =	{"010-1111-1111","010-2222-2222","010-3333-3333",
					"010-4444-4444","010-5555-5555","010-6666-6666"};
	String[] mail =	{"c@naver.com","j@naver.com","p@naver.com",
					"y@naver.com","k@naver.com","s@naver.com"};
	
	String[][] team1 = new String[3][name.length];
	for(int i = 0; i <name.length; i++) {
		team1[0][i] = name[i];
		team1[1][i] = tel[i];
		team1[2][i] = mail[i];
	}
	
	String[][] teamOne = new String[3][];
	teamOne[0] = name;
	teamOne[1] = tel;
	teamOne[1] = mail;
	
	System.out.println(Arrays.deepToString(samTeam));
	System.out.println(Arrays.deepToString(team1));
	System.out.println(Arrays.deepToString(teamOne));
	}
	
}