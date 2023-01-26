package forループコード;

import java.util.Scanner;


public class STEP_4 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] c=new String[n];

        for(int i=0;i<n;i++){
            c[i]=sc.next();
        }

        int m=sc.nextInt();
        String[] s=new String[m];

        for(int i=0;i<m;i++){
            s[i]=sc.next();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(s[j].contains(c[i])){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}