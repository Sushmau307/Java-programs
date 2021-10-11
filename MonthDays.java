import java.util.*;
public class MonthDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    int days;
    String Month=" ";
    System.out.println("Enter the month number");
    int month=scan.nextInt();
    switch(month)
    {
    case 1: Month="January";
            days=31;
            break;
    case 2: Month="February";
    days=28;
    break;
    case 3: Month="March";
    days=31;
    break;
    case 4: Month="April";
    days=30;
    break;
    case 5: Month="May";
    days=31;
    break;
    case 6: Month="June";
    days=30;
    break;
    case 7: Month="July";
    days=31;
    break;
    case 8: Month="August";
    days=31;
    break;
    case 9: Month="September";
    days=30;
    break;
    case 10: Month="October";
    days=31;
    break;
    case 11: Month="November";
    days=30;
    break;
    case 12: Month="December";
    days=31;
    break;
    }
	}

}
