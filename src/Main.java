package dio_digitalBank;

public class Main {

	public static void main(String[] args) {
		Client neymar = new Client();
		neymar.setName("neymar");
		
		Account ca = new CheckingAccount(neymar);
		Account sa = new SavingsAccount(neymar);
		
		ca.cashDeposit(500);
		ca.cashTransfer(250, sa);
		
		ca.printStatement();
		sa.printStatement();

	}

}
