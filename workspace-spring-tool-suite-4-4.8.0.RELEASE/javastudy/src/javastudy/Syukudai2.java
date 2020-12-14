package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Syukudai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		  Random r = new Random();	
		 
		  System.out.println("1~10の2つの乱数の合計値が11以上か未満かを予測してみましょう！");
		  System.out.println("Highの場合は1を入力、Lowの場合は2を入力。");
		  
		  int total = 0;
		  for(int i=1;i<=2;i++)
		  {
			  int y = r.nextInt(10+1);
			  total += y;
		  }
		  if(total >= 11)
		  {
			  if(s.nextInt()==1)
				  System.out.print("当たりです！答えは"+total+"でした。");
			  else
				  System.out.print("外れです！答えは"+total+"でした。");
		  }
			  
		  else if(total < 11)
		  {
			  if(s.nextInt()==2)
				  System.out.print("当たりです！答えは"+total+"でした。");
			  else
				  System.out.print("外れです！答えは"+total+"でした。");
			 
		  }
		
	}

}
