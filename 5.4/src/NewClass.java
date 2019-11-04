class A extends Thread{
    public void run(){
        Thread t=Thread.currentThread();
          for(int i=1;i<=10;i++){
             System.out.println("Child Thread"+t.getName()+" Is interrupted"+t.isInterrupted());       
       }       
          System.out.println("Child thread going to sleep");
          try{
          sleep(5000);
                  }
          catch(Exception e){
              System.out.println("Child thread interrupted in sleep");
              
          }
          System.out.println("CHILD THREAD ENDS");
    }
}
public class NewClass extends Thread {
    public static void main(String[] args){
        System.out.println("MAIN START");
        A ob=new A();
        Thread t1=new Thread(ob,"t1");
        t1.start(); 
        System.out.println("MAIN END");
        t1.interrupt();
    }

}
