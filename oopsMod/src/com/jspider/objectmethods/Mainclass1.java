package com.jspider.objectmethods;
class Emp1{
	int eid=101;
}
class Emp2{
	int eid=101;
	@Override
	public int hashCode() {
		return eid;
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp1 e1 = new Emp1();
		Emp2 e2 = new Emp2();
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
