import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int number,rem,sum=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter number");
    number=scan.nextInt();
    
    while(number>0)
    {
    	rem=number%10;
    	sum=sum+rem;
    	number=number/10;
    	
    }
    System.out.println("Sum of digits is" +sum);
	}

}
