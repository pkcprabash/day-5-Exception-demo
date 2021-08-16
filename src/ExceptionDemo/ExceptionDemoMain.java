package ExceptionDemo;

public class ExceptionDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4};
		int num;
		
		
		try {
			num = a[5];
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		
		Integer num2= null;
		try {
			num2 = num2+1;
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

		
		
		try {
			num = 5/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage()+" is not possible.");
		}
		
		
		
		try {
			String s = null;
			char ch = s.charAt(1);
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			int num3 = 3;
			if(num3==3) {
				throw new NumberException("Cannot be number 3!");
			}
		}
		catch(NumberException e) {
			System.out.println(e.getMessage());
		}
	}

}
