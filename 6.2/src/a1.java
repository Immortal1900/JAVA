import java.util.Scanner;
public class a1 {
public static void main(String as []) {
	Scanner ip = new Scanner (System.in);
	String string1 = ip.next();
	String buffer =new String();
	int size=string1.length();
	for (int i=size-1;i>=0;i--) {
		buffer+=string1.charAt(i);
	}
	if (buffer.equals(string1)) {
		System.out.println("THE ENTERED STRING IS PALINDROME");
		
	}
	else
		System.out.println("THE STRING IS NOT A PALINDROME");
	
	
}
}