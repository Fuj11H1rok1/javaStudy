package javastudy;

import java.util.Scanner;

public class methodPra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ここからメイン
		
		System.out.println("①ログインIDを入力");
		int id =0;
		Scanner i = new Scanner(System.in);
		id = i.nextInt();
//		＝＝＝＝＝＝スキャナーで値を入力。メソッドのnameリストから抽出＝＝＝＝＝＝＝
		id(id);
		
//		＝＝在庫数＝＝
		int total = 100;
		
		System.out.println("②単位を入力");
		Scanner u = new Scanner(System.in);
		String unit = u.nextLine();
		
		while(total > 0) {
			
			System.out.println("②出庫数を入力");
			Scanner o = new Scanner(System.in);
			int out = o.nextInt();
			
			if(total<out) {
				System.out.println("正しく入力してください");
				continue;
			}
			total = zaiko(total,out,unit);
			System.out.println("③在庫数"+total+unit);
			
			if(total<=10) 
				System.out.println("補充してください。");
			
		}
		if(total == 0)
			System.out.println("在庫がなくなりました");
	}
			
	
//	ここからメソッド
	
//	====職員リスト====
	static void id(int i) {
		String [] name = {"岩鬼","殿馬","里中","山田","微笑","上下","蛸田","高代","香車"};
//		=== int max はnameの要素数 ===
		int max = name.length -1;
		System.out.println("①社員名『"+name[i]+"』");
	}
	
//	====在庫管理====
	static int zaiko(int total,int out,String unit) {
			
			System.out.println("②出庫数"+out+unit);
			return total - out;
		}
	}
	


