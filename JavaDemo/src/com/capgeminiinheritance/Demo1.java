package com.capgeminiinheritance;

public class Demo1 {
	public class Car
	{
		private String doors;
		private int speed;
		
		public Car()
		{
			doors = "opened";
			speed = 0;
		}
		public Car(String doors, int speed)
		{
			this.doors = doors;
			this.speed = speed;
		}
		
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public int getSpeed() {
			return speed;
		}
		public String getDoors() {
			return doors;
		}
		public void setDoors(String doors) {
			this.doors = doors;
		}
		public String run() {
			if(doors.equals("closed") && speed >0    ) {
				return "running";
				}else
					return"not running";
	    }}

}
