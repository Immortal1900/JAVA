class A {
int q =0 ;
double w= 0;
char e='a';
 	void getq(int a) {	
		q=a;
	}
	void getq(double v) { //getq overloaded
		w=v;
	}
	void getq(char a) { //getq overloaded
		e=a;
	}	
	void display() {					//method
		System.out.println("variables are is "+q+" and "+w+" and "+e);
	}
}
class B extends A{
	int w=2222;
	void display() {					//method overridden
		System.out.println("b is "+w);
	}
}
public class hh {
public static void main(String as[]) {
	B object=new B();
	object.display();
	A obj =new A();	
	obj.getq(23);
	obj.getq(34.234234);
	obj.display();
	obj.getq('g');
	obj.display();
}
}

