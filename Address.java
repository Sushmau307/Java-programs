
public class Address {
	int houseno;
	String housename;
	String Street;
	String district;
	

	Address(int houseno,String housename,String Street,String district)
	{
	this.houseno=houseno;
	this.housename=housename;
	this.Street=Street;
	this.district=district;
	}
	void display() {
		
	    System.out.println("*****Address*****");
		System.out.println("houseno:" +houseno);
		System.out.println("housename:" +housename);
		System.out.println("Street:" +Street);
		System.out.println("district:" +district);
	
}
}
