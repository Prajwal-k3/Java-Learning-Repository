import java.util.Scanner;
public class LabelledLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        OuterLoop:
        {
            for(int i=1;i<=4;i++){
                innerLoop:
                for(int j=1;j<=4;j++)
                {
                    if(j==3)
                        break OuterLoop;
                    System.out.println("i="+i +" j="+j);
                }

            }
        }

    }
}
