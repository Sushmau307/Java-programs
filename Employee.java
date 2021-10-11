
import java.util.Scanner;
public class Employee {
String name;
int empid;
String contact;
int salary;
String department;
String designation;
double commission;

Employee(String name,int empid,String contact,int salary,String department,String designation){
this.name=name;
this.empid=empid;
this.contact=contact;
this.salary=salary;
this.department=department;
this.designation=designation;
}
double print(double percentage) {
double commission= (percentage/100)* salary;
return commission;
}
void show() {
System.out.println("name:" +name);
System.out.println("empid:" +empid);
System.out.println("contact:" +contact);
System.out.println("salary:" +salary);
System.out.println("department:" +department);
System.out.println("designation:" +designation);

}

}


