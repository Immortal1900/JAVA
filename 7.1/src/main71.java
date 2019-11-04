import java.io.*;
import java.util.Arrays;
public class main71 {
	public static void main(String [] as) throws IOException {	
		File ob=new File("D:\\New Folder\\as.txt");
				//throws IOException
		System.out.println("File exists?="+ob.exists());
		System.out.println("Path of File specified"+ob.getAbsolutePath());
		System.out.println("Is it a directory?="+ob.isDirectory());
		System.out.println("Is it a File?="+ob.isFile());
		System.out.println("Lenght of the File="+ob.length());

		File ob1=new File("G:\\New Folder");
		System.out.println(ob1.mkdir());
		File ob2=new File("G:\\aaaa\\dd.txt");
		System.out.println(ob2.createNewFile());	
		String as1[]=ob1.list();	
		System.out.println(Arrays.toString(as1));
	}
}
