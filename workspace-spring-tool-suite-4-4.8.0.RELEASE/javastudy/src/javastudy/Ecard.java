package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Ecard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int me ;
		int cp ;
		int capital = 0;
		
		Scanner s = new Scanner(System.in);
		Scanner t = new Scanner(System.in);
		Random r = new Random();
		//EMPEROR側
		String[]eSide = {"皇帝","市民","市民","市民","市民"};
		//SLAVE側
		String[]sSide = {"奴隷","市民","市民","市民","市民"};
		
		System.out.println("奴隷側か皇帝側かランダムで決めます,所持金を入力後”Enter”キーを押してください");
		
		//①軍資金を入力
		capital = t.nextInt();
		System.out.println("軍資金"+capital+"円");
		//②皇帝側か奴隷側かランダムで選択
		cp = r.nextInt(4);
		select(cp);
		
		System.out.println(sSide[cp]);
		select(cp); 
		
//		System.out.println(side+"からスタート");
//		judgment(eSide[me],sSide[cp]);
		
		
//		動作テスト======================
//		judgment("皇帝","奴隷");
//		lose(100,"皇帝側");
		
//		==============================
		
	}
	//＝＝＝＝＝＝＝メソッド＝＝＝＝＝＝
	//皇帝側、奴隷側を選択
	static void select(int cp) {
		switch (cp) {
		case 1:
		case 3:
			System.out.println("皇帝側");
			break;
		case 0:
		case 2:
			System.out.println("奴隷側");
			break;
		}
	}
	//勝利判定
	static void judgment (String me,String cp) {
		switch(me) {
		case "皇帝":
			if(cp.equals("奴隷")) 
				System.out.println("YOULOSE");
			else
				System.out.println("YOUWIN");
				break;
		case "奴隷":
			if(cp.equals("皇帝")) 
				System.out.println("YOUWIN");
			else
				System.out.println("YOULOSE");
			break;
		case "市民":
			if(cp.equals("奴隷")) 
				System.out.println("YOUWIN");
			else if(cp.equals("皇帝"))
				System.out.println("YOULOSE");
			else
				System.out.println("DRAW");
				break;
			}
		}
	//賞金計算(勝ちパターン)
	static int win(int pay, String me) {
		if(me.equals("奴隷側")) {
			System.out.println(me+"で勝利したので賞金10倍です");
			pay = pay*10;
			System.out.println(pay+"円獲得");
		}
		else {
			pay = pay*2;
			System.out.println(pay+"円獲得");
		}
		return pay;
	 }
	//賞金計算(負けパターン)
	static int lose(int pay, String me) {
		if(me.equals("皇帝側")) {
			System.out.println(me+"で敗北したので10倍支払い");
			pay = -(pay*10);
			System.out.println(pay+"円失う");
		}
		else {
			pay = -(pay*2);
			System.out.println(pay+"円失う");
		}
		return pay;
	}
}
	

