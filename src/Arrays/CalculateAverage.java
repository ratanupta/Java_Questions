package Arrays;

import java.sql.SQLOutput;

public class CalculateAverage {
    public static void main(String[] args){
        int[] array = {32,54,76,86,23,65};
        double average = 0;
        int sum = 0;
        for(int i = 0 ; i< array.length ;i++){
            sum = sum + array[i]; // print the sume of array
        }
        System.out.print("Sume of array is :"+ sum);
        // calculate average
        average = sum/array.length;

        System.out.print("Average of aray is:" + average);
    }
}
