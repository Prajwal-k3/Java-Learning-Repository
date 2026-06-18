import java.util.Scanner;
public class Array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //User input array
        System.out.println("Decide a size of an array");
        int size =sc.nextInt();
        System.out.println("We are taking user input  1D array");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("We are printing user input  1D array");
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]*=2;
            }
            System.out.println(arr[i]+" ");
        }

    }

}
