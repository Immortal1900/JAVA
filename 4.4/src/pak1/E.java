package pak1;
import pak.*;;
public class E extends A{
	public static void main(String[] as) {
		A ob1=new A();
		ob1.m1(); m1();// VISIBLE PUBLIC METHODS
		ob1.m2(); //NOT VISIBLE PRIVATE METHOD
		ob1.m3();m3();//VISIBLE PROTECTED ON INHERITANCE
		ob1.m4();//NOT VISIBLE DEFUALT METHOD
	}
}