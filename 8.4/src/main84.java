import javax.swing.*;
import java.awt.*;

class A{
    A(){
        JFrame f1=new JFrame("D.O.B");
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setSize(800,700);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField text1= new JTextField(5);
        JTextField text2=new JTextField(5);
        JTextField text3=new JTextField(5);

        JButton jb=new JButton("ENTER");
        text1.setBounds(400,250,100,100);
        text2.setBounds(500,250,100,100);
        text3.setBounds(600,250,100,100);
        text3.setBackground(Color.green);
        text1.setBackground(Color.green);
        text2.setBackground(Color.green);
        jb.setBounds(700, 250, 100, 100);
        JLabel l1= new JLabel("DATE");
        JLabel l2=new JLabel("MONTH");
        JLabel l3=new JLabel("YEAR");
        l1.setBounds(450,150,50,100);
        l2.setBounds(550,150,50,100);
        l3.setBounds(650,150,50,100);


        f1.add(l2);
        f1.add(l1);
        f1.add(l3); 
        f1.add(text1);
        f1.add(text2);
        f1.add(text3);
        f1.add(jb);
        f1.add(l1);
        jb.addActionListener(new ActionListener() {});
        getdata();
       

    }
    void getdata() {
    	
    	
    }
}
public class main84 {
    public static void main(String as[]){
        A ob=new A();
    }
}
