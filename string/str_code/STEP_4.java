package str_code;

import java.util.Scanner;


public class STEP_4 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        if(n.length()==1){
            System.out.println("00"+n);
        }else if(n.length()==2){
            System.out.println("0"+n);
        }else{
            System.out.println(n);
        }

    }
}
