package OOPS;
abstract class Shape1{
	public abstract void area(double r);
}
 class Squre1 extends Shape1{
	public  void area(double r) {
		System.out.println("Area squre "+(r*r));
	}
}
class Circle1 extends Shape1{
	public void area(double r) {
		System.out.println("Area of circle "+Math.PI*r*r);
	}
}
public class DynamicBindingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape1 sp1;
		Shape1 sp2;//
		Squre1 sq=new Squre1();
		Circle1 cr= new Circle1();
		sp1=sq;
		sp2=cr;
		sp1=sp2;
		sp1.area(5.6);
	}

}
