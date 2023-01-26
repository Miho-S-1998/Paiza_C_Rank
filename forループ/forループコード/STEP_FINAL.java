package forループコード;

import java.util.Scanner;


public class STEP_FINAL {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();

        for(int i=0;i<n;i++){

            int[]a=new int [m];

            for(int j=0;j<m;j++){
                a[j]=sc.nextInt();
            }

            int ans=0;

            for(int j=0;j<m;j++){
                if(a[j]==k){
                    ans+=1;
                }
            }

            System.out.println(ans);

        }
    }
}
