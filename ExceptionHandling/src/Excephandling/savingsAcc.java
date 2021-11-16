package Excephandling;

import java.util.Scanner;

public class savingsAcc {
	public static void main(String args[])throws IllegalBankTransactionException,InsufficientBalanceException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter deposit amount");
		double deposit=sc.nextDouble();
		double balance =deposit;
		
		System.out.println("enter your withdraw amount");
		double withdraw=sc.nextDouble();
		withdraw(withdraw, balance);
	}
	
		public static void withdraw(double withdraw,double balance) throws IllegalBankTransactionException,InsufficientBalanceException
		{
			if(withdraw<=balance && withdraw>0) {
				System.out.println("amount= "+balance);
				
		}
			else if(withdraw<0) {
				throw new IllegalBankTransactionException();
				
			}
			else if(withdraw>balance || withdraw==0) {
				throw new InsufficientBalanceException();
			}
		
	}
}
