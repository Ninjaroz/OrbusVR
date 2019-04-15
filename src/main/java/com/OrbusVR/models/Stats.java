package com.OrbusVR.models;

public class Stats {

	private String name;
	private long record;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the record
	 */
	public long getRecord() {
		return record;
	}
	/**
	 * @param record the record to set
	 */
	public void setRecord(long record) {
		this.record = record;
	}
	
	public String toString() {
		return "name: " + this.name + ", record: " + this.record;
	}
}
