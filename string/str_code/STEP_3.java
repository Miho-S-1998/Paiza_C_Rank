package str_code;

import java.util.Scanner;


public class STEP_3 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);

        String s=sc.next();
        String[] n=s.split("");

        String a=Integer.toString(Integer.parseInt(n[0])+Integer.parseInt(n[3]));
        String b=Integer.toString(Integer.parseInt(n[1])+Integer.parseInt(n[2]));

        System.out.println(a+b);
    }
}