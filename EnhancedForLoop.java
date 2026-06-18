package LoopsinJava;

public class EnhancedForLoop {
    //enhanced for loop is used to fetch the values from a collectiom of values like array
    public static void main(String[] args) {
        int length=0;
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        for(int var:arr){
            System.out.println(var + " ");
            length++;
        }
        System.out.println("length of an array is : "+length);
    }
}
