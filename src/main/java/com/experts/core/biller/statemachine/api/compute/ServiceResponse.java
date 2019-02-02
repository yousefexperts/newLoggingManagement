package com.experts.core.biller.statemachine.api.compute;


import lombok.*;

import java.io.Serializable;

/**
 * @param <T> the service call response type
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class ServiceResponse<T> implements Serializable {
    private T response;
    private boolean success ;
    private String serviceOrigin;
	public T getResponse() {
		return response;
	}
	public void setResponse(T response) {
		this.response = response;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getServiceOrigin() {
		return serviceOrigin;
	}
	public void setServiceOrigin(String serviceOrigin) {
		this.serviceOrigin = serviceOrigin;
	}
    
    
    
}
