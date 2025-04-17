package OOPS;

class Calculator{
	public int add(int a,int b) {
		return(a+b);
	}
	public float add(int a,float b) {
		return(a+b);
	}
	public double add(double a,double b) {
		return(a+b);
	}
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1= new Calculator();
		System.out.println(c1.add(5,6));
		System.out.println(c1.add(5,6.5));
		System.out.println(c1.add(6.5,10.6));

	}

}
