package pkg;

public class Engine {

	private String engineType;
	private int valves;
	private int strokeSize;
	private int bhp;
	
	public Engine(String engineType, int valves, int strokeSize, int bhp) {
		this.engineType = engineType;
		this.valves = valves;
		this.strokeSize = strokeSize;
		this.bhp = bhp;
	}
	
	public void startEngine() {
		System.out.println("Engine Started...");
	}
	
	public void haltEngine() {
		System.out.println("Engine Halted...");
	}
	
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public int getValves() {
		return valves;
	}
	public void setValves(int valves) {
		this.valves = valves;
	}
	public int getStrokeSize() {
		return strokeSize;
	}
	public void setStrokeSize(int strokeSize) {
		this.strokeSize = strokeSize;
	}
	public int getBhp() {
		return bhp;
	}
	public void setBhp(int bhp) {
		this.bhp = bhp;
	}
	
}

