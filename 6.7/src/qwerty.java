import java.util.*;
public class qwerty {
public static void main(String as[]){
	String array[]= {"HELLO","WECOME","TO","You"};
searchName(array);
}
static void searchName(String [] as) {
	Scanner ip= new Scanner (System.in);
	System.out.println("Enter string");
	String s1=ip.next();
	boolean found=false;
	int i;
	for (i=0;i<as.length;i++) {
		String buffer=as[i];
		if (buffer.equals(s1)) {
			found=true;
			break;
		}
	}
	if(found) {
		System.out.println("FOUND");
	}
	else {
		System.out.println("NOT FOUND");
	}
}
}
