package 文字列コード;

import java.util.Scanner;


public class STEP_FINAL {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int count=sc.nextInt();
        for(int i=0;i<count;i++){
            String start=sc.next();
            int h=sc.nextInt();
            int m=sc.nextInt();

         int StartH=Integer.parseInt(start.substring(0,2));
         int StartM=Integer.parseInt(start.substring(3,5));

         int ah=StartH+h;
         int am=StartM+m;

         if(am>=60){
            ah+=1;
            am-=60;
         }

         if(ah>=24){
            ah-=24;
         }

         String endAh=Integer.toString(ah);
         String endAm=Integer.toString(am);

         if(endAh.length()==1){
             endAh="0"+endAh;
         }

         if(endAm.length()==1){
             endAm="0"+endAm;
         }

         System.out.println(endAh+":"+endAm);

        }
    }
}