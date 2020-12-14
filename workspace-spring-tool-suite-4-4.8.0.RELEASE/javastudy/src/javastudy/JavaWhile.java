package javastudy;

public class JavaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i=0;
//		
//		while(i<100)
//		{
//			System.out.println(i+"回目の繰り返しです。");
//			i++;
//		}
		
		String[]names = 
			{"青木","井上","太田","中村","佐藤"};
		for(int i =0; i< names.length;i++)
		{
			System.out.println(names[i]+"くん");
		}
		
	}

}
