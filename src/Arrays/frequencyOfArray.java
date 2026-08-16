package Arrays;

public class frequencyOfArray {
    public static void main(String[] args){
        int[] array1 = {23,12,42,53,64,23,896,36,23,12,23,12,23};
        int frequency = 23;
        int count = 0;
        for(int i = 0 ; i < array1.length ;i++){
            if(array1[i] == frequency){
                count++;
            }
        }
        System.out.print("frequency of 23 is:" + count);
    }
}
