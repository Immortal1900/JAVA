import java.io.*;
public class main74 {
	
		public static void main(String as[]) throws FileNotFoundException,IOException {
			
			File ob=new File("Input.txt");
			ob.createNewFile();
			FileWriter fw1=new FileWriter(ob);
			fw1.write("Write a program to demonstrate the use");
			fw1.flush();
			File ob1=new File("Input1.txt");
			ob1.createNewFile();
			fw1=new FileWriter(ob1);
			fw1.write("of File handling");
			fw1.flush();
	
			File gg=new File("Output.txt");
			int ch;
			FileReader fr=new FileReader(ob);
			FileReader fr1=new FileReader(ob1);
			fw1=new FileWriter(gg);
		
			while((ch=fr.read())!=-1) {
				System.out.print((char)ch);
				fw1.write(ch);
			}
			fw1.flush();
			while((ch=fr1.read())!=-1) {
				System.out.print((char)ch);
				fw1.write(ch);
			}
			fw1.flush();
		}	
	}
	 


