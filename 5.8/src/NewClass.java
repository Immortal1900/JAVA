class Account extends Thread{
	private int bal=2000;
	 public synchronized void withdraw(int wtd) {
		   System.out.println("current THREAD @ "+Thread.currentThread().getName());
		if (wtd>1000) {
			System.out.println("MINIMUM AMOUNT WITHRAWAL IS 1000");
		}
		else if(bal<=1000) {
			System.out.println("INSUFFICANT BALANCE");
		}
		else {
			bal=bal-wtd;
			if(bal<=1000) {
				System.out.println("INSUFIICAINT BALANCE ");
				bal=bal+wtd;
			}
		}
	}
	public void ShowBal() {
		System.out.println("THE CURRENT BALANCE IS "+bal);
	}
}
class person1 extends Thread{
	Account a;
	person1(Account ob1){
		a=ob1;
	}
	public void run() {
		for(int i=0;i<5;i++) {
		a.withdraw(100);
		a.ShowBal();
	}	
}}
class person2 extends Thread{
	Account a;
	person2(Account ob2){
		a=ob2;
	}
	public void run() {
		for(int i=0;i<5;i++) {
		a.withdraw(600);
		a.ShowBal();
	}	}
}
public class NewClass extends Thread {	   
	public static void main(String as []) {
		System.out.println("Main Start");
		System.out.println("current THREAD "+Thread.currentThread().getName());
	Account a1=new Account();
	person1 ob1=new person1(a1);
	person2 ob2=new person2(a1);
	ob1.start();
	ob2.start();
	System.out.println("Main end");
}
}
