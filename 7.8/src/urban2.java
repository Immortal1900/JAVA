import java.io.*;
import java.util.*;

 public class urban2 { 
    public static void main(String[] args) throws IOException 
    { 
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter name to be deleted");
		String s1=ip.next();
		boolean flag=false;
		int line=1,linecount=0;
		String as =new String();
		  File dir = new File("G:\\New folder"); 
		  File f=new File(dir,"names.txt");
		  System.out.println(f.getAbsolutePath());
		  BufferedReader br=new BufferedReader(new FileReader(f));
		  BufferedWriter bw=new BufferedWriter(new FileWriter("NewNames.txt"));
		  File op=null;

        while(	(as=br.readLine())!=null	) {
        	if (!as.equalsIgnoreCase(s1)) {
        		bw.write(as+"\n");
        	}
        	line++;
        }
        bw.flush();
        f=new File("NewNames.txt");
        System.out.println(f.getAbsolutePath());
    }
    }
 

