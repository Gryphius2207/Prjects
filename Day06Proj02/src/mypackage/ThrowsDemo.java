package mypackage;

public class ThrowsDemo {
	
	void Division1() throws ArithmeticException {
		int a = 45,b = 0, rs;
		rs = a/b;
		System.out.println("\n\tThe Result is: "+rs);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsDemo T = new ThrowsDemo();
		try {
			T.Division1();
		}catch (ArithmeticException e) {
			System.out.println("\n\tError: "+e.getMessage());
		}
		System.out.println("\n\tEnd of Program");
	}

}
