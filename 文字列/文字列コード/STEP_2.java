package 文字列コード;

import java.util.Scanner;


public class STEP_2 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String s=sc.next();

        if(s.contains(a)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
