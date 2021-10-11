import java.util.*;
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    double r1=0,r2=0;
    System.out.println("Enter the values");
    double a=scan.nextDouble();
    double b=scan.nextDouble();
    double c=scan.nextDouble();
    
    double determinant=(b*b)-(4*a*c);
    double sqrt=Math.sqrt(determinant);
    if(determinant>0) {
    	r1=(-b+sqrt)/(2*a);
    	r2=(-b-sqrt)/(2*a);
    	System.out.println("Roots are " +r1+" and" +r2);
    }
    else if(determinant==0)
    {
    	System.out.println("Root is "+(-b+sqrt)/(2*a));
    }
    
	}

}
