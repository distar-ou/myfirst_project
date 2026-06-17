package string;

public class demo6 {
     public static void main(String [] args){
         String talk="ÍæµÄÕæºÃ£¬CNM,SB";
         String []arr={"CNM","SB","TMD","MLGB"};
         for(int i=0;i<arr.length;i++){
             talk=talk.replace(arr[i],"***");
         }
         System.out.println(talk);
     }
}
