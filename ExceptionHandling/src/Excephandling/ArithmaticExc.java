package Excephandling;

import java.util.Scanner;

public class ArithmaticExc {
	public static void main(String args[])
	{
		int num1;
		int num2;
		 Scanner sc=new Scanner(System.in);
		 num1=sc.nextInt();
		 num2=sc.nextInt();
		 try {
			 System.out.println(num1/num2);	 
		 }
		 catch(ArithmeticException e){
			System.out.println("can't divide by 0");
		 }
}
	
}
