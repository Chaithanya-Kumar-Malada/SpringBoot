import java.util.*;

public class GettingUserData {
	int length;
	int width;
	
	static void Area(int length,int width) {
		
		int area = length*width;
		System.out.println("Area of Rentangle : "+ area);
	
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length & width values :");
		
		int length =sc.nextInt();
		int width = sc.nextInt();
		Area(length,width);
		
		   
		
		
		
		
	}
}
