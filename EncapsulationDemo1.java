package OOPS;
class Customer{
	private String id = "C1";
	private String name="ARUP";
	private String phno= "464646464";

	public void display()
{
	System.out.println("id:"+id);
	System.out.println("name: "+name);
	System.out.println("phno:"+phno);
}
}
public class EncapsulationDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer person = new Customer();
person.display();
	}

}
