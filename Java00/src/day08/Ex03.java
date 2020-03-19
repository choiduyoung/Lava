package day08;
/*
 	"Pengsoo Good!"
 	이라는 문자열을 한문자씩 꺼내서
 	배열로 저장하고
 	하나씩 꺼내서 출력하세요.
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
