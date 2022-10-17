/* Write a program to sort the elements of list so that they are in ascending order. */

import java.util.Scanner;

public class AscendingSorting
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] list = new int[10];
        System.out.print("Enter the list: ");
        for(int i = 0; i < 10; i++){
            int temp = in.nextInt();
            list[i] = temp;
        }

        sort(list);
        for(int n : list){
            System.out.print(n + " ");
        }
    }

    static void sort(int[] list){
        for(int i = 0; i < list.length-1; i++){
            for(int j= 1; j < list.length; j++){
                if(list[j-1] > list[j]){
                    int temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
