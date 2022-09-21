package com.zookeeper.projectone;

public class Bat extends Mammal{
	public Bat() {
		super(300);
		System.out.println("AAHHHHH! A Bat!!!");
		super.displayEnergy();
	}
	
	public void fly() {
		System.out.println("WOOOOSH...");
		super.expendEnergy(50);
		super.displayEnergy();
	}
	public void eatHumans() {
		System.out.println("Eats a helpless victim");
		super.gainEnergy(25);
		super.displayEnergy();
	}
	public void attackTown() {
		System.out.println("The bat breathed fire on the town");
		super.expendEnergy(100);
		super.displayEnergy();
	}
}
