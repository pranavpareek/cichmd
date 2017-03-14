package pkg;

public class Main {

	public static void main(String[] args) {
		
		Engine car1_engine = new Engine("V8", 16, 200, 5000);
		Engine car2_engine = new Engine("V12", 32, 200, 5000);
		Engine scooter_engine = new Engine("IC", 1, 150, 160);
		
		Car ferrari = new Car("Red", 2, car1_engine, "2005");
		Car porsche = new Car("Black", 2, car2_engine, "2010");
		Scooter vespa = new Scooter("Yellow", 2, scooter_engine, "2015");
		
		ferrari.startTheCar();
		System.out.println();
		porsche.startTheCar();
		System.out.println();
		vespa.startTheScooter();
		
		System.out.println();
		ferrari.turnOffTheCar();
		vespa.turnOffTheScooter();
		porsche.turnOffTheCar();
		
	}
	
}

