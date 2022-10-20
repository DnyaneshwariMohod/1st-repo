package com.capgeminiinheritance;
class Car 
{
//variable for car
		private String Doors;
		private String Engine;
		private String Driver;
		private int speed;
		public void setSpeed(int speed)
		{
			this.speed=speed;
		}
		public int getSpeed()
		{
			return speed;
		}

}
//
public class GetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car ();
		car.setSpeed(15);
		System.out.println(car.getSpeed());
		
	}
}


