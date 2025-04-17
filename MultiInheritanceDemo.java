package OOPS;
class Student{
	public int roll=1;
	public String name= "Shreya";
	public void show() {
		System.out.println("Name is: "+name);
		System.out.println("Roll is: "+roll);
	}
}
class Exam extends Student {
	public String sub1="PHYS";
	public String sub2="CHEM";
	public String sub3="MATH";
	public void Display() {
		System.out.println("Sub1 is: "+sub1);
		System.out.println("Sub2 is: "+sub2);
		System.out.println("Sub3 is: "+sub3);
	}
	public int Score(int p,int c,int m){
		return(p+c+m);
	}
}
class Sem extends Exam{
	public String Sem= "4th";
	public String Year= "2nd";
	public void Details() {
		System.out.println("4th sem "+Sem );
		System.out.println("2nd year "+Year );
	}
}
public class MultiInheritanceDemo {

	public static void main(String[] args) {
		
		Sem s=new Sem();
		s.Details();
		s.Display();
		s.show();
		int total=s.Score(22, 34, 53);
		System.out.println("Total "+total);
	}

}
