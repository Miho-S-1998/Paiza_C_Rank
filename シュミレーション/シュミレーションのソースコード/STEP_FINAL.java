package シュミレーションのソースコード;

import java.util.Scanner;

public class STEP_FINAL {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int Ph=sc.nextInt();
        int[] paiza={0,1,1};
        int[] monster={0,1,1};
        int d=2;
        int t=2;

        while(d<Ph){
            paiza[0]=paiza[1];
            monster[0]=monster[1];
            paiza[1]=paiza[2];
            monster[1]=monster[2];

            paiza[2]=monster[1]+monster[0];
            monster[2]=paiza[1]*2+paiza[0];

            d+=monster[2];
            t+=1;
        }

        System.out.println(t);
    }
}