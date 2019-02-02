
package com.experts.core.biller.statemachine.api.model.domain.jpa.settlement;

import com.gigaspaces.annotation.pojo.*;

import java.io.Serializable;


@SpaceClass
public class AccountData implements Serializable {
	

	private String userName;

	private int version;


	@SpaceVersion
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	private Integer balance;

	public AccountData() {
	}

	public AccountData(String userName, Integer balance) {
		this.userName = userName;
		this.balance = balance;
	}

	public Integer getBalance() {
		return balance;
	}


	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	@SpaceId
	@SpaceRouting
	@SpaceIndex
	@SpacePersist
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	public String toString() {
		return "userName[" + userName + "] balance[" + balance + "]";
	}

}
