import java.util.Scanner;
public class Float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    int num;
    System.out.println("Enter the number");
    num=scan.nextInt();
    if(num>0)
    {
    	System.out.println("positive");
    }
    else if(num<0)
    {
    	System.out.println("Negative");
    }
    else
    {
    	System.out.println("Zero");
    }
    if(num<1) {
    	System.out.println("Small");
    }
    else if(num>1000000)
    {
    	System.out.println("large");
    }
	}

}
