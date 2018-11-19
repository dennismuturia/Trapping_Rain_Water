import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    //Parse in the array
    static int arr[] = new int[]{3,1,2,0,4};
    public static  int waterStart(Integer[] n){
        List<Integer>diff = new ArrayList<>();
        //get the first level
        //loop through the array to get the start column
        //Check if they are side by side
        int start=0;
        for (int i=0; i <n.length; i++){
          if (n[i] >= 1){
              start = n[i];
              break;
          }
        }
        //Find the highest peak of the array
        int max = (int) Collections.max(Arrays.asList(n));
       // System.out.println(max);
        //System.out.print(start);
        //So now calculate the volume of water

        int difference = 0;//Initialize the volume of water
        for (int j = Arrays.asList(n).indexOf(start); j <= n.length; j++){
                try {
                   difference = max - n[j];
                   diff.add(difference);
                }catch (IndexOutOfBoundsException e){
                    difference = 0;
                }


        }
        int sum = 0;
        for(int k: diff){
            sum+=k;

        }
        System.out.println(sum);
        return 0;
    }



    public static void main(String args[]){
       Integer[] arr = {2,0,2,5,9};
        waterStart(arr);
    }
}
