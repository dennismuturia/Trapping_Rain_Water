import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    //Parse in the array
    public static  int waterStart(Integer[] n){
        List<Integer>diff = new ArrayList<>();
        int start=0;
        for (int i=0; i <n.length; i++){
          if ((n[i] >= 1) && (n[i]>n[i + 1])){
              start = n[i];
              break;
          }
        }
        //Finding out the start definately
        int max = (int) Collections.max(Arrays.asList(n));


        int difference = 0;//Initialize the volume of water
        for (int j = Arrays.asList(n).indexOf(start); j <= n.length; j++){
                try {
                   difference = start - n[j];
                   if (difference >= 0){
                       diff.add(difference);
                   }

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
       Integer[] arr = {3, 0, 0, 2, 0, 4};
        waterStart(arr);
    }
}
