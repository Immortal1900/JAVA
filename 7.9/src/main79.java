import java.io.*;
import java.util.*;
class A{
	void ff() throws FileNotFoundException,IOException{
		String as=new String();
		String as1=new String();
	
		File f1=new File("G:\\New Folder");
		BufferedReader  br1=new BufferedReader(new FileReader(new File(f1,"appeared.txt")));
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("selected.txt"));
	
		
		while(	(as=br1.readLine())!=null	) {
			BufferedReader br2=new BufferedReader(new FileReader(new File(f1,"notselected.txt")));
			boolean flag=true;
			while(	(as1=br2.readLine())!=null	){
				if(as.equalsIgnoreCase(as1)) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
			System.out.println(as);
			bw.write(as+"\n");
			}
		}
		bw.close();
	}
}
public class main79 {
	public static void main(String as[]) throws FileNotFoundException,IOException {
		A a=new A();
		a.ff();
	}
}
