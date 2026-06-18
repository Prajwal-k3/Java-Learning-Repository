package Strings;

public class StringsLectures {
    public static void main(String[] args) {
//        int a=20;
//        String name = "Shivam Sharma";
//        char [] channel= {'c','o','d','i','n','g',' ','w','a','l','l'};
//       // String name1 []={"dg"};
//        String cName="coding wall";
//        String yName="coding wall";
//        System.out.println(a);
//        System.out.println(name);
//        System.out.println(channel);
//        System.out.println(name.length());
//        System.out.println(name==cName);
//        System.out.println(yName==cName);
//        String obj1= new String("ofoijfoj");
//        String obj2= new String("ofoijfoj");
//        System.out.println(obj1==obj2);

//        String a="Hello dada";
//        System.out.println(a);
//        a="Hello rao saheb";
//        System.out.println(a);

        System.out.println("StringBuffer are mutable in nature");
        StringBuffer sbr1=new StringBuffer("Hello sir");
        System.out.println(sbr1);
        sbr1.append(" ji");  //modify it w/o changing its mamory add
        System.out.println(sbr1);

        StringBuffer s1= new StringBuffer(String.valueOf(456));
        System.out.println(s1);
       // s1=String.valueOf(784); :- it will give an error


    }
}
