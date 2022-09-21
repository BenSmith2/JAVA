package com.zookeeper.projectone;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla george = new Gorilla();
		System.out.println("Woke up...");
		george.throwSomething();
		george.displayEnergy();
		george.climb();
		george.displayEnergy();
		george.eatBananas();
		george.displayEnergy();
		
		Bat betty = new Bat();
		betty.fly();
		betty.eatHumans();
		betty.attackTown();
	}
}