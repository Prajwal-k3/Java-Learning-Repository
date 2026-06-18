package Array;
import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //arry input
        int row=4;
        int col= 6;
        int arr[][]=new int[row][col];
        System.out.println("take an array input");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("print an 2D array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(arr[i][j]);
            }
        }

        System.out.println("we have to find a element in array ");
        System.out.println("enter an number");
        int num= sc.nextInt();
        int count=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==num){
                    count++;
                   break;
                }



            }
        }
        if(count!=0){
            System.out.println("user inputed element is present in an array");
        }
        else{
            System.out.println("not present");
        }



    }
}
