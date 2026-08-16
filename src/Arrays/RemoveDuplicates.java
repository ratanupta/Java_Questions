package Arrays;

public class RemoveDuplicates {
    public static void main(String[] args){
        int [] arrray = {23,12,42,53,64,23,896,36,23,12,23,12,23};
        int length = arrray.length;
        for(int i = 0 ; i< arrray.length ; i++){
            for(int j = i+1 ; j < arrray.length ; j++){
                if(arrray[i] > arrray[j]){
                    int temp = arrray[i];
                    arrray[i] = arrray[j];
                    arrray[j] = temp;
                }
            }
        }
        int j =0;
        for(int i = 0 ; i < length ; i++){
            if(arrray[i] != arrray[j]){
                j++;
                arrray[j] = arrray[i];
            }
        }
        for(int i = 0 ; i < length ; i++){
            System.out.print(" "+arrray[i]);
        }
    }
}
