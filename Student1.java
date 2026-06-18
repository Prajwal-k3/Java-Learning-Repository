package Constructor;

import java.util.Scanner;

class Student{
    int rollNo;
    String name;
    String college;

    Student(int rollNo,String name,String college){
        this.name=name;
        this.college=college;
        this.rollNo=rollNo;
       // displayData();

    }

    void displayData(){
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(college);
        System.out.println(this);
    }
}
public class Student1 {
    public static void main(String[] args) {
        //Student s1 =new Student();  //object creation and default constructor calling
        //manually datamembers value allocation
//        s1.college="Gcoey";
//        s1.name="Shruti Ratnaparkhi";
//        s1.rollNo=57;
//        s1.displayData();

       // System.out.println(s1.college);

    }
}
