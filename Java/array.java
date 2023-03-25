package Java;
import java.util.*; // import the scanner function.

public class array {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in); // create a scanner called scan 
        double number[]; // set array vaule as double so we can do decimal
        int size; // size as int.

        // Display message asking how much numbers you want in array
        System.out.print("How many numbers would you like to put in the array: "); 
        size = scan.nextInt(); // input the amount of number
        number = new double[size]; // set the length of the number array to size.

        // for loop for entering the numbers that is going to be store in your array.
        for(int x = 0; x < size; x++){
            System.out.print("Enter number " + (x+1) + ": ");
            number[x] = scan.nextDouble(); // x will increment each loop in the array 
                                           // so the number will not write over last array index.
        }

        // Display the number in the array.
        System.out.print("Here are the numbers in the array: ");
        System.out.print(number[0]); 
        // for loop to display the rest of the number.
        for(int x = 1; x < size; x++){
            System.out.print(", " + number[x]);
        }

        // close the scanner because we dont need it anymore.
        scan.close();
    }
}