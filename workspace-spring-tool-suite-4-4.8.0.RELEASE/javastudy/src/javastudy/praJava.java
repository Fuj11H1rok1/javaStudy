package javastudy;

import java.util.ArrayList;
import java.util.Random;

public class praJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[]name={"ありがとう"};
//		
//		String s = "ありがとう";
//		
//		if(name[0].equals(s)) {
//			System.out.println("同じ");
//		}
//		else
//			System.out.println("不一致");
	
		String [] hand = {"グー","チョキ","パー"};
//		int gcp = hand.length -1;
//		System.out.println(gcp);
		Random r = new Random();
//		int cp = r.nextInt(3);
		int cp = 0;
		String cphand = hand[cp];
//		String cplist ;
//		System.out.println(cphand);
	ArrayList<String> cphandList = new ArrayList<String>();
//	 
//	System.out.println("CPの持ち札");
//		cphandList.add("グー");
//		cphandList.add("グー");
//		cphandList.add("グー");
		cphandList.add("グー");
		cphandList.add("チョキ");
		cphandList.add("チョキ");
		cphandList.add("チョキ");
		cphandList.add("チョキ");
		cphandList.add("パー");
		cphandList.add("パー");
		cphandList.add("パー");
		cphandList.add("パー");
		
		
		 String[] searchTargets = {cphand};
		 
		 for (String s : searchTargets) {
		      if (cphandList.contains(s)) {
		        System.out.println("リストは以下の要素を含みます: " + s);
		      } else {
		        System.out.println("リストは以下の要素を含みません: " + s);
		      }
		    }
		
//		cphandList.get();
//		System.out.println();
//		for(int j = 0 ; j <= cphandList.size() ; j++) {
//			cplist = cphandList.get(j);
//			if(handComp(cphand,cplist)) {
//				System.out.println(handComp(cphand,cplist));	
//				cphandList.remove(cphandList.indexOf(cphand));
//				break;
//			}
//			else {
//				cp = r.nextInt(3);
//				continue;
//			}
//		}
//		System.out.println("一致しました");
//			
		
		
		
//		boolean b = true;
//		boolean b = false;
//		System.out.println("1 == 1 " + (1 == 1));
//		System.out.println("1 == 2 " + (1 == 2));
		
//		int a = 0;
//		int b = 1;
//		if(a == b) {
//		  System.out.println("trueの場合に実行");
//		}
//		else {
//		  System.out.println("falseの場合に実行");
//		}
//		int i = 0;
//		while(i < 10) {
//		  System.out.print(i + " ");
//		  i += 1;
//		}
		
	}
	//ここからメソッド
	//文字列をハッシュコードの変換する
	static boolean handComp(String hand,String list) {
		int hashHand = hand.hashCode();
		int hashList = list.hashCode();
		if(hashHand == hashList)
			return true;
		else
			return false;
		
	}

}
