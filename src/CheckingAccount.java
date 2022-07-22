package dio_digitalBank;

public class CheckingAccount extends Account {

	public CheckingAccount(Client client) {
		super(client);
	}

	@Override
	public void printStatement() {
		
		System.out.println("=== Bank Statement - Checking Account ===");
		super.commonInfos();
	}
	
}
