import java.io.*;

public class main75 {
	
		public static void main(String as[]) throws FileNotFoundException,IOException {
			
			BufferedReader fr1=new BufferedReader(new FileReader("Input1.txt"));
			/*input1 text is 
			Write
			a 
			java
			program
			*/
			BufferedReader fr2=new BufferedReader(new FileReader("Input2.txt"));
			/*Input2 text is 
			to demonstate
			use
			of
			File
			Handling
			 */
			BufferedWriter bw1=new BufferedWriter(new FileWriter("Output.txt"));
			FileWriter fw1=new FileWriter("Output.txt");
			String linedat=new String();
			String linedat1=new String();
			while(	(linedat=fr1.readLine())!=null && (linedat1=fr2.readLine())!=null 	) {
		
				System.out.println(linedat);
				System.out.println(linedat1);
				fw1.write(linedat);
				fw1.write(linedat1);
			}
			while(	(linedat=fr1.readLine())!=null) {
			
				System.out.println(linedat);
				fw1.write(linedat);	
			}
			while(	(linedat1=fr2.readLine())!=null) {
				System.out.println(linedat1);
				fw1.write(linedat1);	
			}
			fw1.close();

	}
		}
	 


