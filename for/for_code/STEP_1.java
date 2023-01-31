package for_code;

import java.util.Scanner;


public class STEP_1 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int count=sc.nextInt();
        int ans=0;
        for(int i=0;i<count;i++){
            int a=sc.nextInt();

            if(a%3==0){
                ans+=1;
            }
        }
        System.out.println(ans);
    }
}