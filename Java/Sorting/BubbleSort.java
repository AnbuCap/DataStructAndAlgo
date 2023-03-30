// Bubble Sort
// An algorithm that compares the current number to the next number in the array. If lower it will swap
// Array = {20, 12, 32, 22, 6}

public class BubbleSort {
    public static void main(String[] arg){
        int array[] = {20, 12, 32, 22, 6};
        printUnsorted(array);
        bubbleSort(array);
        printSorted(array);
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


    static void bubbleSort(int array[]){
        int temp = 0;
        for(int x = 0; x < array.length; x++) {
            for(int y = 0; y < array.length - 1; y++){
                if(array[y] > array[y + 1]){
                     temp = array[y];
                     array[y] = array[y + 1];
                     array[y + 1] = temp;
                }
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
