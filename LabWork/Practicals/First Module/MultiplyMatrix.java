/* Write a program in Java to multiply two matrix. */

import java.util.Arrays;

public class MultiplyMatrix
{
    public static void main(String[] args)
    {
        int[][] mat1 = {{1,2,3}, // Initialising matrix 1
                {4,5,6},
                {7,8,9}};
        int[][] mat2 = {{10,11,12}, // Initialising matrix 2
                {13,14,15},
                {16,17,18}};
        int length = mat1.length;

        int[][] product = new int[length][length]; // Initialising the product matrix

        for(int i = 0; i < length; i++){ // Traversing through the ith row of matrix 1
            int col = 0; // The column of the matrix 2 that will be taken under product
            int[] temp = new int[length]; // Initialing the temp matrix which represents row in the product matrix
            for(int j = 0; j < length * length; j++){ // For every row in product matrix, there will be n*n multiplications of the elements
                temp[col] += mat1[i][j%length] * mat2[j%length][col]; // The formula for product of matrices for each element
                if(j%length == length - 1) col++; // Shifting to the next column when j reaches the end of the previous column
            }
            product[i] = temp; // The ith row of the product matrix will be equal to the temp matrix
        }
        System.out.println("Product: ");
        for(int[] row : product){ // Printing the product matrix
            System.out.println(Arrays.toString(row));
        }
    }
}
