import java.util.Arrays;
import java.util.Scanner;
public class qwee {
public static void main(String asp[]) {
	String as[]= {"aaa","bbb","ccc","ddd","eee","ffff"};
	Scanner oi=new Scanner(System.in);
	String s3[]=new String[as.length-1];
	System.out.println("Enter the name to be deleted");
	String a= oi.next();
	String s2=new String();
	int size=as.length;
	int i,k=0;
	for (i=0;i<size;i++) {
		if (a.equals(as[i])) {
				as[i]=null;
		}}
	for(int j=0;j<size;j++) {
		
		if (as[j]!=null) {
			s3[k]=as[j];
			k++;
		}
	}
	System.out.println(Arrays.toString(as));
	System.out.println(Arrays.deepToString(s3));
	}
}
