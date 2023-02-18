


public class staticfunctioninsingleclass {

 public static void display()   // static method
{
System.out.println("single class static example demo");
}
public void show()   // non static method
{
System.out.println("single class non static example demo");
}
public static void main(String[] args) {
String a = "abc";
System.out.println(a);
staticfunctioninsingleclass ob = new staticfunctioninsingleclass();
ob.show(); // non static method show() is acessed by object of class, mandatory to create object.

display(); // static method display() is directly called , no need to create objectd
}
}

//compile
// javac singleclass.java
//run
// java singleclass 
