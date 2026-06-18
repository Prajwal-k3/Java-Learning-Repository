package Strings;
import java.util.Arrays;

public class InterviewImp {
    public static void main(String[] args) {
        String str="Coding wallah";
        // 1.length of a string
        //System.out.println(str.length());


        //2. find a particular index in a string

       // System.out.println("third element of a string is: " +str.charAt(2));

        //3. no of vowels in a string
        //there are 2 ways to solve this question

        //first way
        int count=0;
//        for(int i=0; i<str.length();i++){
//            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
//                count++;
//            }
//         }
//        System.out.println("total vowels in a sting "+str+ "is:"+count);


        //second way is we can convert a string into an array and then we can find easily with the help of enhanced loop
//          char charr[]=str.toCharArray();
//          for(char ch: charr){
//              if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                  count++;
//              }
//          }
//        System.out.println("total vowels in a sting "+str+ "is:"+count);

          //4 comparing equality in string
        String s1="         prajwal kute";
        String s2="Prajwal Kute";

        System.out.println(s2.replace("P","__p"));
       // System.out.println(s1.equals(s2));  //it gives false because p k are lower and somewhere upper

        //if we have to ignore char upper or lower we just need to check whether the characters are same onlu

//        System.out.println(s1.equalsIgnoreCase(s2));

        //5 conversion into upper & lower case

        //string is immutable so original string madhe te farak nahi padnar

//        System.out.println(s2.toUpperCase());
//        System.out.println(s1.toLowerCase());

        //6 substring
//        System.out.println(s1.substring(4));
//        System.out.println(s1.substring(4,8));  //starting index will be included and ending will be execluded
//
        //7 contains method in string;- it just check the argument string sequence is present in our string or not

        //System.out.println(s1.contains("wal"));

        //8 trim method : it is used to remove starting and ending spaces from the string it do not cut spaces in between that string
//        System.out.println(s1);
//        System.out.println(s1.trim());

        //9 reverse

StringBuffer s3=new StringBuffer("hello rana saheb");
        System.out.println(s3);
        s3.reverse();
        System.out.println(s3);

        System.out.println(s3.reverse().replace(6,10," prajwal kute patil"));

        System.out.println(s3);


        //10 split method it is used to convert string into array and each word not character will be asign to seperate index in an array
        String s5= "bhau saheb dada aamche mothe bhau";
        String arr[]= s5.split(" ");
        System.out.println(Arrays.toString(arr));


    }
}
