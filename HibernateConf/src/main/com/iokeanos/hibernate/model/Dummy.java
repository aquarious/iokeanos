package com.iokeanos.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "Dummy")
public class Dummy {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private long id;

	@Column(name = "string1")
	private String string1;

	@Column(name = "string2")

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getString1() {
		return string1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}


}
