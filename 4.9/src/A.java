import java.util.Scanner;
class dd extends Exception{
	dd(String ss){
		super(ss);
	}
}
public class A {
static int q=30;
public static void main(String[] as) {
	Scanner op=new Scanner(System.in);
	System.out.println("ENter a numbe");
	q=op.nextInt();
try{
	
	if (q<20 || q>50 ) {
		throw new dd("INVALID NUMBER");
	}
	
	else 
		System.out.println("NUMBER IS VALID");
}
catch(dd e) {
	System.out.println(e.getMessage());
}

}
}
