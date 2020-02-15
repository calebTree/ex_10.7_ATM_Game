import java.util.Date;
public class Account {
	private int id = 0;
	private double balance = 0, annualInterestRate = 0;
	private Date dateCreated =  new Date();
	
	Account(){		
	}
	
	Account (int id){
		this.id = id;
		balance = 0;
	}
	
	//set start balance
	public void setBalance(int startBalance) {
		balance = startBalance;
	}
	
	// return ID
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	//return balance
	public double getBalance() {
		return balance;
	}
	
	//return annual interest rate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	//set annual interest rate
	public void setAnnualInterestRate(double interest) {
		annualInterestRate = interest / 100;		
	}
	
	//return date created
	public Date getDateCreated() {
		return dateCreated;
	}

	//return monthly interest rate
	public double getMonthlyInterestRate() {

		return annualInterestRate / 12;
	}
	
	//return monthly interest
	public double getMonthlyInterest() {

		return balance * getMonthlyInterestRate();
	}
	
	//withdraw
	public void withdraw(double withdraw) {
		balance -= withdraw;
	}
	
	//deposit
	public void deposit(double deposit) {
		balance += deposit;
	}	
}
