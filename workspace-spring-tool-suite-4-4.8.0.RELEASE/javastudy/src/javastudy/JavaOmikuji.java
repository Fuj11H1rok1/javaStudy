package javastudy;

import java.util.Random;

public class JavaOmikuji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("おみくじを引きます。");
//		課題1ー1＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
//		Random r = new Random();
//		int x = r.nextInt(4);
//		String[]names = {"大吉","中吉","小吉","吉","凶"};
//		System.out.print(names[x]);
//		＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
		
//		課題1ー2＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
//		int i = 0;
//		while(i<100)
//		{
//	
//			Random r = new Random();
//			int x = r.nextInt(4);
//			String[]names = {"大吉","中吉","小吉","吉","凶"};
//			System.out.println(names[x]);	
//			i++;
//			if(x==0) {
//				break;
//			}	
//		}
//		＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝	
//		課題1ー3(吉ver)＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
		int i = 0;
		int x = 1;
		Random r = new Random();
		String[]names = {"大吉","中吉","小吉","吉","凶"};
		while(x!=0)
		{
			x = r.nextInt(4);
			System.out.println(names[x]);	
			i++;
		}
		System.out.println("大吉が出るまでに"+i+"回ひきました。");
//		＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
		
		
		
	
		
		
	}

}
