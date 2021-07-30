import java.util.Random;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

    int min = 1;
		int max = 4;

		Random random = new Random();
		int x1 = random.nextInt(max);
		Random Random = new Random();
		int y1 = random.nextInt(max);

        Random random2 = new Random();
		int x2 = random.nextInt(max);
		Random Random2 = new Random();
		int y2 = random.nextInt(max) ;

        Random random3 = new Random();
		int x3 = random.nextInt(max);
		Random Random3 = new Random();
		int y3 = random.nextInt(max) ;
      
    int turn=1;
      int shipA=3;
        int shipB=3;
        int shipC=3;
        int b=0;
     System.out.println("戦艦ゲーム");
     for(int a=1;a>0;a++){
       System.out.println("[ターン"+turn+"]");
       turn=turn+1;
     System.out.println("船１："+"生きてる");
     System.out.println("船２："+"生きてる");
     System.out.println("船３："+"生きてる");
     System.out.println("爆弾のｘ座標を入力してください（0～4）");
        Scanner scan2 = new Scanner(System.in);
        int num1 = scan2.nextInt();
        System.out.println("爆弾のｙ座標を入力してください（0～4）");
        Scanner scan1 = new Scanner(System.in);
        int num2 = scan1.nextInt();
        if(num1>=5 || num2>=5){
          System.out.println("打ちなおしてください");
          }else{
            a=a-a-1;
            b=b+1;
          }
          if(b>=1){
            a=1;
            b=b+1;       
            if(x1-num1==0 && y1-num2==0 && shipA>0){
              System.out.println("船１；爆弾が命中！しかし船は沈まない、船は移動する");
              shipA=shipA-1;
            }else if(x1-num1==1 && y1-num2==1 && shipA>0){
              System.out.println("船１；波高し！");
            }else{
              System.out.println("船１；ハズレ！");
            }
          }
          if(b>=1){
            a=1;
            b=b+1;       
            if(x2-num1==0 && y2-num2==0 && shipB>0){
              System.out.println("船２；爆弾が命中！しかし船は沈まない、船は移動する");
              shipB=shipB-1;
            }else if(x2-num2==1 && y2-num2==1 && shipB>0){
              System.out.println("船２；波高し！");
            }else{
              System.out.println("船２；ハズレ！");
            }
          }
          if(b>=1){
            a=1;
            b=b+1;       
            if(x3-num1==0 && y3-num2==0 && shipC>0){
              System.out.println("船３；爆弾が命中！しかし船は沈まない、船は移動する");
              shipC=shipC-1;
            }else if(x3-num1==1 && y3-num2==1 && shipC>0){
              System.out.println("船３；波高し！");
            }else{
              System.out.println("船３；ハズレ！");
            }
          }
          if(shipA==0 && shipB==0 && shipC==0){
            System.out.println("全艦撃沈！おめでとうございます");
            a=0;
          }

        }
      }
 }