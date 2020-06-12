package Question5;

public class Bottle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Water w = new Water();
		w.taste();
		w.cap(100, 200, 300);
		w.taste();
	}

}

class Water {
	public int small = 1;
	public int medium = 2;
	public int big = 3;
	
	public void cap(int small, int medium, int big) {
		this.small = small;
		this.medium = medium;
		this.big = big;
	}
	
	public void taste() {
		System.out.println(small);
		System.out.println(medium);
		System.out.println(big);
	}
}
