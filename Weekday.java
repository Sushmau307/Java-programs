import java.util.*;
public class Weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the input");
    int day=scan.nextInt();
    String dayName=" ";
    switch(day)
    {
    case 1: dayName="Monday";
    break;
    case 2: dayName="Tuesday";
    break;
    case 3: dayName="Wednesday";
    break;
    case 4: dayName="Thursday";
    break;
    case 5: dayName="Friday";
    break;
    case 6: dayName="Saturday";
    break;
    case 7: dayName="Sunday";
    break;
    default:dayName="Invalid";
    }
	}

}
