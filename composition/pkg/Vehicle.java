package pkg;

public class Vehicle {
	
	private String color;
	private int seatingCap;

	public Vehicle(String color, int seatingCap) {
		this.color = color;
		this.seatingCap = seatingCap;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSeatingCap(int seatingCap) {
		this.seatingCap = seatingCap;
	}

	public String getColor() {
		return color;
	}

	public int getSeatingCap() {
		return seatingCap;
	}

}

