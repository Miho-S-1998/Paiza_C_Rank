package シュミレーションのソースコード;

import java.util.Scanner;


public class STEP_1 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=10000;

        while(true){
            if(n%13==0){
                break;
            }

            n +=1;
        }

        System.out.println(n);
    }
}