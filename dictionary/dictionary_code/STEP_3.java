package dictionary_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class STEP_3{
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,Integer>pa=new HashMap<>();
        for(int i=0;i<n;i++){
            String p=sc.next();

            pa.put(p,0);
        }

        int n2=sc.nextInt();
        for(int i=0;i<n2;i++){
            String p2=sc.next();
            int d=sc.nextInt();

            pa.put(p2,pa.get(p2)+d);
        }

        ArrayList<String>keylist=new ArrayList<>(pa.keySet());
        Collections.sort(keylist);
        for(String x:keylist){
            System.out.println(pa.get(x));
        }

    }
}