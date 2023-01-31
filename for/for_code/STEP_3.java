package for_code;

import java.util.Scanner;


public class STEP_3 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
          int k=sc.nextInt();
          for(int i=0;i<n;i++){
              if(a[i]==k){
                  System.out.println(i+1);
                  break;
              }


          }

    }
}