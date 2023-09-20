//package Lecture 4 - Java Introduction to Programming;

public class Loop {
    public static void main(String[] args) {
       // int counter = 1;
        // for (int i=0 ; i<3 ; i++){
        // }
        for (int counter = 1 ; counter <= 20 ; counter++ ){
            if (counter%10!=0){
                System.out.print(counter + "\t"); // to print in row
            } else {
                System.out.println(counter);
            }
            //System.out.print(counter); // to print in column
        } 
    }
}
