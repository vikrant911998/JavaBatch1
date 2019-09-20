package sep20_2019;

import java.io.File;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		File obj = new File("/Users/vikrant/Documents/xyz.txt");
//		"C:\\Files\\xyz"  ->C:\Files\xyz
//		System.out.println(obj);
//		System.out.println(obj.getAbsolutePath());
//		System.out.println(obj.getCanonicalPath());
		System.out.println(obj.createNewFile());
		System.out.println(obj.exists());
		System.out.println(obj.delete());
		System.out.println();

	}

}