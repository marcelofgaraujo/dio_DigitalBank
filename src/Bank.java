package dio_digitalBank;

import java.util.List;

public class Bank {

	private String name;
	private List<Account> Accounts;

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return Accounts;
	}

	public void setAccounts(List<Account> accounts) {
		Accounts = accounts;
	}
	
}
