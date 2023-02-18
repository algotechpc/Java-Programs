

/*
ActionListener is an interface and event handlers to implement and has actionPerformed() method
The actionPerformed() method is invoked automatically whenever you click on the registered component.
*/
//please copy and paste following url into browser to watch my utube videos of java programming datas tructure, Algorithms,machine learning lectures 
// https://www.youtube.com/@algotechprogrammingconcept9704/playlists

import java.applet.*;  
import java.awt.*;  
import java.awt.event.*;  
public class calculator extends Applet implements ActionListener{  
Button b1,b2,b3,b4,b5;  
TextField tf1,tf2,tf3; 
Label lb1,lb2,lb3; 
	public void init(){  
lb1 = new Label("Input 1st number");
lb1.setBounds(100,40,100,20);  
tf1=new TextField();   // If text is null, the empty string "" will be displayed.
tf1.setBounds(210,40,100,20); 
lb2 = new Label("Input 2nd number");
lb2.setBounds(100,80,100,20);   
tf2=new TextField();  
tf2.setBounds(210,80,100,20); 
lb3 = new Label("Result");
lb3.setBounds(100,120,100,20);   
tf3=new TextField();  
tf3.setBounds(210,120,100,20);  
b1=new Button("plus");  
b1.setBounds(80,150,60,50);  
b2=new Button("sub");  
b2.setBounds(130,150,60,50);  
b3=new Button("mul");  
b3.setBounds(180,150,60,50);  
b4=new Button("div");  
b4.setBounds(230,150,60,50);  
b5=new Button("mod");  
b5.setBounds(280,150,60,50);  
add(lb1);
add(lb2); 
add(lb3); 
add(tf1); 
add(tf2);  
add(tf3);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
b1.addActionListener(this);
b2.addActionListener(this);  
b3.addActionListener(this);  
b4.addActionListener(this);    
b5.addActionListener(this);
setLayout(null);  
	}//init() close  
   public void actionPerformed(ActionEvent e){       //code that reacts to the action... 
  int a = Integer.parseInt(tf1.getText()); 
  int b = Integer.parseInt(tf2.getText()); 
	if(e.getSource()==b1) 
//you can find which button is clicked by, using the getSource() method. 
//The getSource( ) method returns the source of the event.
	{
	int s =a+b;
	tf3.setText(String.valueOf(s));
	}
	if(e.getSource()==b2)
	{
	tf3.setText(String.valueOf(a-b));
	}
	if(e.getSource()==b3)
	{
	tf3.setText(String.valueOf(a*b));
	}
	if(e.getSource()==b4)
	{
	tf3.setText(String.valueOf(a/b));
	}
	if(e.getSource()==b5)
	{
	tf3.setText(String.valueOf(a%b));
	}
	}   //actionPerformed() close

	}//class ends  
/*
<applet code="calculator.class" width="400" height="300">  
</applet>  
*/