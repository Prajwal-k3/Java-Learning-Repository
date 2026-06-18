package Constructor;

class Singletonclass {

    //static private datamember of class
static private Singletonclass obj=null;

// constructor should be private

   private Singletonclass (){
          super();
    }

    public static Singletonclass getInstance(){
       if(obj == null){
            obj=  new Singletonclass();
        }
       return  obj;
    }
}
class  Driver{
    public static void main(String[] args) {
        Singletonclass obj1=Singletonclass.getInstance();
        System.out.println(obj1);
        Singletonclass obj2=Singletonclass.getInstance();
        System.out.println(obj2);

    }
}
