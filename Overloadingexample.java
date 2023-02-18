
//please copy and paste following url into browser to watch my utube videos of java programming datas tructure, Algorithms,machine learning lectures 
// https://www.youtube.com/@algotechprogrammingconcept9704/playlists

class Overloadingexample
{
 public static void main(String args[])
   {
DisplayOverloading obj = new DisplayOverloading();
	  obj.display('c',5.27);    	
        obj.display('a',10);
	  obj.display('a',"JAVA");
   } //main() end
}  //class end

class DisplayOverloading
{
    public void display(char c,String s)
    {
         System.out.println(c + " " +s);
    }
    public void display(char c, int num)  
    {
         System.out.println(c + " "+num);
    }

     public void display(char b, double n)  
    {
         System.out.println(b + " "+n);
    }
}


/*
Overloading is a form of polymorphism,allow the function name to be used with different argument types.
Memory space is save.
Multiple behaviors to the same function based on the parameters.
Your function may want to work with some optional details.
compile time polymorphism exhibited at compile time. Here, Java compiler knows which method is called.
static method can be overloaded
*/






