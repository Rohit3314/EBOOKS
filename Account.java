package com.demo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	 private static final Object CheckingWithdraw = null;
	private static final Object SavingBlanace = null;
	private static final Object CheckingBlanace = null;
	int CustomerNumber;
     int PinNumber;
     double  CheckingBalance =0;
	double SavingBalance =0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	public int setCustomerNumber(int CustomerNumber) {
		this.CustomerNumber =  CustomerNumber;
		return  CustomerNumber;
		
	}
   
	public int getCustomerNumber() {
		return CustomerNumber;
		
	}
	public int SetPinNumber(int PinNumber) {
		this.PinNumber = PinNumber;
		return PinNumber;
	}
	
	public int getPinNumber() {
		return PinNumber;
	}
	
	public double getCheckingBalance() {
		return CheckingBalance;
	}
	 
	public double getSavingBalance() {
		return SavingBalance;
	}
	
	public double calcCheckingWithdraw(double amount) {
		CheckingBalance = (CheckingBalance - amount);
		return CheckingBalance;
	}
	
	public double calcSavingWithdraw(double amount) {
		SavingBalance = (SavingBalance - amount);
		return SavingBalance;
	}
	
	public double calcCheckingDeposit(double amount) {
		CheckingBalance = (CheckingBalance + amount);
		return  CheckingBalance;
	}
	
	public double calcSavingDeposit(double amount) {
		SavingBalance = (SavingBalance + amount);
		return SavingBalance;
	}
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance :" + moneyFormat.format(CheckingBalance));
		System.out.println("Amount you want to withdraw from Checking Account :");
		double amount =input.nextDouble();
		
		if((CheckingBalance - amount)>= 0) { 
			calcCheckingWithdraw(amount);
			System.out.print("New Checking Account Balance : "+ moneyFormat.format(CheckingWithdraw));
		}else {
			System.out.println("Balance Cannot be Negative."+ "\n");
		}
	}
	
	
	public void getSavingWithdrawInput() {
		System.out.println("New Checking Account Balance :" + moneyFormat.format(SavingBlanace));
		System.out.println("Amount you want to withdraw from Saving Account :");
		double amount = input.nextDouble();
		
		if((SavingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New saving Account Balance:" + moneyFormat.format(SavingBalance));
		}else {
			System.out.println("Balance Cannot be Negative ." + "\n");
		}
	}
	
	
	public void getCheckingDepositInput1() {
		System.out.println("Checking Account Balance :" +moneyFormat.format(CheckingBlanace));
		System.out.println("Amount you want to Deposit from Checking Account :");
		double amount = input.nextDouble();
		
		if((CheckingBalance + amount ) >=0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account Balance :" +moneyFormat.format(CheckingBalance));
		} else {
			System.out.println("Balance Cannot be Negative ." + "\n");
		}
	}
		
	public void getCheckingDepositInput() {
			System.out.println("saving Account Balance :" +moneyFormat.format(SavingBlanace));
			System.out.println("Amount you want to Deposit from saving Account :");
			
			double amount = 0;
			if((SavingBalance + amount ) >=0) {
				calcSavingDeposit(amount);
				System.out.println("New Saving Account Balance :" +moneyFormat.format(SavingBalance));
			} else {
				System.out.println("Balance Cannot be Negative ." + "\n");
			}
		
		}
	
	public static void main(String[] args) {
		Account obj=new Account();

	}

}
