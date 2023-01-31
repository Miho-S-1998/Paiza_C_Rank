package source_code;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class STEP_FINAL {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] g=new String[n];

        for(int i=0;i<n;i++){
            String g_1=sc.next();
            String s_1=sc.next();

            if(g_1.length()==1){
                g_1="0"+g_1;
            }

            if(s_1.length()==1){
                s_1="0"+s_1;
            }

            g[i]=s_1+g_1;
        }

        Arrays.sort(g,Collections.reverseOrder());

        for(int i=0;i<n;i++){
            System.out.println(Integer.parseInt(g[i].substring(2,4))+" "+Integer.parseInt(g[i].substring(0,2)));
        }
    }
}