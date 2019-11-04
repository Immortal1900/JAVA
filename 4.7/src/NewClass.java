class A{
	static int n;
	private A() {}
	public static A getA() {
		A ob1=new A();
		return ob1;
	}
	public static void setN(int a) {
		n=a;
	}
	public static int getN() {
		return n;
	}
}
public class NewClass {
public static void main(String arg[]) {
A ob1,ob2,ob3; // objects can be declared but new instances cannot be created
ob1=A.getA(); //getA() is a factory method
ob2=A.getA();
ob3=A.getA();
ob1.setN(100);
System.out.println(ob1.getN()+" "+ob2.getN()+" "+ob3.getN());
ob2.setN(200);
System.out.println(ob1.getN()+" "+ob2.getN()+" "+ob3.getN());
ob3.setN(300);
System.out.println(ob1.getN()+" "+ob2.getN()+" "+ob3.getN());
}
}