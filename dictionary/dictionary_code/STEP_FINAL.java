package dictionary_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class STEP_FINAL{
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();

        HashMap<Integer,Integer>ab=new HashMap<>();
        HashMap<Integer,Integer>bc=new HashMap<>();

        for(int i=0;i<p;i++){
            int j=sc.nextInt();
            int k=sc.nextInt();

            ab.put(j,k);
        }

        for(int i=0;i<q;i++){
            int k=sc.nextInt();
            int l=sc.nextInt();

            bc.put(k,l);
        }

        ArrayList<Integer>keylist=new ArrayList<>(ab.keySet());
        Collections.sort(keylist);

        for(Integer x:keylist){
            System.out.println(x+" "+bc.get(ab.get(x)));
        }


    }
}