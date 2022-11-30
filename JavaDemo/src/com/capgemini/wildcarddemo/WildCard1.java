package com.capgemini.wildcarddemo;


import java.util.ArrayList;
import java.util.List;

class WildCard{
	private int vehicle;
	
	public WildCard(int vehicle) {
		this.vehicle = vehicle;
	}
	
	public int getVehicle() {
		return vehicle;
	}
	
	@Override
	public String toString() {
		return "WildCard1 [vehicles=" + vehicle + "]";
	}
}

class Dezire extends WildCard{
	
	private String CarModel;
	
	public Dezire(int vehicle, String carModel) {
		super(vehicle);
		// TODO Auto-generated constructor stub
		CarModel = carModel;
	}
	
}
public class WildCard1 {
	
	void disp1(List<WildCard1> list) {
		for(WildCard1 i : list) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<WildCard> list = new ArrayList<>();
		list.add(new WildCard(1));
		list.add(new WildCard(2));
		list.add(new WildCard(3));
		list.add(new WildCard(4));
		
		list.add(new Dezire(5, "Alto"));
		list.add(new Dezire(1, "Celerio"));
		
		System.out.println(list);
	}

}