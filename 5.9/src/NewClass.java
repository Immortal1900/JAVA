class A extends Thread{
	public void run() {
		while(true) {
			System.out.println("THREAD A");
		}	
	}
}
class B extends Thread{
	public void run() {
		System.out.println("THREAD B");
	}
}
public class NewClass extends Thread{
	public static void main(String as[]) {
A ob1=new A();
B ob2=new B();
ob1.run();
try {
	ob1.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
ob2.run();
	}
}
