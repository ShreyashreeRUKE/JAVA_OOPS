package OOPS;

class Company{
	public String compnm="CTS";
	public String loc="KOLKATA";
	public void display() {
		System.out.println(compnm);
		System.out.println(loc);
	}

}
class Job extends Company{
	public String tech;
	public double exp;
	public String enddt;
	public String city;
	public void offer(String tech , double exp) {
		System.out.println(tech);
		System.out.println(exp);
		
	}
	public void offer(String tech, double exp,String city) {
		System.out.println(tech);
		System.out.println(exp);
		System.out.println(city);
	}
	public void offer(String tech, double exp,String city,String enddt) {
		System.out.println(tech);
		System.out.println(exp);
		System.out.println(city);
		System.out.println(enddt);
	}
	
}
class Candidate extends Job implements interview{
	public String candnm;
	public String phno;
	public String email;
	public String tech;
	public Candidate(String candnm,String phno,String email,String tech) {
		this.candnm=candnm;
		this.phno=phno;
		this.email=email;
		this.tech=tech;
	}
		public void show() {
			System.out.println(candnm);
			System.out.println(phno);
			System.out.println(email);
			System.out.println(tech);
		}
	}

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate c= new Candidate("SHREYA","333","SHRE@JEHDIH","CTS"
				+ "");
		c.display();
		c.offer("CTS",77.00 );
		c.offer("CTS",77.00,"KOLKATA" );
		c.offer("CTS",77.00,"KOLKATA","33/22");
	}

}
