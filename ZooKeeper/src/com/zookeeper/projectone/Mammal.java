package com.zookeeper.projectone;

public class Mammal {
	private int energyLevel = 100;
	
	public Mammal() {};
	
	public Mammal(int energyLevel){
		this.energyLevel = energyLevel;
	}
//	
//	public int getEnergyLevel() {
//		return energyLevel;
//	}
//	public void setEnergyLevel(int energyLevel) {
//		this.energyLevel = energyLevel;
//	}
	public void displayEnergy() {
		System.out.printf("Total Energy: %s\n", energyLevel);
//		return energyLevel;
	}
	public int expendEnergy(int num) {
		//System.out.printf("Total Energy: %s\n", energyLevel);
		return energyLevel -= num;
	}
	public int gainEnergy(int num) {
		//System.out.printf("Total Energy: %s\n", energyLevel);
		return energyLevel += num;
	}
	
}