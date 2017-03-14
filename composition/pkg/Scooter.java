package pkg;

public class Scooter extends Vehicle {
	
	private Engine engine;
	private String model;

	public Scooter(String color, int seatingCap, Engine engine, String model) {
		super(color, seatingCap);
		this.engine = engine;
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void startTheScooter() {
		System.out.println(model + " " + getColor() + " " + getSeatingCap() + " " + engine.getEngineType());
		engine.startEngine();
	}
	
	public void turnOffTheScooter() {
		System.out.println(model + " " + engine.getEngineType());
		engine.haltEngine();
	}
	
}

