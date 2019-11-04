class A{
	static int c=45;
	static void m1() {
		System.out.println("A is"+c);
	}
}
class B extends A{
	static int q=21;
	static void m2() {
		System.out.println("B is"+q);
	}}
class C extends B{
	static int e=28;
	static void m3() {
		System.out.println("C is"+e);
	}
}


public class main7 {
	public static void main(String as[]) {
	C ob1= new C();
	
	ob1.m1();
	ob1.m2();
	ob1.m3();
	}
}

