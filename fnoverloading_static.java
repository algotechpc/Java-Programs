


public class fnoverloading_static {

public static void predictRaise(double salary) {
  double newSalary;
   final double raiseRate = 1.85;
  newSalary = salary * raiseRate;
  System.out.println("Currently salary: " + salary + " After raise: " + newSalary);
}
public static void predictRaise(float sal) {
  float newSalary;
  final float raiseRate = 2;
  newSalary = sal * raiseRate;
  System.out.println("Currently salary: " + sal + " After raise: " + newSalary);
}
  public static void main(String[] args) {
  
float sal = 250;
double salary = 200.00;
double startingWage = 800.00;
float startingWage1 = 800;
System.out.println("static function overloading example ");
  predictRaise(400.00);
  predictRaise(200.00);
  predictRaise(salary);
  predictRaise(startingWage);
  predictRaise(sal);
  predictRaise(startingWage1);
}
}