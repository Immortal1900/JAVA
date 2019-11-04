class A extends Thread implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class NewClass {
public static void main(String [] as) {
	A thrd1 = new A();
	A thrd2 =new A();
	thrd1.start();
	thrd2.start();
}
}
