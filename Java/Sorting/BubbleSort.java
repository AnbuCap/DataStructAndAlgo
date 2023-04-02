// Bubble Sort
// An algorithm that compares the current number to the next number in the array. If lower it will swap
// Array = {20, 12, 32, 22, 6}
import java.util.*;

public class BubbleSort {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);       
        int choice, array[] = {20, 12, 32, 22, 6};
        do{
            System.out.println("Want to display the progress of the bubble sort? (1)Yes (2) No: ");
            choice = scan.nextInt();
        }while(choice != 1 && choice != 2);
        
        printUnsorted(array);
        bubbleSort(array, choice);
        printSorted(array);
        scan.close();
    }

    static void printUnsorted(int array[]){
        System.out.print("Unsorted array: ");
        for(int x = 0; x < array.length; x++){
            if(x == (array.length - 1)){
                System.out.print(array[x] + ".\n");
            }
            else{
                System.out.print(array[x] + ", ");
            }
        }
    }


    static void bubbleSort(int array[], int choice){
        int temp = 0, progressPrinted = 0, swapAmount = 0;
        for(int x = 0; x < array.length; x++) {
            for(int y = 0; y < array.length - 1; y++){
                if(array[y] > array[y + 1]){
                    if(choice == 1){
                        System.out.println(array[y] + " is greater than " + array[y+1] + "(swap)");
                    }
                     temp = array[y];
                     array[y] = array[y + 1];
                     array[y + 1] = temp;
                     swapAmount++;
                }
                if(choice == 1){
                    System.out.println(array[y] + " and " + array[y+1] + " appears to be in the right order");
                }
                progressPrinted++;
                if(choice == 1){
                    printProgress(array, swapAmount, progressPrinted);
                }
            }
        }
    }

    static void printProgress(int array[], int swap, int pAmount){
        System.out.print("Progress " + pAmount + ": ");
        for(int x = 0; x < array.length; x++){
            if(x == (array.length - 1)){
                System.out.print(array[x] + "(Total swap:" + swap + ").\n");
            }
            else{
                System.out.print(array[x] + ", ");
            }
        }
    }
    

    static void printSorted(int array[]){
        System.out.print("Sorted array: ");
        for(int x = 0; x < array.length; x++){
            if(x == (array.length - 1)){
                System.out.print(array[x] + ".\n");
            }
            else{
                System.out.print(array[x] + ", ");
            }
        }
    }
}
