import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter number");
int n=scan.nextInt();
int i=1;long factorial=1;
while(i<=n)
{
	factorial=factorial*i;
	i++;
}
System.out.printf("Factorial of %d =%d",n, factorial);


	}

}
