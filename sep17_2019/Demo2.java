package sep17_2019;

public class Demo2 {

	public static void main(String[] args) {
		
		String s = new String("Hello");
		
		s = s.concat("User");
		
		System.out.println("String : "+s);
		
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("User");
		
		System.out.println("String Buffer : "+sb);
		
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.append("User");
		
		System.out.println("String Builder : "+sb1);
		
	}

}
