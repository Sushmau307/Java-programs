import java.util.Scanner;
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=0;
    int i,sum=0;
    double average;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter n value");
    for(i=0;i<5;i++)
    {
    n=scan.nextInt();
    
    sum=sum+n;
    }
    average=sum/5;
    System.out.println("The sum is:"+sum+"\nThe average is:"+average);
	}

}
