package javamorning15;

public class Demo6 {

	public static void main(String[] args) {
		String s = "Hello,World";
		
		char a[] = s.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == 'o') {
				System.out.println("Index(O) : "+i);
			}
			if(a[i] == ',')
				System.out.println("Index(,) : "+i);
		}

	}

}
