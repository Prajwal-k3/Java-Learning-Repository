package OOP;

class Human{      //parent class
    String name;
    String surName;

    void displayData(){
        System.out.println("i can eat");


    }

}
class student extends  Human{

    // child class
    int rollNo;
    float cgpa;
    void study(){
        System.out.println("i can study well");

    }
    void displayData(){
        System.out.println("we are in student class displayData method");
        this.study();
        System.out.println(rollNo+" "+cgpa);
        super.displayData();
    }

}
public class SingleLevelinheritance {
    public static void main(String[] args) {
        examResult e=new examResult();
        e.cgpa=9.8f;
        e.rollNo=60;
        e.name="prajwal";
        e.result="pass with distinction";
         e.marks=98;

        e.displayResult();


    }
}
