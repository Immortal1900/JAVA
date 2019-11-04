//agrregation
class b {
    class c{
    void methodinc(){
    System.out.println("method in c");
    }}
    c ob1=new c();//inner object 
    void methodinb(){
        
    ob1.methodinc();
    System.out.println("method in b");
    }
}
    public class qq{
        public static void main(String as[]){
        b ob1=new b();//outer obejct created
        ob1.methodinb(); // outer method called
        
        b.c object=new b().new c();//another way to create inner object
        object.methodinc();//calling inner methods
        }
        

}
//composition
class f{
    void methodinf(){
    System.out.println("method in f");
    }

class g{
void methoding(){
    methodinf();
    System.out.println("method in g");
}
f obj1=new f();
}
}
class h{
    public static void main(String as[]){
    f.g object1=new f().new g();
    object1.methoding();
}
}


