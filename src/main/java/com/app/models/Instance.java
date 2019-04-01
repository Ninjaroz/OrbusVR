package com.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "instance")
public class Instance {

	@Id
	@Column(name="instanceId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int instanceId;
	
	@Column(name="name")
	@NotNull
	private String name;
	
	
	public int getInstanceId() {
		return instanceId;
	}
	public void setInstanceId(int instanceId) {
		this.instanceId = instanceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
