package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Gacha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Scanner b = new Scanner(System.in);
		  Random g = new Random();
		  
		  int budghet = 0;
		  int gacha = 0;
		  int chara = 0;
		  int i = 0;
		  int rare = 0;
		  String[]names= {"⭐️5","⭐4","⭐️3","⭐️2","⭐️1"};
		  
		  System.out.println("ガチャ一回200円、予算を入力してみよう！");
		  System.out.println("最高レア度は⭐5キャラ(※かなり出にくいよ︎)");
		  
//		  budghet = b.nextInt();
//		  while(budghet >= 200)
//		  {
//			  budghet -= 200;
//			  gacha = g.nextInt(99);
//			  i++;
//			  if(gacha < 5)
//			  {chara = 0; rare ++;}
//			  else if(gacha < 20)
//				  chara = 1;
//			  else if(gacha < 40)
//				  chara = 2;
//			  else if(gacha < 65)
//				  chara = 3;
//			  else
//				  chara = 4;
//			  System.out.println(i+"回目"+names[chara]+"キャラ");
//		  }
//		  if(rare == 0)
//			  System.out.println("残念。⭐️5キャラを引けませんでした。");
//		  else
//		  System.out.println("⭐️5キャラを"+rare+"回引きました");
//		
		  int one = 0;
		  int two = 0;
		  int three = 0;
		  int four = 0;
		  int five = 0;
		 
		  
		  while(one < 1 || two < 1 || three < 1 || four < 1 || five < 1)
		  {
			  budghet += 200;
			  gacha = g.nextInt(99);
			  i++;
			  if(gacha < 5)
			  	{chara = 0; five++;}
			  else if(gacha >= 5 && gacha < 20)
			  	{chara = 1; four++;}
			  else if(gacha >= 20 && gacha < 40)
			  	{chara = 2; three++;}
			  else if(gacha >= 40 && gacha < 65)
			  	{chara = 3; two++;}
			  else
			  	{chara = 4; one++;}
			  System.out.println(i+"回目"+names[chara]+"キャラ");
		  }
			  System.out.println("全てのキャラが揃うのに、"+(budghet)+"円つかいました。");
		 
		
	}

}
