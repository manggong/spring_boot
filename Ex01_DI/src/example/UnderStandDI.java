package example;

import java.util.Date;

class Member {
	String name;
	String nickname;
	
	// constructor private로 변경 시 강한 결합은 에러발생!!!
	public Member() {
		
	}
}


public class UnderStandDI {	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
	}
	
	public static void memberUse1() {
		// 강한 결합 
		Member m1 = new Member();
	}
	
	public static void memberUse2(Member m) {
		// 약한 결합 
		Member m2 = m;
	}
}
