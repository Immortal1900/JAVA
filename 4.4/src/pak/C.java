package pak;
public class C extends A{
	public static void main() {
		A ob=new A();
	ob.m1();
	ob.m2(); //PRIVATE not visible
	ob.m3();
	ob.m4();
}
}
