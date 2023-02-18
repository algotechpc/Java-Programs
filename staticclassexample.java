

//please copy and paste following url into browser to watch my utube video lectures of java programming data structure, Algorithms,machine learning 
// https://www.youtube.com/@algotechprogrammingconcept9704/playlists

class staticclassexample {

	//public static void main(String[] args) {
static public void main(String args[]) {

/* variable a is non static variable,only accessed by object of class abc*/

abc obj = new abc();

obj.a =10;   
//obj.i =5;  //it will also work by object of class.
abc.i = 5; //
/*static variable i is directly acessed by class abc , hence not required to create object, thus memory is saved*/

obj.show(); //non static show() is accessed by object of class abc

//display() is static method defined inside class abc,hence without instantiate the object of class abc,static method display() is called as classname.method()
 
abc.display(); 
//display() is defined in class abc ,so accessed by  abc.display(); 

obj.showtest();
	}
}

class abc
{
 static int i;       //static variable
 int a;              //non static variable

public void show()   //non static method
{
System.out.println(" non static example show demo");
System.out.println("value of a is" +a);
System.out.println("value of i is" +i); 
//both static variable i and non static variable a are accessed inside non static method like show().
}
public void showtest()   //non static method
{
System.out.println(" non static example showtest demo");
System.out.println("value of a is" +a);
System.out.println("value of i is" +i); 
}
public static void display()   //static method
{
System.out.println("static example display demo");
System.out.println("value of i is" +i); 
//System.out.println("value of a is" +a);//if uncomment,gives error

// non static variable a will not work inside static method. 
//only static variable i will work inside static method display()
}
} 

//compile
//javac staticclassexample.java
//run
//java staticclassexample   

/*
System.out.println(obj);
System.out.println(obj.toString());
System.out.println(obj.hashCode());
System.out.println(Integer.toHexString(obj.hashCode()));
System.out.println(Integer.toHexString(32));
*/

