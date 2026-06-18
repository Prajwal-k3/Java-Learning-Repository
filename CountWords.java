package Strings;
import java.util.Scanner;
public class CountWords {
    static void splitArray(String str){
//        if(str.trim().length()==0)   //or
        if(str.trim().isEmpty())
        {
            System.out.println("total number of words in a "+str+ " is: "+ 0);
            return;
        }
             String arr[]= str.trim().split("\\s+");
        System.out.println("total number of words in a "+str+ " is: "+ arr.length);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur string");
        String s= sc.nextLine();
        splitArray(s);
        sc.close();
    }

}
