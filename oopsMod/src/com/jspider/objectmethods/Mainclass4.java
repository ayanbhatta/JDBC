package com.jspider.objectmethods;
class Account{
	private long accNo=123456789;
	private double accBal=23000;
	@Override
	public boolean equals(Object obj) {
		Account a = (Account) obj;
		if(this.accNo==a.accNo && this.accBal==a.accBal) {
			return true;
		}else {
			return false;
		}
	}
}
public class Mainclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		Account a2 = new Account();
		System.out.println(a1.equals(a2));
	}

}
