package OOPS;
class Product{
	public String id;
	public String name;
	public int pqty;
	public double price;
	public String sdt;
	public Product(String id, String name, int pqty, double price, String sdt ) {
		this.id=id;
		this.name=name;
		this.pqty=pqty;
		this.price=price;
		this.sdt=sdt;
	}

public void viewproduct() {
	System.out.println("PRODUCT NO "+this.id);
	System.out.println("PRODUCT NAME "+this.name);
	System.out.println("PRODUCT PQTY "+this.pqty);
	System.out.println("PRODUCT PRICE "+this.price);
	System.out.println("PRODUCT SDT "+this.sdt);
}
public void Salesorder() {
	double total=0.0;
	total=this.price*this.pqty;
	this.sdt="17/2/23";
	System.out.println("Total is "+total);
	System.out.println("SDT isss: "+sdt);
	//this.viewproduct();
}
}
public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pd= new Product("SB","SHREYA",22,33.23,"45");
		pd.viewproduct();
		pd.Salesorder();

	}

}
