package Question3;

public class X {
	public int xVal = 0;
	
	public int add(int num) {
		return xVal + num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new X();
		Y y = new Y();
		System.out.println("X=" + x.xVal);
		System.out.println("Y=" + y.yVal);
		System.out.println("X+Y=" + x.add(y.yVal));
	}
}

class Y {
	public int yVal = 1;
}
