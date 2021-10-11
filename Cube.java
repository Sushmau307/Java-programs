import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter number");
    int num=scan.nextInt();
    
    for(int i=1;i<=num;i++) {
    	System.out.println("Number is: "+i+" and cube of "+i+" is : "+(i*i*i));
    }
	}

}
