package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
         ��ȭ��ȣ�� �Է��ϸ�
 	'-'�� �������� �����͸� �и��� �ؼ� 
 	������ �迭�� ����� �и��� �����͸� ������ �°� �Է��ϰ� ����ϼ���.
 	indexOf()
 	substring()
 */
public class Ex04 {
	
	public static void main(String[] args) {
		String no = JOptionPane.showInputDialog("��ȭ��ȣ �� �Է��ϼ���!");
		int no1 = no.indexOf('-');
		String str = no.substring(0,no1);
		int no2 = no.indexOf('-',no1 +1);
		String str1 = no.substring(no1+1,no2);
		
		String str2 = no.substring(no2+1);
		
		String[] all = new String[3];
		all[0]= str;
		all[1]= str1;
		all[2]= str2;
		JOptionPane.showMessageDialog(null,all);
	}
}
