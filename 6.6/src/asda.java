import java.util.Arrays;
public class asda {
public static void main(String as []) {
	String s1[]= {"HELLO","I'M","HUMAN"};
	String s2[]= {"HELLO","I'M","AN","ANIMAL"};
	
merge(s1,s2);
}
static void merge(String[] s1,String []s2) {
int size1=s1.length;
int size2=s2.length;
int i=0,j=0,k=0;
String s3[] = new String [size1+size2];
while(i<size1 && j<size2) {
	s3[k]=s1[i];
	k++;
	s3[k]=s2[j];
	i++;
	j++;
	k++;
	
}
while(i<size1) {
	s3[k]=s1[i];
	i++;
	k++;
}
while(j<size2) {
	s3[k]=s2[j];
	j++;
	k++;
}
System.out.println(Arrays.toString(s3));
}
}
