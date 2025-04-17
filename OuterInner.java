package OOPS;
class Parcel{
	class Destination{
		public void desti(String loc) {
			System.out.println(loc);
		}
	}
class Contents {
	public void weight(double w) {
		System.out.println(w);
	}
}
}
public class OuterInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel p= new Parcel();
		Parcel.Destination pp= p.new Destination();
		Parcel.Contents ps= p. new Contents();
		pp.desti("HH");
		ps.weight(12.454);  
	}

}
