package day03;

public class Member {
	int mon;
	String mid;
	String mtpw;
	String name;
	String tel;
	
	public Member() {
		
	}
	public Member(int mno, String mid,String mtpw,
					String name,String tel) {
		this.mon=mon; 
		this.mid=mid;
		this.mtpw=mtpw;
		this.name=name;
		this.tel=tel;
		
	}
	public void abc() {
		Member memb = new Member();
		memb.mon = 7000;
		memb.mid = "KING";
		memb.mtpw = "12345";
		memb.name = "KING";
		
		Member m2 = new Member(7001,"sung", "12345", "김성현","010-8787-8787");
		
		System.out.println("7000번 이름 : " + memb.name);
		System.out.println("7000번 이름 : " + m2.name);
		
	}
	public static void main(String[] args) {
		new Member(); 
	
}
}	
