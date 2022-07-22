package dio_digitalBank;

public class SavingsAccount extends Account {
	
	public SavingsAccount(Client client) {
		super(client);
	}

	@Override
	public void printStatement() {
		
		System.out.println("=== Bank Statement - Savings Account ===");
		super.commonInfos();
	}
	
}
