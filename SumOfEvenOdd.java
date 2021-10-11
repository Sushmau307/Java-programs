import java.util.Scanner;
public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the digit");
int n=scan.nextInt();
int v1=0;int v2=0;
while(n>0)
{
	if((n%10)%2==0)
v1=v1+n%10;
	else
		v2=v2+n%10;
n=n/10;
}
System.out.println("Even Sum:"+v1+"Odd sum:"+v2);

}
	}

