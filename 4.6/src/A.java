public class A {
	public static void main(String as[]) {
	Singleton ob=Singleton.getInstance();
	ob.setn(121);
	System.out.println(Singleton.getn());
	Singleton1 ob1=Singleton1.getInstance();
	ob1.setn(1221);
	System.out.println(Singleton1.getn());
}}
 class Singleton { 
	static int n;
	 static int getn() {
		 return n;
	}
	 static void setn(int a) {
		 n=a;
	}
    private static Singleton ob = null;
    private Singleton() {}
    public static Singleton getInstance() {                
                if ( ob== null) {
                     ob= new Singleton();
               }
        return ob;
    }
}
 class Singleton1 {
		static int n;
		 static int getn() {
			 return n;
		}
		 static void setn(int a) {
			 n=a;
		}
	    private static final Singleton1 o = new Singleton1();
	    private Singleton1() {}
	  public static Singleton1 getInstance() {
	      return o;
	    }
	}