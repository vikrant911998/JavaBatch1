package javamorning13;

public class AddAmount {
	int amount = 50;
	
	public AddAmount() {
		System.out.println("Default Amount : "+this.amount);
	}
	
	public AddAmount(int amount){
		this.amount = this.amount + amount;
		System.out.println("Parameter Amount : "+this.amount);
	}
	
	
	public static void main(String[] args) {
		
		AddAmount obj = new AddAmount();
		AddAmount obj1 = new AddAmount(50);
	}

}
