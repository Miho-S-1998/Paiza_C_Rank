package simulation_code;

import java.util.Scanner;


public class STEP_2 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        int p=1;
        int k=1;
        int t=0;

        while(true){

            t+=1;

            k +=p*a;

            if(k>n){
                break;
            }

            p +=k%b;

        }

        System.out.println(t);
    }
}