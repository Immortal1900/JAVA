import java.io.*;
import java.util.*;
class A{
	void ff() throws FileNotFoundException,IOException{
		String as=new String();
		String as1=new String();
		File f1=new File("G:\\New Folder");
		File f2=new File(f1,"allnames.txt");
		File f3=new File(f1,"noduplicates.txt");
	
		BufferedReader  br1=new BufferedReader(new FileReader(f2));	
		BufferedWriter bw=new BufferedWriter(new FileWriter(f3));
		int i=1;
		
		while(i<2) {
			as1=br1.readLine();
			bw.write(as1+"\n");
			System.out.println(as1);
			i++;
			bw.flush();
		}		
		while(	(as=br1.readLine())!=null	) {	
			boolean flag=true;
			BufferedReader  br2=new BufferedReader(new FileReader(f3));
			while(	(as1=br2.readLine())!=null	){

				if (as.equalsIgnoreCase(as1)) {
					flag=false;
					break;
				}
			}		
			if (flag==true) {
				bw.write(as+"\n");
				System.out.println(as);
				bw.flush();
			}
		}
	}
}
public class main710 {
	public static void main(String as[]) throws FileNotFoundException,IOException {
		A a=new A();
		a.ff();
	}
}

