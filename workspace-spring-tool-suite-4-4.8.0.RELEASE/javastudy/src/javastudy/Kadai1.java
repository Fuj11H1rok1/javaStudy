package javastudy;

public class Kadai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kokugo = 39;
		int math = 60;
		int total = kokugo + math;
		
		if(total >= 160 && kokugo >=40 && math >=40) {
			System.out.println("優良");
		}
		else if(total >= 140 && kokugo >=40 && math >=40) {
			System.out.println("良");
		}
		else if(total >= 100 && kokugo >=40 && math >=40) {
			System.out.println("可");
		}
		else {
			System.out.println("追試");
		}
		
	}

}
