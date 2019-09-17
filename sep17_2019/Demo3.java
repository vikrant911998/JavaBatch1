package sep17_2019;

public class Demo3 {

	public static void main(String[] args) {
		int n= 100000;
		long t;
		String s = new String("Hello");
		
		t = System.currentTimeMillis();
		
		for(int i=1;i<=n;i++) {
			s.concat("User");
		}
		
		System.out.println("Time1 : "+(System.currentTimeMillis() - t));

		long t1;
		
		StringBuilder sb = new StringBuilder("Hello");
		t1 = System.currentTimeMillis();
		
		for(int i=1;i<=n;i++) {
			sb.append("User");
		}
		
		System.out.println("Time2 : "+(System.currentTimeMillis() - t1));
		
		long t2;
		
		StringBuffer sb1 = new StringBuffer("Hello");
		t2 = System.currentTimeMillis();
		
		for(int i=1;i<=n;i++) {
			sb1.append("User");
		}
		
		System.out.println("Time3 : "+(System.currentTimeMillis() - t2));
		
	}

}
