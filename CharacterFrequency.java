package Strings;
import java.util.Scanner;
public class CharacterFrequency {
    public static void characterOccurrence(String str) {

        for (int start = 0; start <= str.length() - 1; start++) {

            //now we check if we have already used this character if we did then we skip it otherwise we will do next operations
            boolean prevUsed=false;
            for(int prev=0;prev<=start-1;prev++){
                if(str.charAt(start)==str.charAt(prev))
                prevUsed=true;
            }
            if(prevUsed){
                continue;
            }



            //actual counting
            int count = 0;


            for (int end = 0; end <= str.length() - 1; end++) {

                if (str.charAt(start) == str.charAt(end)) {
                            count++;



                }

            }
            System.out.println("Occurence of  " + str.charAt(start) + " is:- " + count);

        }
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            sc.close();
            characterOccurrence(s);

        }
    }




