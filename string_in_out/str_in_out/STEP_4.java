package str_in_out;

import java.util.Scanner;


public class STEP_4{
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int ans=0;

        for(int i=0;i<number;i++){
            int a=sc.nextInt();

            if(ans<a){
                ans=a;
            }
        }
        System.out.println(ans);
    }
}