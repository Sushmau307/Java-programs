import java.util.*;
public class DecimalPlaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    
    System.out.println("Enter floating point numbers");
    double x=scan.nextDouble();
    double y=scan.nextDouble();
    
    x=Math.round(x*1000);
    x=x/1000;
    
    y=Math.round(y*1000);
    y=y/1000;
    
    if(x==y)
    {
    	System.out.println("Same upto three decimal places");
    }
    else
    	System.out.println("Different");
	}

}
