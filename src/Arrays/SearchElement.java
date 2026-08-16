package Arrays;

public class SearchElement {
    public static void main(String[] args){
        int[] array = {232,12,53,64,86,35};
        int searchElement = 868;
        for(int i = 0 ; i< array.length ; i++){
            if(array[i] == searchElement){
                System.out.print("yes we got that element inside this array:" + searchElement +"/n index values of this elements inside array is:"+i);
            }
            else{
                System.out.print("not getting element inside this array");
            }
        }
    }
}
