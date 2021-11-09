package Excephandling;

import java.util.Scanner;

public class savingsAcc {
	public static void main(String args[])throws IllegalBankTransactionException,InsufficientBalanceException
	{
		double balance=10000;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount to be withdrawn");
		double amount=sc.nextInt();
		sc.close();
		 double withdraw(amount);

	private static void withdraw(double amount) throws IllegalBankTransactionException,InsufficientBalanceException{
			if(amount<0){
		throw new IllegalBankTransactionException();
			}
			else if(amount>balance) {
				throw new InsufficientBalanceEception();
	}
		
	}
}
