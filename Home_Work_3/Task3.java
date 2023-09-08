package Home_Work_3;

import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum is " + Arrays.stream(arr).min(Integer::compareTo).get());
        System.out.println("Maximum is " + Arrays.stream(arr).max(Integer::compareTo).get());
        System.out.println("Average is = " + (int) (Arrays.stream(arr).mapToInt(value -> value).sum() / Arrays.stream(arr).count()));

       
    }
}

public class Task3{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.analyzeNumbers(arr);
    }
}