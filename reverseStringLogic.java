package Strings;
import java.util.Scanner;
public class reverseStringLogic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        boolean flag=true;
        int start=0;
        int end=str.length()-1;
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end)){
                flag=false;
                break;

            }
            else {
                start++;
                end--;
            }
        }
        if (flag){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
