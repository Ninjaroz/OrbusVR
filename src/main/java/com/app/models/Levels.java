package com.app.models;

/*
 * Levels object
 * @author Gary Sundquist
 */
public class Levels {
	
	private int archer;
	private int barbarian;
	private int fisher;
	private int orbhealer;
	private int runemage;
	private int swordboard;
	private int unarmed;
	
	/**
	 * @return the archer
	 */
	public int getArcher() {
		return archer;
	}
	/**
	 * @param archer the archer to set
	 */
	public void setArcher(int archer) {
		this.archer = archer;
	}
	/**
	 * @return the barbarian
	 */
	public int getBarbarian() {
		return barbarian;
	}
	/**
	 * @param barbarian the barbarian to set
	 */
	public void setBarbarian(int barbarian) {
		this.barbarian = barbarian;
	}
	/**
	 * @return the fisher
	 */
	public int getFisher() {
		return fisher;
	}
	/**
	 * @param fisher the fisher to set
	 */
	public void setFisher(int fisher) {
		this.fisher = fisher;
	}
	/**
	 * @return the orbhealer
	 */
	public int getOrbhealer() {
		return orbhealer;
	}
	/**
	 * @param orbhealer the orbhealer to set
	 */
	public void setOrbhealer(int orbhealer) {
		this.orbhealer = orbhealer;
	}
	/**
	 * @return the runemage
	 */
	public int getRunemage() {
		return runemage;
	}
	/**
	 * @param runemage the runemage to set
	 */
	public void setRunemage(int runemage) {
		this.runemage = runemage;
	}
	/**
	 * @return the swordboard
	 */
	public int getSwordboard() {
		return swordboard;
	}
	/**
	 * @param swordboard the swordboard to set
	 */
	public void setSwordboard(int swordboard) {
		this.swordboard = swordboard;
	}
	/**
	 * @return the unarmed
	 */
	public int getUnarmed() {
		return unarmed;
	}
	/**
	 * @param unarmed the unarmed to set
	 */
	public void setUnarmed(int unarmed) {
		this.unarmed = unarmed;
	}
	
	public String toString() {
		return "archer: " + this.archer + ", " +
				"barbarian: " + this.barbarian + ", " +
				"fisher: " + this.fisher + ", " +
				"orbhealer: " + this.orbhealer + ", " +
				"runemage: " + this.runemage + ", " +
				"swordboard: " + this.swordboard + ", " +
				"unamed: " + this.unarmed;			
	}
}
