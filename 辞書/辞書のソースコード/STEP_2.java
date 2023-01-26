package 辞書のソースコード;

import java.util.HashMap;
import java.util.Scanner;


public class STEP_2 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,Integer> pa=new HashMap<>();

        for(int i=0;i<n;i++){
            String p=sc.next();

            pa.put(p , 0);
        }

        int sn=sc.nextInt();

        for(int i=0;i<sn;i++){
            String p1=sc.next();
            int d=sc.nextInt();

            pa.put(p1,pa.get(p1)+d);
        }

        System.out.println(pa.get(sc.next()));
    }
}