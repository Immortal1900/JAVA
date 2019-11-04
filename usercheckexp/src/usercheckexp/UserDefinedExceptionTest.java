package usercheckexp;
import java.util.Scanner;
class UserDefinedException extends Exception {
    UserDefinedException(String s) { 
    	super(s);
    }
}
public class UserDefinedExceptionTest {
    public static void main(String[] arg) {
    	Scanner ip=new Scanner(System.in);
    	String a ;
    	int set=0;
    		System.out.println("Enter a string");
    		a=ip.next();
    		for(int i=0;i<a.length();i++) {
    			if(a.charAt(i)>='0' && a.charAt(i)<='9'){
    				set=1;
    			}
    		}
    		if(set==1) {
    			System.out.println("CONTAINS DIGIT");
    		}
           try {	
        	    {
        	    if(set==1) {
                  throw new UserDefinedException("user defined exception was thrown " + "and handled.");
                  }}
           } catch (UserDefinedException e) {
                  e.printStackTrace();
           }
    }
}
