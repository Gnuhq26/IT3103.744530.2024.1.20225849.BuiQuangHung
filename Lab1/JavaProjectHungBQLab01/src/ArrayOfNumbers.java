import java.util.Scanner;

public class ArrayOfNumbers {
    // Function to sort elements in an array
    public static void bubbleSort (int[] arr) {
        int n = arr.length;
        for (int i = 0 ; i < n - 1 ; i++) {
            for(int j = 0 ; j < n - i - 1 ; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    // Function to sum elements in array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    // Function to calculate the average value of elements in an array
    public static double calculateAverage(int[] arr) {
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }
    // Function to print the elements of array
    public static void printArray (int[] arr, int n) {
        for (int i = 0 ; i < n ; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter the size of array
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        // Array declaration
        int array[] = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        
        System.out.println("Inputed Array: ");
        printArray(array, n);
        System.out.println("Sorted Array:");
        bubbleSort(array);
        printArray(array, n);
        System.out.println("The sum of array is " + calculateSum(array));
        System.out.println("The average of array is " + calculateAverage(array));

        sc.close();
    }
}
