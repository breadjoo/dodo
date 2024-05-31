package May24.S0531;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] basket = new int[n+1];

        for (int i=1;i<=n;i++){
            basket[i] = i;
        }

        for (int a=0;a<m;a++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            int basketI = basket[i];
            basket[i] = basket[j];
            basket[j] = basketI;
        }

        for(int i=1; i<=n; i++){
            System.out.println(basket[i] + "");
        }


    }
}
