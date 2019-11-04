import java.util.Scanner;
class dd extends RuntimeException{
	dd(String ss){
		super(ss);
	}
}
public class A {
static int q;
public static void main(String[] as) {
	Scanner op=new Scanner(System.in);
	System.out.println("ENter a number");
	q=op.nextInt();
try{
	
	if (q<0 ) {
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
