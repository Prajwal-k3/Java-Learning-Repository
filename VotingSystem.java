package Projects._1;
import java.util.Scanner;
public class VotingSystem {
    static int bjp, aap, sena, cng, samaj , nota;
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println();
        System.out.println("Welcome for the voting");
        System.out.println("enter the population of the country is :");
        int pop = sc.nextInt();
        System.out.println();

        System.out.println("1.bjp, 2.aap, 3.sena, 4.cng, 5.samaj , 6.nota");
        System.out.println("enter the option");
        for(int i =1; i<= pop; i++){
            int vote = sc.nextInt();
            switch(vote){
                case 1: {
                    System.out.println("BJP");
                    bjp++;
                    break;
                }

                case 2: {
                    System.out.println("AAP");
                    aap++;
                    break;
                }
                case 3: {
                    System.out.println("SENA");
                    sena++;
                    break;
                }
                case 4: {
                    System.out.println("CNG");
                    cng++;
                    break;
                }
                case 5: {
                    System.out.println("SAMAJ");
                    bjp++;
                    break;
                }
                case 6: {
                    System.out.println("NOTA");
                    nota++;
                    break;
                }
                case 7: {
                    System.out.println("enter the valid option");
                    i--;
                    break;
                }

            }
        }
        System.out.println("thank you for participation in voting");
        System.out.println("wait for the result");

        int count1= bjp>((aap>sena)?aap:sena)?bjp:((aap>sena)?aap:sena);
        int count2=cng>((samaj>nota)?samaj:nota)?cng:((samaj>nota)?samaj:nota);
        int finalcount= (count1>count2)?count1:count2;
        if(finalcount==bjp){
            System.out.println("bjp wins this election with"+bjp + "votes");
        }
        else if(finalcount==aap){
            System.out.println("aap wins this election with"+aap + "votes");
        }
        if(finalcount==cng){
            System.out.println("cng wins this election with"+cng + "votes");
        }
        if(finalcount==sena){
            System.out.println("sena wins this election with"+sena + "votes");
        }
        if(finalcount==samaj){
            System.out.println("samaj wins this election with"+samaj + "votes");
        }
        if(finalcount==nota){
            System.out.println("peoples are educates they chose nota" +nota + "votes");
        }

        System.out.println();
        System.out.println("hope peoples are happy with the result");


    }
}
