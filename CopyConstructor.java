package Constructor;

class Employee{
    int id;
    String name;
    String company;

    Employee(int id,String name,String company){
        this.id=id;
        this.name=name;
        this.company=company;
        System.out.println("inside parameterize constructor");

    }
    Employee(Employee emp){
        System.out.println("inside copy constructor");
        this.id=emp.id;
        this.name=emp.name;
        this.company="fjidwhfuih";
    }
    void  displayData(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(company);

    }


}


public class CopyConstructor {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"p","info");
        Employee e2=new Employee(e1);
        e1.displayData();
        e2.displayData();
    }



}
