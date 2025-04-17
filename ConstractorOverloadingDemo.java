package OOPS;
class Cake{
	public Cake() {
		System.out.println("Happy Birthday");
	}
	public Cake(String msg, String shape){
		System.out.println(msg);
		System.out.println(shape);
	}
	public Cake(String msg, String shape, Double price){
		System.out.println(msg);
		System.out.println(shape);
		System.out.println(price);
	}
}
public class ConstractorOverloadingDemo {

	public static void main(String[] args) {

		Cake c1=new Cake();
		Cake c2=new Cake("Happy Birthday", "Round");
		Cake c3=new Cake("Nice","Circle", 100.50);
	}

}
