package com.jspider.hasarelation;
class Account{
	void withdraw() {
		System.out.println("Withdraw");
	}
	void deposit() {
		System.out.println("Deposit");
	}
}
class Customer{
	Account acc = new Account();//Customer has-a relation : Composition
}
class Bank{
	Customer c;//Bank has-a customer : Aggregation
	Bank(Customer c){
		this.c = c;
	}
}
public class Mainclass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		Bank sbi = new Bank(c);
		Bank icici = new Bank(c);
		sbi.c.acc.withdraw();
		icici.c.acc.deposit();
	}

}
