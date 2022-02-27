 class Account 
 {
	public double balance;
	public double interest;
}
 class SavingsAccount extends Account
 {
	 public SavingsAccount()
	 {
		 balance=0;
		 interest=0;
	 }
	public SavingsAccount (double intialBalance,double initialInterest)
	{
		balance= intialBalance;
		interest=initialInterest;
	}
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	public void withdraw(double amount)
	{
		balance=balance-amount;
	}
	public void addInterest()
	{
		balance=balance+balance*interest;
		
	}
	public double getBalance()
	{
		return balance;
	}
 }
 
 class Tester
	{
		public static void main(String[] args) 
		{
		 SavingsAccount a1=new SavingsAccount(1000,0.10);
		 a1.withdraw(250);
		 a1.deposit(400);
		 a1.addInterest();
		 System.out.println(a1.getBalance());
		}
	}
 
 
	
