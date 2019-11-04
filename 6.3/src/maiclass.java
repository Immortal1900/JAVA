import java.util.Scanner;
public class maiclass {
    public static void main(String[] args) {	
    	int count=0;
Scanner ip=new Scanner(System.in);
System.out.println("Enter a string");
String S1=ip.nextLine();
S1=S1.toLowerCase();
String vowel="aeiou";
char data[]=vowel.toCharArray();
int size=data.length;
for(int j=0;j<S1.length();j++) {
for (int i=0;i<size;i++) {
	if(data[i]==S1.charAt(j)) {
	count++;
	}}}
        System.out.println("count of vowels is :"+count);
 }}