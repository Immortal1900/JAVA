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
public class main9 {
	public static void main(String as[]) {
		B object1= new B(10,20); 		
		object1.displayA();	
		object1.displayB();
		C object= new C(30,40);
		object.displayA();
		object.displayC();
	}
}



