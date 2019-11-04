import java.util.Arrays;

public class asd {
public static void main(String as []) {
	String s1[]= {"HELLO","I'M","HUMAN"};
	String []s2= {"HELLO","I'M","AN","ANIMAL"};

merge(s1,s2);
}
static void merge(String[] s1,String []s2) {
int size1=s1.length;
int size2=s2.length;
int i=0,j=0;
String s3[] = new String [size1+size2];
for(;i<size1;i++) {
	s3[i]=s1[i];
}
for(;j<size2;j++) {
	s3[i]=s2[j];
	i++;
}
System.out.println(Arrays.toString(s3));
}
}
