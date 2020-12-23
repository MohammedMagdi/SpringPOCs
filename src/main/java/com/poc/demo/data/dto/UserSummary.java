package com.poc.demo.data.dto;

import java.io.Serializable;

public class UserSummary implements Serializable, UserCustomInf {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5936135780816368745L;

	private Long recId;

	private String firstName;

	private String lastName;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
