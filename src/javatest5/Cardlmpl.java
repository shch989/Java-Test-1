package javatest5;

public class Cardlmpl implements Card {

	@Override
	public void getCardId() {
		System.out.println("CardId 출력");
	}

	@Override
	public void getCardName() {
		System.out.println("CardName 출력");		
	}

	@Override
	public void getCardDescription() {
		System.out.println("CardDescription 출력");		
	}

	@Override
	public void printCard() {
		System.out.println("All Card Info 출력");		
	}

}
