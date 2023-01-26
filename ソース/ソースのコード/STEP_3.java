package ソースのコード;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class STEP_3{
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        String[]f=new String[n];

        for(int i=0;i<n;i++){
            String a=sc.next();
            String b=sc.next();

            if(a.length()==1){
                a="0"+a;
            }

            if(b.length()==1){
                b="0"+b;
            }

            f[i]=a+b;
        }

        Arrays.sort(f,Collections.reverseOrder());

        for(int i=0;i<n;i++){
            System.out.println(Integer.parseInt(f[i].substring(0,2))+" "+Integer.parseInt(f[i].substring(2,4)));
        }
    }

}