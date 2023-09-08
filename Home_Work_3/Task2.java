package Home_Work_3;

import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
      ArrayList<Integer> a = new ArrayList<>(Arrays.asList(arr));
      a.removeIf(n -> (n % 2 == 0));
      System.out.println(a);

       
    }
}

public class Task2{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.removeEvenNumbers(arr);
    }
}