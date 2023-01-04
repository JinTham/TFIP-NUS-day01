package day01.source;

import java.io.Console;

public class DotProduct {
    /**
     * @param args
     */
    public static void main(String[] args){
        Console cons = System.console();
        //int rows = Integer.parseInt(args[0]);
        //int cols = Integer.parseInt(args[1]);
        int rows = 4;
        int cols = 3;
        int[][] matrix = new int[rows][cols]; 
        int[] weight = new int[rows];
        String input;
        String[] rowInput;
        String weightInput;
        int[] result = new int[rows];
        //Create matrix from user input
        for (int i=0;i<rows;i++){
            input = cons.readLine("Enter %d separate numbers for row%d: ",cols,i);
            rowInput = input.trim().split(" ");
            for (int j=0;j<rowInput.length;j++){
                matrix[i][j] = Integer.parseInt(rowInput[j]);
            }
        }
        //Create weight from user input
        for (int k=0;k<rows;k++){
            weightInput = cons.readLine("Enter 1 number for weight%d: ",k);
            weight[k] = Integer.parseInt(weightInput.trim());
        }
        //Perform dot product
        for (int l=0;l<rows;l++){
            int rowSum = 0;
            for (int m=0;m<cols;m++){
                rowSum += matrix[l][m] * weight[l]; 
            }
            result[l] = rowSum;
        }

        for (int z=0;z<result.length;z++){
            System.out.printf("%d\n", result[z]);
        }
    }
}