class A extends Thread{
    public void run(){
         for(int i=0;i<10;i++){
             System.out.println("NUMBER "+i+"\n");
       }
    }
}
class B extends Thread{
       public void run(){
       for(char i='A';i<='J';i++){
             System.out.println("ALPHABET "+i+"\n");
       }      
       }
}
public class NewClass {
    public static void main(String[] args) {
        System.out.println("MAIN START");
        A ob=new A();
        B ob1=new B();
        Thread t1=new Thread(ob);
        Thread t2=new Thread(ob1);
        t2.start();
                    try
        { 
            System.out.println("current THREAD "+Thread.currentThread().getName());
                    t2.join(); 
        }  
        catch(Exception ex) 
        { 
            System.out.println("Exception"+ ex); 
        }     
        t1.start();
        System.out.println("MAIN END");
    }
    
}
