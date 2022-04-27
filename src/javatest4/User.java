package javatest4;

public class User extends Person {
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public void printMember() {
		System.out.println("안녕하세요 회원정보 클래스입니다.");
	}

}
