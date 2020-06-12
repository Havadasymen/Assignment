package Question1;

public class ABC {

	int instanceVariable = 1;

	public void add(int a){
		int localVariable = 200;
		instanceVariable = localVariable + a;
		System.out.println(instanceVariable);
	}
	
	public static void main(String[] args) {
		ABC abc = new ABC();
		System.out.println(abc.instanceVariable);
		abc.add(1);
		abc.add(2);
		abc.add(3);
		abc.add(4);
	}

}
