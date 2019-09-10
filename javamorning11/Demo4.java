package javamorning11;

interface Training{
	int COUNT=0;
	void play1();
}

class T implements Training{

	@Override
	public void play1() {
		
		
	}
	
}

abstract class Bank{
	int a= 2;
	
	abstract void roi();
	
	void play() {
		System.out.println("Play of Bank");
	}
	
}


class SBI extends Bank{
	
	@Override
	void roi() {
		System.out.println("ROi of SBI");
	}
	
}


class HDFC extends Bank{
	
	@Override
	void roi() {
		System.out.println("ROi of HDFC");
	}
	
}



public class Demo4 {

	public static void main(String[] args) {
//		Bank obj = new Bank(); --> not allowed
		SBI obj  = new SBI();
		obj.roi();
		obj.play();

	}

}
