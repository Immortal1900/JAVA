import java.util.*;
public class a1 {
public static void main(String as []) {
	String string1= "HIMANSHU";
	String asa=new String();
	//string.length
	int size=string1.length();
	//string.charat
	for (int i=0;i<size;i++) {
		System.out.println(string1.charAt(i));
	}
	//string.contains("STring")
	boolean st=string1.contains("HIM");
	System.out.println("Contains HIM?="+st);
	//string.equals(String ob or charseq)
	 st=string1.equals("himanshu");
	System.out.println("Equal to himanshu?="+st);
	st=string1.equalsIgnoreCase("himanshu");
	System.out.println("Equal to himanshu ignore case?="+st);
	//string.concat(string or charseq)
	string1.concat(asa);
	System.out.println(string1); //It returns the same string since String objects are immutable
	//string.toCharArray() return stream of chars so a char arry is required to old that
	char array[]=string1.toCharArray();
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
}}