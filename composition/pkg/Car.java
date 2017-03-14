package pkg;

public class Car extends Vehicle {
	
	private String model;
	private Engine engine;
	
	public Car(String color, int seatingCap, Engine engine, String model) {
		super(color, seatingCap);
		this.engine = engine;
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void startTheCar() {
		System.out.println(model + " " + getColor() + " " + getSeatingCap() + " " + engine.getEngineType());
		engine.startEngine();
	}
	
	public void turnOffTheCar() {
		System.out.println(model + " " + engine.getEngineType());
		engine.haltEngine();
	}

}

