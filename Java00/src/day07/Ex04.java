package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
         전화번호를 입력하면
 	'-'를 기준으로 데이터를 분리를 해서 
 	저장할 배열을 만들고 분리된 데이터를 순서에 맞게 입력하고 출력하세요.
 	indexOf()
 	substring()
 */
public class Ex04 {
	
	public static void main(String[] args) {
		String no = JOptionPane.showInputDialog("전화번호 를 입력하세요!");
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
