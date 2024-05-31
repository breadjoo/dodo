package May24.S0531;

import java.util.Scanner;

public class Main2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double [] score = new double [n];
        double maxScore = 0;
        for(int i=0;i<n;i++){
            score[i] = sc.nextDouble();
            if(score[i]>maxScore) {
                maxScore = score[i];
            }
        }
        double sum = 0;
        for(int i=0;i<n;i++) {
            sum += (score[i]/maxScore) * 100;
        }
        double avg = sum /n ;
        System.out.println(avg);

    }

}
