package Array;

import java.util.Scanner;

public class Secondmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {4, 8, 99, 1, 2, 6, 77};
        int max=arr[0];
        int secondLarge=Integer.MIN_VALUE;

        for (int i = 1; i <= arr.length-1; i++) {
            if(max<arr[i]){
                secondLarge=max;
                max=arr[i];

                }
            else if(secondLarge < arr[i]){
                secondLarge=arr[i];
            }


        }


        System.out.println("second largest element of an array is :-"+ secondLarge);
    }
}


