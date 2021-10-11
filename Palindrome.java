import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    int n;
    int x,y=0,temp=0;
    System.out.println("Enter the number");
    n=scan.nextInt();
    x=n;
    while(n!=0)
    {
    	x=n%10;
    	n=n/10;
    	temp=temp*10+x;
    }
    if(temp==y) {
    	System.out.println("Palindrome");
    }
    else
    {
    	System.out.println("Not palindrome");
    }
	}

}
