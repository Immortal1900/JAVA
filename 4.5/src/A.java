class A{ //checked execption error shows during compilation
	static int a=100;
	static int b=0;
	static int q;
	static void dvde() throws ArithmeticException{//checked exception
		q=a/b;
	}
	public static void main(String as[]) {
		try {
			dvde();
			}
		catch(ArithmeticException w) {
		System.out.println("divison is "+w);
		B object=new B();
		object.uncheck();
}}
}

class B {  //unchecked exception no compilation error(runtime errror) 
	  void uncheck() throws ArrayIndexOutOfBoundsException
	   {
		int arr[] ={1,2,3,4,5};
		System.out.println(arr[7]);
	   }
	}