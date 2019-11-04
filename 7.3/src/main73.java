import java.io.*; 

import java.util.*;
public class main73 {  
    public static void main(String[] args) throws IOException,ClassNotFoundException {        
        Scanner ip=new Scanner(System.in);
        int a;
        String s=new String();    
        System.out.println("Enter string");
        s=ip.nextLine();
        File file = new File("D:\\testout.txt");  
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new  ObjectOutputStream(fos); 
        FilterOutputStream fios = new FilterOutputStream(oos);

        byte ar[]=s.getBytes();
    		   fios.write(ar);	   
    	fios.close();
        fos.close(); 
        FileInputStream fis=new FileInputStream(file);  
        ObjectInputStream ois=new ObjectInputStream(fis);   
        FilterInputStream fiis = new BufferedInputStream(ois); 
        while(	(a=fiis.read())!=-1	) {
        	System.out.print((char)a);
        }
    }  
} 
