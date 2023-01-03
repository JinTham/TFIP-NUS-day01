package day01;

public class Array2D {
    public static void main(String[] args){
        Integer[][] array = new Integer[4][3];
        System.out.printf("Rows: %d\n", array.length);
        System.out.printf("Cols: %d\n", array[0].length);
        array[0][0] = 0;
        System.out.printf("Value at 0,0: %d\n",array[0][0]);
    }
}