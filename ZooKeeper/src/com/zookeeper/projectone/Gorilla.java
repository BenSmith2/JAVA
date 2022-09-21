package com.zookeeper.projectone;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Threw oop.. -5");
		super.expendEnergy(5);
	}
	public void climb() {
		System.out.println("Climbed a tree.. -10");
		super.expendEnergy(10);
	}
	public void eatBananas() {
		System.out.println("Ate Bananas... +10");
		super.gainEnergy(10);
	}
}
