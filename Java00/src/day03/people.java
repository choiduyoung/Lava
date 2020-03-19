package day03;

public class people {
	public people() {
		int no = 1001;
		String[] id = {"sung" , "han", "son","soo","jin"};
		String pw = "12345";
		String[] name = {"김성현","이한철","손은진","김수진","이진수"};
		String[] tel = {"010-1234-5678","010-2345-6789","010-9876-5432","010-1111-1111","010-0101-1101"};
		
		Member[] team1 = new Member[5];
		
		for(int i = 0; i < team1.length; i++) {
			
			team1[i] = new Member(no++, id[i], pw, name[i], tel[i]);
			
					}
		
		for(int i = 0; i < team1.length ; i++) {
			System.out.print(team1[i].name + "|");
		}
		System.out.println();
		System.out.println("---------------------------");
	}
	
	public static void main(String[] args) {
		new people();
	}
}
