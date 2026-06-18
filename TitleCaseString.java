package Strings;
import java.util.Scanner;
public class TitleCaseString {
   static void convertStringIntoTitleCasr(String str) {

       char arr[] = str.toLowerCase().toCharArray();
       //we have to do capitalization of first index of a loop
       boolean flag = true;
       if (arr.length == 0) {
           flag = false;
       }
       if (flag) {

           if (arr[0] >= 97 && arr[0] <= 122) {
               arr[0] = Character.toUpperCase(arr[0]);
           }


           for (int i = 1; i < arr.length; i++) {
               //skip spaces
               if (arr[i] == ' ') {
                   continue;
               }
               //capitalizing character whose earlier index value is space
               if (arr[i - 1] == ' ' && (arr[i] >= 97 && arr[i] <= 122)) {
                   arr[i] = Character.toUpperCase(arr[i]);
               }
               else{
                   continue;
               }

           }


           for (char c : arr) {      //if instead of printing here if we need to return a string to main method then we can create object of string class and then pass that char arr in it as an argument
                                         //ex:- String result = new String(arr);
                                                 //   return result; and then can print it in main method
               System.out.print(c);
           }
       }
       else{
           System.out.println("u have not entered valid string");
       }
   }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String s= sc.nextLine();
        sc.close();
        convertStringIntoTitleCasr(s);

    }

}
