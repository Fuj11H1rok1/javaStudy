package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Syukudai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner s = new Scanner(System.in);
//		  Random r = new Random();
		  
//		  int y = r.nextInt(3);
		Scanner s = new Scanner(System.in);
		  int total = 0;
		  for(int i=1;i<=5;i++)
		  {
			   
			  total += s.nextInt();
			  
		  }
		  System.out.print(total);
	}

}
