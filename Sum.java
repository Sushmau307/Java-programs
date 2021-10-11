import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    int n,sum=0,i;
    System.out.println("Enter the value of n");
    n=scan.nextInt();
    for(i=0;i<=n;i++)
    {
    	sum=sum+i;
    }
    System.out.println(sum);
	}

}
