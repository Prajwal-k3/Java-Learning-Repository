package Strings;
import java.util.Scanner;
public class NonRepeatingCharacter {

    public static void findNonRepeatingChar(String str){
        int start,end;

        for(start=0;start<=str.length()-1;start++){
            boolean flag =true;
            for(end=0;end<=str.length()-1;end++){

                if(start !=end){
                    if(str.charAt(start)==str.charAt(end)){
                        flag=false;
                        break;
                    }
                }

            }

                if(flag){
                    System.out.println("first non repeating character is: "+(str.charAt(start)));
                    break;
                }


        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        findNonRepeatingChar(s);

    }
}
