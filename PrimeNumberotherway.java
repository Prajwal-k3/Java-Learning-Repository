package LoopsinJava;
import java.util.Scanner;
public class PrimeNumberotherway {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        boolean flag= true;
        if(num<=1){
            flag =false;
        }

            for(int i=2;i<Math.sqrt(num);i++){
                if(num%i==0){
                    flag=false;
                    break;
                }
            }
            System.out.println(flag?"number is prime" : "number is not prime");


    }
}
