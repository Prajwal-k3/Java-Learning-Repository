package OOP;

 class examResult extends student {
     String result;
     int marks;

     void displayResult(){
         System.out.println(name + " "+ marks +" "+ result +" "+ cgpa);
         this.displayData();
     }

     @Override
     void displayData() {
         System.out.println("khushiya he sabhu aur");
     }
 }


