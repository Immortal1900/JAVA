import java.util.Scanner;
import java.util.Vector;
class b {
    Scanner ip=new Scanner(System.in);
    String st;
    Vector v=new Vector();
    void vector(){
    while(true){   
    System.out.println("**************************\nMenu\na)ADD NAMES\nb)DELETE NAMES\nc)SEARCH NAMES\nd)SHOW NAMES\ne)EXIT\n**************************");
     System.out.println("Enter your choice:");
    char ch=ip.next().charAt(0); 
    switch(ch){
        case 'a':
            add_name();
            break;
        case 'b':
           del_name();
            break;
        case 'c':
             search();
            break;
        case 'd':
            show_name();
            break;
        case 'e':
            return;
        default:
            System.out.println("Wrong choice");
    }
    }
    }
    void add_name(){
        System.out.println("Enter name");
        st=ip.next();
        v.add(st); 
    }
    void show_name(){
    int size=v.size();
    System.out.println("Enetered names are");
    for(int i=0;i<size;i++){
    System.out.println(v.elementAt(i));
    }
    }
    void del_name(){ 
    System.out.println("Enter then name to be deleted");
    String aa =ip.next();
    v.remove(aa);
    }
    void search(){
    System.out.println("Enter the name to be Searched");
    String a =ip.next();
    boolean z=v.contains(a);
    if (z==true)
    System.out.println("Entered name is present");
    else
        
    System.out.println("Entered name not found");
    }
 }
public class A{
    public static void main(String args[]) {
        b object=new b();
        object.vector();


    }
    }
