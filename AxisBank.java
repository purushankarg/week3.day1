package week3.day1;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("Axis Bank Deposit");
	}
	

	public static void main(String[] args) {
		
		AxisBank axs = new AxisBank();
		
		axs.saving();
		axs.fixed();
		axs.deposit();
		
		//To access Parent class method in child class having overriding method 
		
		BankInfo bnk = new BankInfo();
		bnk.deposit();
		

	}

}
