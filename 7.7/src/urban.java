import java.io.*;
import java.util.*;

class urban { 
    public static void main(String[] args) throws IOException 
    { 
    	Scanner ip=new Scanner(System.in);
    	System.out.println("Enter name to be searched");
    	String s1=ip.next();
    	boolean flag=false;
    	int line=1;
    	String as =new String();
        File dir = new File("G:\\New folder"); 
        PrintWriter pw = new PrintWriter("output.txt"); 
        File f=new File(dir,"names.txt");
        System.out.println(f.getAbsolutePath());
        BufferedReader br=new BufferedReader(new FileReader(f));
        while(	(as=br.readLine())!=null	) {
        	if (as.equalsIgnoreCase(s1)) {
        		flag=true;
        		break;
        	}
        	System.out.println();
        	line++;
        }
        if (flag) {
    		System.out.println("Name Found at line "+line);
        }
        else {
        	System.out.println("Name not Found");
        }
    }
}
