package for_code;

import java.util.Scanner;


public class STEP_2 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        boolean flag=false;

        for(int i=0;i<n;i++){
            int a=sc.nextInt();

            if(a==7){
              flag=true;
            }
        }

        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}