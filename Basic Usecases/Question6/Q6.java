package Question6;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FAN fan = new FAN();
		AC ac = new AC();
		fan.setPerHourCost(1);
		ac.setPerHourCost(2);
		int time = 10;
		fan.runFor(time);
		ac.runFor(time);
	}

}

class FAN {
	int perHourCost = 0;
	
	public void runFor(int hour) {
		System.out.println(hour * perHourCost);
	}
	
	public void setPerHourCost(int c) {
		this.perHourCost = c;
	}
}

class AC {
	int perHourCost = 0;
	
	public void runFor(int hour) {
		System.out.println(hour * perHourCost);
	}
	
	public void setPerHourCost(int c) {
		this.perHourCost = c;
	}
}
