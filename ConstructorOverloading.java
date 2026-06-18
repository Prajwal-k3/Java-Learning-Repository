package Constructor;

class  Parent{
    Parent(){
        this(10);
        System.out.println("no argument constructor");
    }
    Parent(int farm){
        System.out.println("int arg constructor "+farm);
    }

}
class child extends Parent{
    child(){

        super();
        System.out.println("child class constructor");


    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        child c=new child();

    }
}
