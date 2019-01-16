package com.qa;
import java.util.HashMap;
import java.util.Map;


public class AccountManagement {
// private Map<Account,Integer> accounts;
private Map< Integer,Account> accounts;

	public AccountManagement() {
	accounts = new HashMap< Integer,Account>(); 
		    //  accounts.put(account, account.getAccountNo());     
	}

	
	public void addAccount(Account account){
	 
	accounts.put(account.getAccountNo(),account);
	 
	}
	
	public Account viewAccount(int accountID) {
		Account account = accounts.get(accountID);
			return account;
		}
	public Map< Integer,Account> viewMap(){
		
		return accounts;
	}
		
	}
	

