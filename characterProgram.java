package LoopsinJava;
import java.util.Scanner;
//WAJP to print ‘0’ to ‘9’ digit, ‘A’ to ‘Z’ and ‘a’ to ‘z’
public class characterProgram {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        for(char i=1; i<=128;i++){
//            if(i>=48 && i<=57 ||  i>=65 && i<=90 ||  i>=97 && i<=122){
//                System.out.print(i+" ");
//            }

            //OR
            if(i>='0'&& i<='9' || i>='a'&& i<='z' || i>='A'&& i<='Z'){
                System.out.print(i+" ");
            }
        }
    }

}
