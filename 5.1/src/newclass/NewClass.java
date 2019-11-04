
package newclass;
class A implements Runnable{
    public void run(){
         for(int i=0;i<5;i++){
             System.out.println("Thread1 called for"+i);
       }
    }
}
class B extends Thread{
       public void run(){
              for(int i=0;i<5;i++){
             System.out.println("Thread2 called for"+i);
       }       
       }
}
public class NewClass {

    public static void main(String[] args) {
        System.out.println("MAIN START");
        A ob=new A();
        B ob1=new B();
        Thread t1=new Thread(ob);
        t1.start();
        Thread t2=new Thread(ob1);
        t2.run();
        System.out.println("MAIN END");
    }
    
}
