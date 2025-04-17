package OOPS;
class Patient{
	public String pid;
	public String pname;
	public int age;
	public Patient(String pid, String pname, int age)//Superclass Constructor 
	{
		this.pid=pid;
		this.pname=pname;
		this.age=age;
	}
public void details() {
	System.out.println("ID no "+pid);
	System.out.println("Name is "+pname);
	System.out.println("age is "+age);
	}
}
class Labtest extends Patient{
	public String testnm;
	public String testdt;
	public double price;
	public Labtest(String pid, String pname,int age,String testnm, String testdt, double price ) {
		super(pid,pname,age);
		this.testnm=testnm;
		this.testdt=testdt;
		this.price=price;
	}
public void labdetails() {
	System.out.println("Test name is "+testnm);
	System.out.println("Test date is "+testdt);
	System.out.println("Test price is "+price);
}
}

public class SuperConstractorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labtest lb= new Labtest("SB","SHREYA",100,"HEHE","22/12/23",22.02);
		lb.details();
		lb.labdetails();
		
	}

}
