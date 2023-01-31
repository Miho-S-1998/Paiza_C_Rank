package dictionary_code;

import java.util.HashMap;
import java.util.Scanner;


public class STEP_1 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,Integer> pa=new HashMap<>();

        for(int i=0;i<n;i++){
            String pn =sc.next();
            int f=sc.nextInt();

            pa.put(pn,f);
        }

        System.out.println(pa.get(sc.next()));

    }
}