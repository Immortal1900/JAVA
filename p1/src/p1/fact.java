package p1;
public class fact {
static int n;
public fact(int i){
	n=i;
}
public  static void  display() {
	int fact=1;
	while(n>0) {
		fact=n*fact;
		n--;
		
	}
	System.out.println("FACTORIAL IS "+fact);

}

}
