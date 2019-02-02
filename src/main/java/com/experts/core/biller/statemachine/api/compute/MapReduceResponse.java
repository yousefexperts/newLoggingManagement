package com.experts.core.biller.statemachine.api.compute;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Map;

/**
 *  the generic reduce response that contain all single collected jobs responses
 */
@Builder
@Getter
@ToString
@EqualsAndHashCode
public class MapReduceResponse implements Serializable {
    private Map<String, ServiceResponse> reducedResponses;
    private  boolean success;
	public Map<String, ServiceResponse> getReducedResponses() {
		return reducedResponses;
	}
	public void setReducedResponses(Map<String, ServiceResponse> reducedResponses) {
		this.reducedResponses = reducedResponses;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
    
	public MapReduceResponse(Map<String, ServiceResponse> reducedResponses  , boolean success) {
		this.reducedResponses = reducedResponses;
		this.success = success;
	}
	
	public static class Builder {
		
		private Map<String, ServiceResponse> reducedResponses;
	    private  boolean success;
		
	         
	    public Builder reducedResponses(Map<String, ServiceResponse> red){
	    	this.reducedResponses = red;
	    	return this;
	    }
	    
	    public Builder success(boolean success) {
	    	this.success = success;
	    	return this;
	    }
		
	    public MapReduceResponse build() {
	    	return new MapReduceResponse(reducedResponses,success);
	    }
	    
	}
    
	
	
}
