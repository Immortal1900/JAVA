
public class istaclass {
public static void main(String as []) {
	//Stringbuffer and builder objects are mutable
	StringBuffer ob1= new StringBuffer("HELLO");
	StringBuilder ob2=new StringBuilder("WELCOME"); //Initialises the string with welcome
	StringBuilder ob3=new StringBuilder();//Initialises the strung with capacity of 16 chars of 
	StringBuilder ob4=new StringBuilder(9);//Initialses the strung with capacity of 9 chars
	
	ob1.append(" HEY ");
	ob1.insert(0, "HI ");
	System.out.println(ob1);
	ob2.append("s you");
	ob2.deleteCharAt(0);
	ob2.compareTo(ob3);
	System.out.println(ob1.capacity());//16 + no of charc already initilised
	System.out.println(ob3.capacity());
	System.out.println(ob4.capacity());
	ob2.replace(0,0, "W");// replace index from 0 to 0 by "W" 
	System.out.println(ob2);
	ob2.reverse();
	System.out.println(ob2);
}
}
