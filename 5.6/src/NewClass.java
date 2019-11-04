class A{
	int sum=0;
	int n;
	int avg;
	public void getNSum(int q){
		n=q;
		System.out.println("current THREAD "+Thread.currentThread().getName());
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("SUM IS " +sum);	
	}
	public void getNAvg() {
		System.out.println("current THREAD "+Thread.currentThread().getName());
		avg=sum/n;
		System.out.println("AVERAGE IS "+avg);
	}
}
class thread1 extends Thread{
	A ob;
	 thread1(A object){
		 ob=object;
	 }
	 public void run() {
		 ob.getNSum(111);
	 }
}
class thread2  extends Thread{
	A ob;
	thread2(A object){
		ob=object;
	}
	public void run() {
		ob.getNAvg();
	}
}
public class NewClass extends Thread {
	public static void main(String [] as) {
		A ob=new A();
		thread1 t1=new thread1(ob);
		thread2 t2=new thread2(ob);
		 t1.start();
		 try {
			t1.join();
		} catch (InterruptedException e) {
		}
		 t2.start();
	}
}
