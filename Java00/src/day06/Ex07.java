package day06;
import java.util.*;


public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է¹ٶ�: ");
		String str = sc.nextLine();
		
		char[] ch = new char[10];
		
		for(int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
			System.out.print(" '"+ch[i]+"' | ");
		}
			
	}

}
