package May24.S0531.S0531;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> result = new HashSet<>();

        int[] arr = new int[10];
        for(int i=0;i<10;i++){
           arr[i] = sc.nextInt();
          int result2 = arr[i]%42;
          result.add(result2);
        }
        System.out.println(result.size());

    }
}
