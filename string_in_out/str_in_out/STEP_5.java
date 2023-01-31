package str_in_out;

import java.util.Scanner;


public class STEP_5 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int count=sc.nextInt();
        String msg="paiza";

        for(int i=0;i<count-1;i++){
          msg +=" paiza";
        }

        System.out.println(msg);


    }
}