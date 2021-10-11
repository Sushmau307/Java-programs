import java.util.Scanner;
public class AtmTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("Forsavings press 1\nFor Current press 2");
    int choice=scan.nextInt();
    
    switch(choice) {
    case 1:
    	System.out.println("You have choosen savings accounts");
    	System.out.println("Choose operation\npress 'w' for withdraw\npress 'd' for deposit");
    	char op=scan.next().charAt(0);
    	switch(op) {
    	case 'w':
    		System.out.println("You have choosen withdrawal.\nEnter the amount");
    		int amount=scan.nextInt();
    		System.out.println("Enter pin");
    		int pin=scan.nextInt();
    		System.out.println("Transactionin progress");
    		System.out.println("Amount="+amount);
    		break;
    	case 'd':
    		System.out.println("You have choosen deposit.\nEnter the amount");
    		int amount1=scan.nextInt();
    		System.out.println("Enter pin");
    		int pin1=scan.nextInt();
    		System.out.println("Transactionin progress");
    		System.out.println("Amount="+amount1);
    		break;
    
    	}
    	break;
    case 2:
    	System.out.println("You have chosen current account");
    	System.out.println("Enter company name");
    	char c=scan.next().charAt(0);
    	switch(c) {
    	case 'w':
    		System.out.println("You have choosen withdrawal.\nEnter the amount");
    		int amount=scan.nextInt();
    		System.out.println("Enter pin");
    		int pin=scan.nextInt();
    		System.out.println("Transactionin progress");
    		System.out.println("Amount="+amount);
    		break;
    	case 'd':
    		System.out.println("You have choosen deposit.\nEnter the amount");
    		int amount1=scan.nextInt();
    		System.out.println("Enter pin");
    		int pin1=scan.nextInt();
    		System.out.println("Transactionin progress");
    		System.out.println("Amount="+amount1);
    		break;
    
    	}
    	break;
    }
	}

}
