import java.util.ArrayList;
import java.util.Arrays;

public class ProgramsOnArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 2, 9, 10, 16, 30, 45, 32}; // The array

        System.out.println("Sum of the elements in the array: " + sum(arr));
        System.out.println("Product of the elements in the array: " + product(arr));
        System.out.println("Numbers divisible by 15 in the array: " + num_div_by_15(arr));
        System.out.println("The maximum element in the array is: " + max(arr));
        System.out.println("The minimum element in the array is: " + min(arr));
        sort(arr); // Calling the sort function
        System.out.print("Sorted Array: " + Arrays.toString(arr));
    }

    static int sum(int[] arr){ // Sum of all the elements in the array
        int sum = 0;
        for(int n : arr){
            sum += n;
        }
        return sum;
    }

    static int product(int[] arr){ // Product of all the elements in the array
        int product = 1;
        for(int n : arr){
            product *= n;
        }
        return product;
    }

    static ArrayList<Integer> num_div_by_15(int[] arr){ // List of numbers divisible by 15 in the array
        ArrayList<Integer> ans = new ArrayList<>();
        for(int n : arr){
            if(n % 15 == 0) ans.add(n);
        }
        return ans;
    }

    static int max(int[] arr){
        int max = arr[0];
        for(int n : arr){
            if(n > max) max = n;
        }
        return max;
    }

    static int min(int[] arr){
        int min = arr[0];
        for(int n : arr){
            if(n < min) min = n;
        }
        return min;
    }

    static void sort(int[] arr){ // Sorting the array using bubble sort algorithm
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]) swap(arr, i, j);
            }
        }
    }

    static void swap(int[] arr, int i, int j){ // Swaps the 2 elements of the array
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
