
class A {
int q;
	A(int k){
	q=k;
}
	void displayA() {
		System.out.println("A is"+q);
	}
}
class B extends A{
	int b;
	B(int j,int k){
	super(k);
	b=j;
}
	void displayB() {
		System.out.println("B is"+b);
	}
}
class C extends B{
	int c;
	C(int i ,int j,int k ){
		super(j,k);
	c=i;
}
	void displayC() {
		System.out.println("C is"+c);
	}
}
public class main8
	{
		public static void main(String arg[])
		{
			C ob=new C(10,20,30);
			ob.displayA();
			ob.displayB();
			ob.displayC();
		}
	}

