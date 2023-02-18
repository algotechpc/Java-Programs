

//implement multilevel inheritance

 class multilevel{
	public static void main(String[] args) {
   abc.i =5;       //static variable i of abc class is accessed
//without instantiate the object of class abc ,static method display() is accessed
   abc.display();  
//xyz obj = new xyz(); 
pqr obj1 = new pqr();
obj1.show(); 
obj1.showpqr();
obj1.display1(); //display1() is non static function inside class abc,accessed by obj1 of class pqr.

/* pqr inherits class xyz,xyz inherits abc ,hence by transitivity rule,pqr directly access features of abc. only object obj1 of pqr class will access all the features in this program except static function. thus memory is saved by not creating the object of class xyz and abc. Method show() is accessed by obj1 of class pqr. method show() is defined in class xyz. Method display1() is non static function defined inside class abc.
 */
	}
}

class abc
{
static int i;
public void display1()   //non static method
{
System.out.println("value of i from non static function display1() is" +i);
}
public static void display()   //static method
{
System.out.println("static display() function");
System.out.println("value of i is" +i);
}
} 
class xyz extends abc     //inherit class abc
{
public void show() 
{
System.out.println("Child xyz class by show() ");
}
}
class pqr extends xyz //inherit class xyz and abc as well
{
public void showpqr() 
{
System.out.println("Child pqr class by showpqr()");
}
}

//compile
//javac multilevel.java

//run
//java multilevel