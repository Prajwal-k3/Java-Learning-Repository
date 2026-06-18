package Methods;
import java.util.Scanner;

public class program2 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        program2 p = new program2();
        System.out.println("execution starts");

       String s1= p.firstName();
        String s2= p.lastName();
        String s3= p.fullName(s1,s2);
//        System.out.println(s1);
//        System.out.println(s2);
        System.out.println(s3);
        System.out.println("execution ends");


    }
    String firstName(){
        System.out.println("enter ur first name");
        String f=sc.next();
        return f;
    }
    String lastName(){
        System.out.println("enter ur surname");
        String l=sc.next();
        return l;
    }
    String fullName(String f, String l){
        System.out.println("ur full name is:");
        String fu=f +" "+ l;
        return fu;
    }



}

