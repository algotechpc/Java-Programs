
// Method overriding in java

// Base Class      // please see notes at last
class Parent {
	void show()  
//show() is overridden method,show() will not be accessed by any child class object

	//static void show() // static method can not be overridden
	{
System.out.println("Parent's method show()");
	}

void display() 
// display() method will be accessed by child class object because it is not reflecting in child class.
	{
System.out.println("Parent's method display()");
	}
}

// Inherited class
class Child extends Parent {
//Child's show()method overrides show() of Parent
	void show()  //overriding method
	//static void show()// static method can not be overriden
	{
	System.out.println("Child's method show()");
	}
	void drink()
	{
	System.out.println(" child drinking sprite");
	}
}
// Driver class
class overridingexample {
	public static void main(String[] args)
	{
		/*If a Parent type reference refers
		to a Parent object, then Parent's
		show is called*/

		Parent obj1 = new Parent();
		obj1.show();
           obj1.display();

	/* If a Parent type reference refers
	 the object of child class.Child's show()
	 is called. This is called RUN TIME
	POLYMORPHISM.*/
		Parent obj2 = new Child();
		obj2.show();
		obj2.display();
		//obj2.drink();
           Child obj3 = new Child();
		obj3.show();
           obj3.drink();
           obj3.display();
          //Child obj4 = new Parent();
          //obj4.display();
	}
}



/*

1.Parent class will execute parent class method
2.child class will execute child class method and parent class method.parent class method accessed by child should be different from overriding method.
3.Two or more than classes connected through inheritance .inheritance is must for overriding implementation.
4.RUN TIME POLYMORPHISM is achieved ,If a Parent type reference/object  refers to a Child object, Child's show() is called. This is called RUN TIME POLYMORPHISM.Parent's object will access child class show() method.
5.static method can be overloaded , but not implemented for overriding.
 6. When we create an object (instance) of class then space is reserved in heap memory. Let’s understand with the help of an example.

Demo D1 = new Demo();

Now, The space in the heap Memory is created but the question is how to access that space?.  

Then, We create a Pointing element or simply called Reference variable which simply points out the Object(the created space in a Heap Memory).  
 
6
*/