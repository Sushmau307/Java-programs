import java.util.Scanner;
public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y,z;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the numbers");
x=scan.nextInt();
y=scan.nextInt();
z=scan.nextInt();
if(x>y && x>z)
{
	System.out.println("largest number is" +x);
	
}
else if(y>z)
{
	System.out.println("largest number is" +y);
}
else
{
	System.out.println("largest number is" +z);
}
	}

}
