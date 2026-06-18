package LoopsinJava;
import java.util.Scanner;
public class EvenfactorsAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number whose factors u want ");
        int num= sc.nextInt();
        int sum=0;
        System.out.println("all factors of "+num+ "are:-");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("sum of all the factors of "+num+ "is :-" +sum);
    }
}
