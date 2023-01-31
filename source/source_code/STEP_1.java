package source_code;

import java.util.Arrays;
import java.util.Scanner;


public class STEP_1 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        Arrays.sort(a);

        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}