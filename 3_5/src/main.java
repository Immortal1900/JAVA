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
class C extends A{
	int c;
	C(int i ,int k){
		super(i);
	c=k;
}
	void displayC() {
		System.out.println("C is"+c);
	}
}
public class main {
	public static void main(String as[]) {
	C object= new C(200,30);
	B object1= new B(20,40);
	object.displayA();
	object.displayC();
	object1.displayA();
	object1.displayB();
	}
}



