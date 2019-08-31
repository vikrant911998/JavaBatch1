package javamorning5;

public class Reverse {

	public static void main(String[] args) {
		
		int a[] = {100,2,3,4,6,5,7,45,67,91};
		
		int j = a.length - 1;
		
		for(int i=0;i<a.length/2;i++) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j--;
			
		}
		
		for(int k:a) {
			System.out.println("The value is "+k);
		}

	}

}
