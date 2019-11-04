class A{
	final int c=45;
	final void m1() {
		System.out.println("A is"+c);
	}
}
class B extends A{
	final int q=21;
	final void m2() {
		System.out.println("B is"+q);
	}}
class C extends B{
	final int e=28;
	final void m3() {
		System.out.println("C is"+e);
	}
}


public class main {
	public static void main(String as[]) {
	C ob1= new C();
	
	ob1.m1();
	ob1.m2();
	ob1.m3();
	}
}
