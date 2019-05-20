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
	private int paladin;
	private int runemage;
	private int shaman;
	private int gambler;
	private int bard;
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
	public int getShaman() {
		return shaman;
	}
	/**
	 * @param unarmed the unarmed to set
	 */
	public void setShaman(int shaman) {
		this.shaman = shaman;
	}
	/**
	 * @return the unarmed
	 */
	public int getPaladin() {
		return paladin;
	}
	/**
	 * @param unarmed the unarmed to set
	 */
	public void setPaladin(int paladin) {
		this.paladin = paladin;
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
	public int getGambler() {
		return gambler;
	}
	public void setGambler(int gambler) {
		this.gambler = gambler;
	}
	public int getBard() {
		return bard;
	}
	public void setBard(int bard) {
		this.bard = bard;
	}
	
	public String toString() {
		return "archer: " + this.archer + ", " +
				"barbarian: " + this.barbarian + ", " +
				"fisher: " + this.fisher + ", " +
				"orbhealer: " + this.orbhealer + ", " +
				"paladin: " + this.paladin + ", " +
				"runemage: " + this.runemage + ", " +
				"shaman: " + this.shaman + ", " +
				"swordboard: " + this.swordboard + ", " +
				"gambler: " + this.gambler + ", " +
				"bard: " + this.bard + ", " +
				"unamed: " + this.unarmed;			
	}
}
