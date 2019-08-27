package javamorning2;

public class Sum {

	public static void main(String[] args) {
		int a = 234,sum =0;
		
		while(a!=0) {
			int temp = a%10;//2
			sum = sum + temp;//7+2->9
			a = a/10;//0
		}
		System.out.println("The sum is "+sum);
//		a = a/10;
		
//		System.out.println(a%10);

	}

}
