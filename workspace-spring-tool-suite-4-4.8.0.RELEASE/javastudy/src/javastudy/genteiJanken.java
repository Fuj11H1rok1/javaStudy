package javastudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class genteiJanken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]janken= {"グー","チョキ","パー"};
		int gcp = janken.length -1 ;
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int me ;
		int cp ;
		String myhand ;
		String cphand ;
		 
//		プレイヤーの星
		int mystar = 3;
//		CPの星
		int cpstar = 3;
		
//		自分の持ち札『グー(g)チョキ(c)パー(p)』各4枚
		ArrayList<String> myhandList = new ArrayList<String>();
		
		System.out.println("自分の持ち札");
 		myhandList.add("グー");
 		myhandList.add("グー");
 		myhandList.add("グー");
 		myhandList.add("グー");
 		myhandList.add("チョキ");
 		myhandList.add("チョキ");
 		myhandList.add("チョキ");
 		myhandList.add("チョキ");
 		myhandList.add("パー");
 		myhandList.add("パー");
 		myhandList.add("パー");
 		myhandList.add("パー");
 		
 		System.out.println(myhandList);
		int myhandStock = myhandList.size();
		
//		CPの持ち札『グー(g)チョキ(c)パー(p)』各4枚
		ArrayList<String> cphandList = new ArrayList<String>();
		 
		System.out.println("CPの持ち札");
 		cphandList.add("グー");
 		cphandList.add("グー");
 		cphandList.add("グー");
 		cphandList.add("グー");
 		cphandList.add("チョキ");
 		cphandList.add("チョキ");
 		cphandList.add("チョキ");
 		cphandList.add("チョキ");
 		cphandList.add("パー");
 		cphandList.add("パー");
 		cphandList.add("パー");
 		cphandList.add("パー");
		
 		System.out.println("残り"+cphandList.size()+"枚");
		int cphandStock = cphandList.size();
		
		while((myhandStock > 0) && (cphandStock > 0))
			{	
			//持ち札の枚数を確認して、持ち札が0になったらループからbreak;
				if(myhandList.size() == 0) {
					break;
				}
			
				System.out.println("チェック（持ち札を選択）");
//					出したい手札がまだリストに残っているか確認（真偽）
				me = s.nextInt();
				boolean confi = false;
				for (String m : myhandList) {
					//グー、チョキ、パー以外は選択させない
					if(!(gcp >= me)) {
						System.out.println("0~2から選択してください");
						me = s.nextInt();
						continue;
					}
					myhand = janken[me];
					if (myhand.contains(m)) {
//						System.out.println("リストは以下の要素を含みます: " + m);
						System.out.println("([自分]"+m+"を選択中)");
						myhandList.remove(myhandList.indexOf(m));
						confi = true;
						break;
					} else {
//						System.out.println("リストは以下の要素を含みません: " + m);
						continue;
					}
				}
				if(!(confi)) {
					System.out.println("手札に残っていません選び直してください");
					continue;
				}

				//CP========
				
				cp = r.nextInt(3);
//				cp = s.nextInt();
				cphand = janken[cp];
				System.out.println("セット");
				System.out.print("（CPの選択）");
				//出したい手札がまだリストに残っているか確認（真偽）cp側
				
				
				while(true) {
					boolean con = false;
					for (String c : cphandList) {
						
						cphand = janken[cp];
						if (cphand.contains(c)) {
	//						System.out.println("リストは以下の要素を含みます: " + m);
							System.out.println("("+c+")");
							cphandList.remove(cphandList.indexOf(c));
							con = true;
							break;
						} else {
	//						System.out.println("リストは以下の要素を含みません: " + m);
							continue;
						}
					}
					if(!(con)) {
						System.out.println("CP選択中");
//						cp = s.nextInt();
						cp = r.nextInt(3);
						continue;
					}else break;
				}
				
				System.out.println("[CP]残り手札"+cphandList.size()+"枚");
//				System.out.println(cphandList+"cp");
				
				
				System.out.println("オープン！");
				System.out.println("（自分）"+janken[me]+"！！"+"　VS "+"（相手）"+janken[cp]+"！！");
				
				if( me==cp )
				{
					System.out.println("[あいこ]星の移動はありません");
					System.out.println("▽自分の持ち札＆星の所持数"+mystar+"個");
					System.out.println(myhandList);
					System.out.println("[CP持ち札]残り"+cphandList.size()+"枚[CP星の所持数]"+cpstar+"個");
					//持ち札の枚数を確認して、持ち札が0になったらループからbreak;
				}
				else if((me == 0 && cp == 1)||(me == 1 && cp == 2)||(me == 2 && cp == 0))
				{
					if(cpstar > 0) {
						cpstar --;
						mystar ++;
						System.out.println("あなたの勝ちです！敗者から星を一つ奪えます");
					}
					else {
						System.out.println("あなたの勝ちです！");
						System.out.println("相手が星を持っていない為、星の移動はありません。");
					}
					System.out.println("▽自分の持ち札＆星の所持数"+mystar+"個");
					System.out.println(myhandList);
					System.out.println("[CP持ち札]残り"+cphandList.size()+"枚[CP星の所持数]"+cpstar+"個");
					//持ち札の枚数を確認して、持ち札が0になったらループからbreak;
					
				}
				else 
				{
					if(mystar > 0) {
						mystar --;
						cpstar ++;
						System.out.println("CPの勝ちです！星が一つ奪われました");
					}
					else {
						System.out.println("CPの勝ちです！");
						System.out.println("星を持っていない為、星の移動はありません。");
					}
					System.out.println("▽自分の持ち札＆星の所持数"+mystar+"個");
					System.out.println(myhandList);
					System.out.println("[CP持ち札]残り"+cphandList.size()+"枚[CP星の所持数]"+cpstar+"個");
					//持ち札の枚数を確認して、持ち札が0になったらループからbreak;
					
				}
				
			}
		if(mystar < 3){
			System.out.println("敗北。星は全て没収。");
			System.out.println("地下労働行き");
		}
		else {
			System.out.println("生き残り達成");
			System.out.println(mystar+"00万円獲得");
		}
		
		}
	
	//nameフィールド(手札とリスト)のみを比較、比較結果を戻り値でtrue,falseで返す
	static boolean handComp(String hand,String list) {
		int hashHand = hand.hashCode();
		int hashList = list.hashCode();
		if(hashHand == hashList)
			return true;
		else
			return false;
	}

}
