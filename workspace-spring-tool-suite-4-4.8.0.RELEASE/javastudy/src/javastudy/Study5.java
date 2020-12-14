package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Study5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		  Random r = new Random();
		  System.out.print("数字当てクイズ！　0〜2のランダムな数字を入力してください");
		  int x = s.nextInt();
		  System.out.print(x);
		  int y = r.nextInt(3);
		  
		  if(x == y) 
			  System.out.print("正解！　答えは" + y + "です。");
		  
		  else
			  System.out.print("違います。答えは" + y + "でした。");
			  
		  
	}

}
