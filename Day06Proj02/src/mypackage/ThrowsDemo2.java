package mypackage;

//import java.util.Scanner;
import java.io.*;
class Sample{
	private String name;
	void accept () throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		name = reader.readLine();
		//name = sc.next();
		
	}
	void display() {
		System.out.println("\n Name: "+name);
	}
}
public class ThrowsDemo2 {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		s.accept();
		s.display();

	}

}
