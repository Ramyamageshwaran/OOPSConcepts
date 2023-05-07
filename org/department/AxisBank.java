package org.department;

public class AxisBank extends BankInfo {

	public void deposit(int amt)
	{
		System.out.println("Deposit the Amount  "+amt);
	}

	public static void main(String[] args) {
		
		BankInfo axis=new AxisBank();
		axis.deposit(5000);
		

	}

}
