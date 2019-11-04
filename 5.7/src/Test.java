
class T1 extends Thread {
    static Thread waitFor;
    public void run() {
        System.out.println("T1 waiting for T2");
        try{waitFor.join();}catch(Exception e){}
        for (int i = 1; i<=3; i++) {
            System.out.println("T1 executing");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
class T2 extends Thread {
    static Thread waitFor;
    public void run() {
        System.out.println("T2 waiting for T1");
        try{waitFor.join();}catch(Exception e){}
        for (int i = 1; i <= 3; i++) {
            System.out.println("T2 executing");    
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
public class Test {
    public static void main(String[] arrr) {
        T1 t1=new T1();
        T2 t2=new T2();
        T2.waitFor=t1;
        T1.waitFor=t2;
        t1.start();
        t2.start();
    }
}
