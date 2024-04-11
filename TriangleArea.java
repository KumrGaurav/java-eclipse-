import java.util.Scanner;
public class TriangleArea {

	public static void main(String[] args) {
		int base,height;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Base of triangle:->");
		base = sc.nextInt();
		System.out.println("Please enter the height of trisngle:->");
		height = sc.nextInt();	
		double area =(1/2.0)*base*height;
		System.out.println("Area of triangle :-> "+area);
	}

}
