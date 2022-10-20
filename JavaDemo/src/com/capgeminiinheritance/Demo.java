package com.capgeminiinheritance;

public class Demo {
		private String doors;
		private int speed;
		
		public String getDoors() {
			return doors;
		}
		public void setDoors(String doors) {
			this.doors = doors;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public String run(){
			if(doors.equals("closed") && speed >0)
			{
				return "running";
			}
			else
				return "not running";
		}

}
