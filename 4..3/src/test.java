import java.util.*;
interface shape{  
void area();  
static double pi=3.14;
}  
class circle implements shape{  
public void area(){
	Scanner ip = new Scanner(System.in);
	System.out.println("Enter the radius:");
	double ra=ip.nextInt();
	double area=pi*ra*ra;
	System.out.println("Area of circle"+area);
	}  
} 
class triangle implements shape{
	public void area(){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter base:");
		double h=ip.nextInt();
		System.out.println("Enter height:");
		double b=ip.nextInt();
		double area=0.5*h*b;
		System.out.println("Area is triangle"+area);
		}  
}
  

public class test {
	public static void main(String args[]){  
		circle ob=new circle();  
		ob.area();  
		triangle ob1=new triangle();  
		ob1.area();  
	
		}} 

