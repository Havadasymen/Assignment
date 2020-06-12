package Question4;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		Pen pen = new Pen();
		book.showPrice(100);
		pen.showPrice(100, 20);
	}

}

class Book {
	
	public void showPrice(int oldPrice) {
		System.out.println("Book Price=" + oldPrice);
	}
}

class Pen {
	public void showPrice(int oldPrice, int discount) {
		System.out.println("Pen Price=" + (oldPrice - discount));
	}
}

class Pencil {
	public int[] Paper;
	
	Pencil(){
		this.Paper = new int[] {300,400,500,600,700};
	}
}