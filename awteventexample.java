//please copy and paste following url into browser to watch my utube videos of java programming datas tructure, Algorithms,machine learning lectures 
// https://www.youtube.com/@algotechprogrammingconcept9704/playlists

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;  
public class awteventexample extends JFrame{
  JTextField tf;
awteventexample(){   	 //constructor 
tf=new JTextField();  
    tf.setBounds(50,50,150,20);  
    JButton b=new JButton("Click Here");  
    b.setBounds(50,100,60,30);  
    b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
    tf.setText("Welcome to Java");  
    }  
    });
	add(b);
	add(tf);  
    setSize(400,400);  
    setLayout(null);  
    setVisible(true);
}
public static void main(String args[]){  

new awteventexample(); 
JFrame frame = new JFrame("My First GUI");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300,300);


}
}  


//javac awtexample.java    //compile
// java awtexample         //run
