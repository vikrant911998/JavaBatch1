package sep17_2019;

class Programming{
	
	public Programming() {
		System.out.println("I love programming Languages");
	}
	
	public Programming(String s) {
		System.out.println("I love "+s);
	}
	
}



public class Demo4 {

	public static void main(String[] args) {
		Programming p1 = new Programming();
		Programming p2 = new Programming("Java");

	}

}
