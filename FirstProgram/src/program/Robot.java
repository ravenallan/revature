package program;

public class Robot {
	
	// instance var
	private int maxSpeed;
	
	// constructor example
	public Robot() {
		this.maxSpeed = 1;
	}
	
	public Robot(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	// setter method
	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed >= 0)
			this.maxSpeed = maxSpeed;
		else
			this.maxSpeed = 0;
	}
	
	public void travel() {
		System.out.println("The robot moves a distance of " + maxSpeed + " units.");
	}
}
