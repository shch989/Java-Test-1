package javatest4;

public class UserTest {

	public static void main(String[] args) {

		User Lee = new User();
		
		Lee.printMember(); // 회원
		
		Admin Kim = new Admin();
		
		Kim.printMember(); // 관리자
		
//		Lee.setName("이순신");
//		System.out.println(Lee.getName());
		
	}

}
