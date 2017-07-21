package Day2_VariableArithmatic;

public class Car {
	
	int maxSpeed = 100;
	int minSpeed = 0;
	
	double weight = 4079;
	boolean isTheCarOn = false;
	char condition = 'A';
	
	String nameOfCar = "Lucy";
	double maxFuel = 16;
	double currentFuel = 8;
	double mpg = 26.4;
	
	int numberOfpeopleInCar = 1;
	

	public Car(int customMaxSpeed, double customWeight, boolean CustomIsTheCarOn){
		
		maxSpeed = customMaxSpeed;
		weight = customWeight;
		isTheCarOn = CustomIsTheCarOn;
		
	}
	
	public void printVariables(){
		System.out.println("The MaxSpeed is "+ maxSpeed);
		System.out.println("The Min Speed is "+ minSpeed);
		System.out.println("The Weight is "+ weight);
		System.out.println("Is the car on? "+ isTheCarOn);
		System.out.println("Condition of the car "+ condition);
		System.out.println("Name of the car "+ nameOfCar);
	}
	
	public void upgradeMinSpeed(){
		maxSpeed = maxSpeed +1;
	}
	
	public static void main(String[] args) {
		
		Car customCar = new Car(150, 3422.33, true);
		customCar.printVariables();
	}

}
