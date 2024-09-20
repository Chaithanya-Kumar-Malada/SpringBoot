public class First{

	int x =10;
	float y = 20.87654567f;
	String name = "SURYA";
	
	
	
//static int myone(int x,int y) {
//	return x+y;	
//}
//static int mysec(int x, int y) {
//	return x+y;
//}


	static int Mymethod(int x, int y) {
		return x+y;
	}


  public static void main(String[] args) {
	
// System.out.println(myone(5,4));
// System.out.println(myone(5,5));
//	
	int one = Mymethod(5,5);
	int sec = Mymethod(5,10);
	System.out.println("Addition of numbers 5 & 5 -"+" " + one);
	System.out.println("Addition of numbers 5 & 10 -"+ " "+ sec);
	
	First obj = new First();
	System.out.println(obj.name);
	System.out.println(obj.x);
	System.out.println(obj.y);
	
	
}
}