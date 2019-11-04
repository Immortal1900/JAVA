class A extends Thread{
    public void disN(){
    	 System.out.println("current THREAD "+Thread.currentThread().getName());
         for(int i=0;i<10;i++){
             System.out.println("NUMBER "+i+"\n");
       }
    }


       public void disC(){
    	   System.out.println("current THREAD "+Thread.currentThread().getName());
       for(char i='A';i<='J';i++){
             System.out.println("ALPHABET "+i+"\n");
       }      
       }
}
class B extends A implements Runnable{
	A ob; 
	B(A object){
		 ob=object;
	 }
	public void run() {
		ob.disN();	
	}
}
class C extends A implements Runnable{
	A ob; 
	C(A object){
		 ob=object;
	 }
	public void run() {
		ob.disC();	
	}
}
public class NewClass extends Thread {
    public static void main(String[] args){
        System.out.println("MAIN START");
        System.out.println("current THREAD "+Thread.currentThread().getName());
        A ob=new A();
        B ob1=new B(ob);
        C ob2=new C(ob);
        ob1.start();
        try {
			ob1.join();
		} catch (InterruptedException e) {
		}
        ob2.start();
        try {
			sleep(3000);
		} catch (InterruptedException e) {
		}
        System.out.println("MAIN END");
    }
    
}
