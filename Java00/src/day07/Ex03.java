package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 	ȸ���� �̸�, ��ȭ��ȣ, �̸����� ������ �迭�� �����
	�����͸� �Է��� ����
	�̸��� �Է��ϸ� 
	�� ����� �����͸� ��� ������ �迭�� ���� �����͸� �ְ� ����ϼ���
 */
public class Ex03 {

	public static void main(String[] args) {
		String[] str = {"�ֵο�", "�����", "�ڱ�ȣ", "������"};
		String[] str1 = {"010-1111-1111","010-2222-2222","010-3333-3333","010-4444-4444"};
		String[] str2 = {"c@naver.com","j@naver.com","p@naver.com","y@naver.com"};
		int idx = 5;
		String msg = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals(msg)) {
				idx = i;
			}
		}
		String[] str4 = {str[idx], str1[idx], str2[idx]};
		if(idx != 5) {
			
			
			JOptionPane.showMessageDialog(null,str4);
		}
//		System.out.println(Arrays.toString(str4))
		
		}
	

}
