package Array;

public class PrintArrayReverse {


    void display(){
        System.out.println("haan bhai use kr sakte hai");
    }
    public static void main(String[] args) {
        int arr[] = {4, 8, 99, 1, 2, 6, 77};

        int start=0;
        int end=arr.length-1;
        int temp=0;
        for(int i=0;i< arr.length/2;i++){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
