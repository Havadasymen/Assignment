package Question2;

public class Tesla extends Car{

	public Tesla(String c, String b) {
		
	}

	public static void main(String[] args) {
		Car myCar = new Car("Honda", 20000, 5000);
		myCar.showInfo();
	}

}

class Car {
	private String name;
	private int price;
	
	Car(){
		
	}
	
	Car(String s, int oldPrice, int discount){
		this.name = s;
		this.price = oldPrice - discount;
	}
	
	public void showInfo() {
		System.out.println("Car Name = " + this.name);
		System.out.println("Price = " + this.price);
	}
}
