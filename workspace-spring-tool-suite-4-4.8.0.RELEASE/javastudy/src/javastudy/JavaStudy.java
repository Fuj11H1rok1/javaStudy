package javastudy;

public class JavaStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double bmi;
		double weight =45;
		double height =1.75;
		
		bmi = weight / (height*height);
		
		System.out.println(bmi);
		
		if(bmi>25) {
			System.out.println("肥満");
		}else if(bmi>=18.5 && bmi<=25) {
			System.out.println("標準");
		}else if(bmi<18.5) {
			System.out.println("低体重");
		}
		if(bmi>25) {
			System.out.println("肥満");
		}else if(bmi>=18.5) {
			System.out.println("標準");
		}else{
			System.out.println("低体重");
		}
		
	}

}
