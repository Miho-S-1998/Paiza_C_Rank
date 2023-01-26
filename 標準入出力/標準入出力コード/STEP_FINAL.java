package 標準入出力コード;

import java.util.Scanner;


public class STEP_FINAL {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();

       for(int i=0;i<n;i++){
           String s=sc.next();
           int a=sc.nextInt()+1;

           System.out.println(s+" "+a);
       }
    }
}