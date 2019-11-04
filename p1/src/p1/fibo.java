package p1;
	public class fibo {	
		static int n;
	public fibo(int i){
		n=i;
	}
	public static void show() {	
		int i=0;
		int a=0;
		int b=1;
		int c;
		System.out.print("0\t1\t");
		while(i<n) {
			c=a+b;			
			System.out.print(c+"\t");
			a=b;
			b=c;
			i++;
		}
	}
}
