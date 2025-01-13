import java.util.*;
class Employee{
    
    int empId = 0;
    String empName;
    int empSalary;
    
    public Employee(){
        
    }
    public Employee(int empId){
        this.empId = empId;
        // System.out.println(this.empId);
    }
    public Employee(int empId,String empName){
        this.empId =empId;
        this.empName = empName;
        // System.out.println(this.empId);
        // System.out.println(this.empName);
    }
    public Employee(int empId,String empName,int empSalary){
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        // System.out.println(this.empId);
        // System.out.println(this.empName);
        // System.out.println(this.empSalary);
    }
    public void Display(){
        System.out.println("Enmplyee id is: "+empId);
        System.out.println("Emplyee name is: "+empName);
        System.out.println("Emplyee salary is: "+empSalary);
        System.out.println();
    }

    public static void main(String[] args){
        Employee e1 = new Employee(1,"Akash",15000);
        Employee e2 = new Employee(2);
        Employee e3 = new Employee(3,"Aditya");


       e1.Display();
       e2.Display();
       e3.Display();


        

        
    }
}
    