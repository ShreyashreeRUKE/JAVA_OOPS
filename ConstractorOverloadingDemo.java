//Constructor overloading ... same constructors name with diff parameters in it
package OOPS;//Folder
class Cake 
{
	public Cake() //Constructor with no parameters
	{
		System.out.println("Happy Birthday");
	}
	public Cake(String msg, String shape) //Constuctor with two parameters msg and shape
	{
		System.out.println(msg);
		System.out.println(shape);
	}
	public Cake(String msg, String shape, Double price){
		System.out.println(msg);
		System.out.println(shape);
		System.out.println(price);
	}
}
public class ConstractorOverloadingDemo //Main class
{
	public static void main(String[] args) //Main method
	{
		Cake c1=new Cake(); //Cake is the class..c1 in new obj that i'm creating
				//new is keyword that makes the new obj and calss the cake constructor ..
				// cake() is the constructor
		Cake c2=new Cake("Happy Birthday", "Round"); //two parameters need to be passed
		Cake c3=new Cake("Nice","Circle", 100.50);
	}

}
