package OOPS;
class TestStatic{
	public static int x= 25;
	public static int y= 0;
	public static void display()
	{
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	static {
		y=x*4;
	}
}
public class StaticBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStatic.display();
	}

}
