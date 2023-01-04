package day01.source;

public class Array {
    public static void main(String[] args){
        //create an array
        Integer[] array = new Integer[6];
        //size of the array
        System.out.printf("Size of this array is %d.\n",array.length);
        //assignment into the array
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
        array[5] = 5;
        for (int i=0;i<array.length;i++){
            System.out.printf("Element %s is "+array[i]+"\n",i);
        }
    }
}