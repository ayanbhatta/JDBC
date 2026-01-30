package com.jspider.exceptionhandling;
class OverSpeedException extends Exception{
	OverSpeedException(){}
	OverSpeedException(String msg){
		super(msg);
	}
}
class Police{
	static void checkSpeed(int speed) throws OverSpeedException{
		if(speed>60) {
			throw new OverSpeedException(speed + " is above limit");
		}
	}
}
public class Mainclass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Police.checkSpeed(45);
			Police.checkSpeed(65);
			Police.checkSpeed(75);
			Police.checkSpeed(20);
		}catch(OverSpeedException e){
			e.printStackTrace();
		}
	}

}
