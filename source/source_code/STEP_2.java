package source_code;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class STEP_2{
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] a=new Integer[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        Arrays.sort(a,Collections.reverseOrder());

        for(int i=0;i<n;i++){
             System.out.println(a[i]);
        }


    }
}