package dio_digitalBank;

public abstract class Account implements IAccount {
	
	protected int agency;
	protected int number;
	protected double balance;
	protected Client client;
	
	private static final int DEFAULT_AGENCY = 0001;
	private static int SEQUENTIAL = 1;

	public Account(Client client) {
		this.agency = DEFAULT_AGENCY;
		this.number = SEQUENTIAL++;
		this.client = client;
	}

	@Override
	public void cashWithdraw(double value) {
		balance -= value;
	}

	@Override
	public void cashDeposit(double value) {
		balance += value;
	}

	@Override
	public void cashTransfer(double value, Account destinationAccount) {
		this.cashWithdraw(value);
		destinationAccount.cashDeposit(value);
	}
	
	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	protected void commonInfos() {
		System.out.println(String.format("Client = " + this.client.getName()));
		System.out.println(String.format("Agency = %d", this.agency));
		System.out.println(String.format("Number = %d", this.number));
		System.out.println(String.format("Balance = %.2f", this.balance));
	}

}
