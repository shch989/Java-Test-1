package javatest;

public class ch2Test {

	public static void main(String[] args) {

		ch2 Lee = new ch2();
		
		Lee.setId(7);
		Lee.setName("이순신");
		Lee.setDescription("조선 중기의 무신");
		Lee.setTest("1545년 4월 28일, 한성부");
		
		System.out.println(Lee.getId());
		System.out.println(Lee.getName());
		System.out.println(Lee.getDescription());
		System.out.println(Lee.getTest());
		
		System.out.println("=======================================");
		
		Lee.printMember();
		Lee.Info();
		
	}

}
