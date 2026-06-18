package _2Conditionalstatement;
// WAJP to check if the number is multiple of 5 if yes display ‘hi five’, if the number is divisible by 2
//display ‘hi two’, if the number is divisible by 5 and 2 display ‘hi, five two’.
import java.util.Scanner;
public class IFStatement {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        if(num%5==0 && num%2 !=0){
            System.out.println("hi fi");
        }
        else if(num%5 !=0 && num%2 ==0){
            System.out.println("hi two");
        }
        else if(num%5 ==0 && num%2 ==0){
            System.out.println("hi fi two");
        }
    }
}
