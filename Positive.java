import java.util.Scanner;
public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n;
		Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number");
    n=scan.nextInt();
    if(n>0) {
    	System.out.println("positive");
    	
    }
    else
    {
    	System.out.println("Negative");
    }
	}

}
