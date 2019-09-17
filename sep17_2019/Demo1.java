package sep17_2019;




public class Demo1 {

	public static void main(String[] args) {
		
		String name = "MicrosoftAppleFacebook";
		String second = "Microsoft";
		System.out.println(name.concat(second));
		
		System.out.println(name.contains("b"));
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.length());
		
		System.out.println(name.toCharArray());
		
//		System.out.println(name.compareTo("vikrant"));
		System.out.println(name.equals(name));
		
		System.out.println(second.equalsIgnoreCase("microsoft"));
		

	}

}
