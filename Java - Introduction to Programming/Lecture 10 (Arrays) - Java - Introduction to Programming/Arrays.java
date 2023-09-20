
public class Arrays {
    public static void main(String[] args){ // here we are making array named 'args' of type 'String '
        int[] marks = new int[3];  
        
        //int marks[] = new int[3];  
        //also a valid syntax
        
        marks[0] = 97;    //phy marks
        marks[1] = 92;    //chem
        marks[2] = 95;    //eng

        //System.out.println(marks);   
        //it will print the actual loaction of array 'marks' like '[I@2f92e0f4' this value is called jargen value

        System.out.println(marks[0]); // to print the value of array at 0th index position

        for(int i = 1; i<3; i++){
            System.out.println(marks[i]);
        }
    }
}
