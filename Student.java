import java.util.*;
class Student{
    int StudentId;
    String name;
    double Percentage;

    public static void main(String[] args){
        Student s1 = new Student();
        s1.StudentId = 1;
        s1.name = "Aditya";
        s1.Percentage = 84.20;
        
        Student s2 =new Student();
        s2.StudentId = 2;
        s2.name = "Akash";
        s2.Percentage = 75.56;

        Student s3 = new Student();
        s3.StudentId = 3;
        s3.name = "Shubham";
        s3.Percentage = 67.88;

        s1.Display();
        System.out.println();
        s2.Display();

    }

    public void Details(int StudentId,String name,double Percentage){
        this.StudentId = StudentId;
        this.name = name;
        this.Percentage = Percentage;
    }

    public void Display(){
        System.out.println("Student id is : "+this.StudentId);
        System.out.println("Student name is : "+this.name);
        System.out.println("Student percentage is : "+this.Percentage);
    }
}