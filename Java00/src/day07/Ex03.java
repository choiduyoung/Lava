package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 	회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고
	데이터를 입력해 놓고
	이름을 입력하면 
	그 사람의 데이터를 모두 저장할 배열을 만들어서 데이터를 넣고 출력하세요
 */
public class Ex03 {

	public static void main(String[] args) {
		String[] str = {"최두용", "정우승", "박광호", "유태희"};
		String[] str1 = {"010-1111-1111","010-2222-2222","010-3333-3333","010-4444-4444"};
		String[] str2 = {"c@naver.com","j@naver.com","p@naver.com","y@naver.com"};
		int idx = 5;
		String msg = JOptionPane.showInputDialog("이름을 입력하세요");
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
