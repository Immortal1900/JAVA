package lab3;

class A {
int q;
	A(int i){
	q=i;
}
	void displayA() {
		System.out.println("A is"+q);
	}
}
class B extends A{
	int b;
	B(int i,int j){
	super(i);
	b=j;
}
	void displayB() {
		System.out.println("B is"+b);
	}
}
class C extends B{
	int c;
	C(int i ,int j,int k){
		super(i,j);
	c=k;
}
	void displayC() {
		System.out.println("C is"+c);
	}
}
public class main {
	public static void main(String as[]) {
	C object= new C(10,20,30);
	object.displayA();
	object.displayB();
	object.displayC();
	}
}


