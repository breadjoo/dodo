package May24.S0531;

import java.util.Scanner;

public class Main3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] basket = new int[n];
        for(int i=0;i<n;i++){
            basket[i] = i+1;
        }
        for(int a=0;a<m;a++){
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            reverse(basket,i,j);
        }
        for(int i=0;i<n;i++){
            System.out.println(basket[i]+"");
        }
    }

    private static void reverse (int[] arr,int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

