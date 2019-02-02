package com.experts.core.biller.statemachine.api.gigaspace.db.daos;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;
import com.gigaspaces.annotation.pojo.SpaceRouting;


@SpaceClass
public class OrderEvent {
	
	public static final String STATUS_NEW = "New";	
	public static final String STATUS_PENDING = "Pending";	
	public static final String STATUS_PROCESSED = "Processed";
	public static final String STATUS_INSUFFICIENT_FUNDS = "InsufficientFunds";
	public static final String STATUS_ACCOUNT_NOT_FOUND = "AccountNotFound";
	
	public static final int BUY_OPERATION = 1;
	public static final int INQUIRY_OPERATION = 2;
	public static final int PREPAID_OPERATION = 3;

    public static short[] OPERATIONS = {BUY_OPERATION, INQUIRY_OPERATION,PREPAID_OPERATION};
    

    private Short operation;
    

    private String orderID;
    

    private String userName;
    

    private Integer price;
    

    private String status;		
    

    public OrderEvent() {
    }


    public OrderEvent(String userName, Integer price, short operation) {
        this.userName = userName;
    	this.price = price;
        this.operation = operation;
        this.status = STATUS_NEW;
    }


    @SpaceId(autoGenerate = true)
    public String getOrderID() {
        return orderID;
    }


    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }


    @SpaceRouting
    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }
    

    public String toString() {
        return "userName[" + userName + "] operation[" + operation + "] price[" + price + "] status[" + status + "]";
    }

	public Short getOperation() {
		return operation;
	}

	public void setOperation(Short operation) {
		this.operation = operation;
	}

	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
}
