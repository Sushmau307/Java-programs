import java.util.Scanner;
public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    int a,b,c,d,e;
    int sum=0;
    int average=0;
    System.out.println("Enter 5 values");
    a=scan.nextInt();
    b=scan.nextInt();
    c=scan.nextInt();
    d=scan.nextInt();
    e=scan.nextInt();
    sum=a+b+c+d+e;
    average=sum/5;
    System.out.println(sum);
    System.out.println(average);
	}

}
