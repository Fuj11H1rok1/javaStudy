package javastudy;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		============メイン============
		
//		tax(1000);
		sanjo(6);
	}

	 // メソッド 処理をひとまとめに
	 
//	消費税を計算するメソッド
	static void tax(int x) {
		x *= 1.1;
		System.out.println(x+"円");
	}
	
	
	// f 引数が複数あるパターン
	 static int add(int x, int y, String s) {
	  System.out.println(s+"を受け取りました。");
	  return x + y;
	 }

	 // e 戻り値もあって引数もある
	 static int sanjo(int x) {
	  System.out.println(x+"の3乗した値を返したよ");
	  return x * x * x;

	 }

	 // d 戻り値はなし。引数あり
	 static void hello(int x) {
	  for (int i = 0; i < x; i++) {
	   System.out.println("こんにちは！");
	  }
	 }

	 // c 戻り値はなし。引数あり
	 static void kon(String name) {

	  System.out.println(name + "さんこんにちは！");

	 }

	 // b戻り値はある。引数なし。呼び出されたら処理を実行して値を返す。
	 static int num() {

	  int result = 1;
	  for (int i = 1; i <= 8; i++) {
	   result *= 2;
	  }
	  
	  return result;

	 }

	 // a戻り値はなし。引数なし。呼び出されたら実行するだけ
	 static void hello() {
	  System.out.println("hello");
	  System.out.println("こんにちは");
	  System.out.println("おはよう");
	  System.out.println("こんばんは");
	 }
	 
	     // ひきすう
	 // メイン→メソッド 引数 0 or 複数個でもOK
	 // メソッド→メイン 戻り値 0 or 1個(型はなんでも)

	}
	       
	// static 戻り値の型　メソッド名（引数の型 変数名）｛
	//  実行したい処理
	//  return 戻したい値
	// ｝

