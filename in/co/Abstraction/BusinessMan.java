package in.co.Abstraction;

public class BusinessMan implements Richman, SocialWorker{

	
	@Override
	public void earnMoney() {
		System.out.println("EarnMoney");
		
	}

	@Override
	public void donation() {
		System.out.println("Donation");
		
	}

	@Override
	public void party() {

		System.out.println("Party");
	}

	@Override
	public void HelptoOther() {
		System.out.println("Help to Other from Social Worker");
		
	}

}
