import java.io.*;
public class main72 {
	public static void main(String as[]) throws FileNotFoundException,IOException{
		File f1= new File("G:\\file1.txt");
		f1.createNewFile();		
		FileWriter ob= new FileWriter(f1);
		ob.write("what are u doing?");
		ob.close();
		int a;
		File f2=new File("G:\\New Folder\\Destination.txt");
		FileInputStream fis=new FileInputStream(f1);
		FileOutputStream fos=new FileOutputStream(f2);	
		while(		(a=fis.read())!=-1	) {		
			fos.write((char)a);
			System.out.print((char)a);

		}		
	}
}