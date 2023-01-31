package str_code;

import java.util.Scanner;


public class STEP_1 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
          String a=sc.next();
          System.out.println(a.length());
        }

    }
}