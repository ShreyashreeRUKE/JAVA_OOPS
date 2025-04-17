package OOPS; //This is kind of folder 
abstract class Shape //Creating an Abstruct class 
{
	public abstract void area(double r); //Abstruct method with no body 
}
 class Squre extends Shape //This class inherits from Shape class
 {
	public  void area(double r) //Overrides area()
	{
		System.out.println("Area squre "+(r*r));
	}
}
class Circle extends Shape{
	public void area(double r) {
		System.out.println("Area of circle "+Math.PI*r*r); //Math.PI is a build in const of val 3.14159
	}
}
public class AbstractionDemo //Main class and it's public means it can access by the JVM directly
{

	public static void main(String[] args) //Its always void cause it's nott returning anything
					//It's static cause JVM has to access it without making an object
	{
		// TODO Auto-generated method stub
		Squre sq= new Squre(); //Create an instance object of the class 
		Circle c= new Circle();
		sq.area(5.6);
		c.area(5.6);
	}

}
