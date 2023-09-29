package atm_interface;

import java.util.Scanner;

public class AtmMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int money;
		int deposite;
		int balance=0;
		while(true)
		{
		System.out.println(" ATM ");
		
		System.out.println("Choose 1 for withdraw");
		System.out.println("Choose 2 for Deposite");
		System.out.println("Choose 3 for check Balance");
		System.out.println("Choose 4 for Exit");
		
		int Choose=sc.nextInt();
		
		
		switch(Choose)
		{
		case 1:
			   System.out.println("Enter Money to Withdraw");
			    money=sc.nextInt();
			    if(balance>=money)
			    {
			    	balance=balance-money;
			   System.out.println("You Have been  Successfuly Withdraw");
			    }
			    else
			    {
			    	System.out.println("Insufficent Balance");
			    }
			   break;
			   
		case 2:
			   System.out.println("Enter Money to Deposite");
			    deposite=sc.nextInt();
			    
			    balance=balance+deposite;
			    System.out.println("You have been Money Successfuly Deposite");
			   
			   break;
			   
		case 3:
			   
			   System.out.println("your  Balence :"+balance);
			  break;
			  
		case 4:
			    System.exit(0);
			   
			   
		}
		}
		
		}

	}


