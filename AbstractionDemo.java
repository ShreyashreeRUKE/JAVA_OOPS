package OOPS;
abstract class Shape{
	public abstract void area(double r);
}
 class Squre extends Shape{
	public  void area(double r) {
		System.out.println("Area squre "+(r*r));
	}
}
class Circle extends Shape{
	public void area(double r) {
		System.out.println("Area of circle "+Math.PI*r*r);
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Squre sq= new Squre();
		Circle c= new Circle();
		sq.area(5.6);
		c.area(5.6);
	}

}
