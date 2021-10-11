import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
	
Employee employee1= new Employee("John",123,"12345",45000,"EPD","trainee");

Employee employee2= new Employee("Ritee",124,"12567",30000,"developer","trainee"); 

Employee employee3= new Employee("Rithu",125,"12500",35000,"EPD","manager"); 

Employee employee4= new Employee("Rishu",126,"90025",30000,"developer","trainee"); 

Employee employee5= new Employee("sham",127,"12005",20000,"EPD","manager"); // employee1.takeInput();

Address address1=new Address(12,"Anandhanilaya","Gokulam","Mysore");

Address address2=new Address(9,"Lakshmi","Metagalli","Mysore");

Address address3=new Address(62,"Kanasu","vontikoppal","Mysore");

Address address4=new Address(80,"sundhara","Brindhavana","Mysore");

Address address5=new Address(312,"nilaya","j p nagar","Mysore");


System.out.println("-----------Employee1 details-------------");
employee1.show();
address1.display();
double com1=employee1.print(5);
System.out.println("Comission is:" +com1);
System.out.println("salary is:" +employee1.salary);

System.out.println("-----------Employee2 details-------------");
employee2.show();
address2.display();
double com2=employee2.print(10);
System.out.println("Comission is:" +com2);
System.out.println("salary is:" +employee2.salary);

System.out.println("-----------Employee3 details-------------");
employee3.show();
address3.display();
double com3=employee3.print(9);
System.out.println("Comission is:" +com3);
System.out.println("salary is:" +employee3.salary);

System.out.println("-----------Employee4 details-------------");
employee4.show();
address4.display();
double com4=employee4.print(8);
System.out.println("Comission is:" +com4);
System.out.println("salary is:" +employee4.salary);

System.out.println("-----------Employee5 details-------------");
employee5.show();
address5.display();
double com5=employee5.print(4);
System.out.println("Comission is:" +com5);
System.out.println("salary is:" +employee5.salary);


	
	
	}
}

