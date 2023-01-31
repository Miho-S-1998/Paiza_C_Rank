package str_in_out;

import java.util.Scanner;


public class STEP_3 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            if(b<a){
             b=a;
            }
            System.out.println(b);
        }
    }
}