package javastudy;

public class Day2kadai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max =5;
		String box ="■";
		
//		for(int i = 1; i <= max; i++) {
//			for(int j = 0; j < max-i; j++) {
//				System.out.print("□");
//			}
//			for(int k = 0; k <=((i-1)*2); k++) {
//				System.out.print(box);
//			}
//			for(int j = 0; j < max-i; j++) {
//				System.out.print("□");
//			}
//			
//			System.out.print("\n");
//		}
		
		for(int i = 1; i <= max; i++) {
			for(int j = 0; j < max-i; j++) {
				System.out.print("□");
			}
			for(int k = 0; k <=((i-1)*2); k++) {
				System.out.print(box);
			}
			for(int j = 0; j < max-i; j++) {
				System.out.print("□");
			}
			
			System.out.print("\n");
		}
	}

}
