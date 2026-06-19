package OOP.Encapsulation;

class Student{
    //  we have to set data members private and methods public so that from outside no one can access that data directly but can access that with the help of methods but in that methods we can set condition according our benefit so that our  data will remain safe and there will be no misuse of that data

   private int rollNo;
   private String name;
   private int marks;
   private String result;

   //methods should be public
    public void  setData(int rollNo, String name,int marks ){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;


    }

    public  void getData(){
        if(rollNo>0){
            System.out.println("rollNo:-"+rollNo);
            System.out.println("name:- "+name);
            System.out.println("marks:- "+marks);
            if(marks>=35){
                result="pass";
            }
            else{
                result="fail";
            }
            System.out.println(result);


        }
        else {
            System.out.println("student has not entered  valid roll no");
            return;
        }
    }



}
public class Demo {
    public static void main(String[] args) {
        Student s=new Student();
        s.setData(60,"prajwal",100);
        s.getData();
    }
}
