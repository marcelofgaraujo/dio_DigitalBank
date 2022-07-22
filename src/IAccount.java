package dio_digitalBank;

public interface IAccount {
	
	void cashWithdraw(double value);
	
	void cashDeposit(double value);
	
	void cashTransfer(double value, Account Destination);
	
	void printStatement();

}
