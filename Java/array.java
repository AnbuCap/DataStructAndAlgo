package Java;
import java.util.*;

public class array {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        double number[];
        int size;

        System.out.print("How many numbers would you like to put in the array: ");
        size = scan.nextInt();
        number = new double[size];

        for(int x = 0; x < size; x++){
            System.out.print("Enter number " + (x+1) + ": ");
            number[x] = scan.nextDouble();
        }

        System.out.print("Here are the numbers in the array: ");
        System.out.print(number[0]);
        for(int x = 1; x < size; x++){
            System.out.print(", " + number[x]);
        }

        scan.close();
    }
}