package day06;
import java.util.*;


public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력바람: ");
		String str = sc.nextLine();
		
		char[] ch = new char[10];
		
		for(int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
			System.out.print(" '"+ch[i]+"' | ");
		}
			
	}

}
