package day06;
/*
   	피보나치 수열 10개를 저장할 배열을 만들고
	배열에 값을 입력해서
	배열에 저장된 데이터를 출력하세요
 */
public class Ex05 {

	public static void main(String[] args) {
		int[] no = new int[10];
		no[0]= 1;
		no[1]= 1;
		
		for(int i=2; i < no.length; i++) {
			 no[i] = no[i-1] + no[i-2];
		}
		for(int i = 0; i< no.length; i++) {
			System.out.print(no[i]+" ");
		}
	}

}
