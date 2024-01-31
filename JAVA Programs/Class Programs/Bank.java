import java.lang.*;
class BankAccount{
	private String name;
	private int acc_num;
	private String acc_type;
	private double acc_balance;
	
	//Initializing variables with the help of constructor
	BankAccount(String name,int acc_num,String acc_type,double acc_balance){
		this.name = name;
		this.acc_num = acc_num;
		this.acc_type = acc_type;
		this.acc_balance = acc_balance;
	}
	
	//Initializing variables with the help of Method
	public void initialValues(String name,int acc_num,String acc_type,double acc_balance){
		this.name = name;
		this.acc_num = acc_num;
		this.acc_type = acc_type;
		this.acc_balance = acc_balance;
	}
	
	//Method for deposit
	public void depositAmount(double amt){
		if(amt <=0){
			System.out.println("Please enter a valid amount");
		}else{
			acc_balance += amt;
			System.out.println("-------------------Depositing Amount--------------");
			System.out.println("Amount deposited successfully");
			System.out.println("Balance = "+acc_balance);
		}
	}
	
	//method for withdrawal
	public void withdrawAmount(double amt){
		if(amt > acc_balance){
			System.out.println("Insufficient Balance");
		}else{
			System.out.println("-------------------Withdrawing Amount--------------");
			acc_balance -= amt;
			System.out.println("Success, Remaining Balance = "+acc_balance);
		}
	}
	
	//method to diaplay details
	public void showDetails(){
		System.out.println("-------------------Account Details--------------");
		System.out.println("Account Holder Name: "+name);
		System.out.println("Account number: "+acc_num);
		System.out.println("Account type: "+acc_type);
		System.out.println("Account Balance: "+acc_balance);
	}
}


public class Bank{
	public static void main(String args[]){
		String name = "Madhuranjan Kumar";
		int account_num = 1;
		String account_type = "Savings";
		double balance = 123456.00;
		
		System.out.println("CREATING ACCOUNT USING CONSTRUCTOR");
		BankAccount acc1 = new BankAccount(name,account_num,account_type,balance);
		acc1.depositAmount(1000);
		acc1.withdrawAmount(12000);
		acc1.showDetails();
		
		System.out.println("CREATING ACCOUNT USING METHODS");
		BankAccount acc2 = new BankAccount(name,account_num,account_type,balance);
		acc2.depositAmount(1000);
		acc2.withdrawAmount(12000);
		acc2.showDetails();
	}

}