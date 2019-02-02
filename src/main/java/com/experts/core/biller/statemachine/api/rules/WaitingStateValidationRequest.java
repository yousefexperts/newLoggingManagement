package com.experts.core.biller.statemachine.api.rules;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.When;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

@Data
@Builder
@Rule(order = 3)
public class WaitingStateValidationRequest implements Serializable{

    @Given("billCode")
    private String billCode;

    @Given("billName")
    private String billName;

    @Given("billerName")
    private String billerName;

    @Given("billerCode")
    private String billerCode;

    @Given("billerAddress")
    private String billerAddress;

    @Given("clientId")
    private String clientId;

    @Given("onServiceBy")
    private String onServiceBy;

    @Given("bankId")
    private String bankId;

    @Given("bankName")
    private String bankName;

    @Given("bankAddress")
    private String bankAddress;

    @Given("bankCode")
    private String bankCode;

    private boolean isSuccess;

    public WaitingStateValidationRequest() {}
    
    public WaitingStateValidationRequest(String billCode ,String billName ,String billerName ,String billerCode ,String billerAddress ,String clientId ,String  onServiceBy ,String bankId ,String bankName , String bankAddress ,String bankCode , boolean isSuccess) {
    	
    	this.bankAddress = bankAddress;
    	this.bankCode = bankCode;
    	this.bankId = bankId;
    	this.bankName = bankName;
    	this.billCode = billCode;
    	this.billerCode = billerCode;
    	this.clientId = clientId;
    	this.isSuccess =  isSuccess;
    	this.onServiceBy = onServiceBy;
    	this.billName =  billName;
    	
    	
    }
    
    @When
    public boolean when(){

        if(StringUtils.isBlank(billCode) || StringUtils.isEmpty(billCode)){

        }

        if(StringUtils.isBlank(billName) || StringUtils.isEmpty(billName)){

        }

        if(StringUtils.isBlank(billerCode) || StringUtils.isEmpty(billerCode)){

        }

        if(StringUtils.isBlank(billerName) || StringUtils.isEmpty(billerName)){

        }

        if(StringUtils.isBlank(clientId) || StringUtils.isEmpty(clientId)){

        }

        if(StringUtils.isBlank(billerAddress) || StringUtils.isEmpty(billerAddress)){

        }

        if(StringUtils.isBlank(bankAddress) ||  StringUtils.isEmpty(bankAddress)){

        }

        if(StringUtils.isBlank(bankCode) || StringUtils.isEmpty(bankCode)){

        }

        if(StringUtils.isBlank(bankId) || StringUtils.isEmpty(bankId)){

        }

        if(StringUtils.isBlank(bankName) || StringUtils.isEmpty(bankName)){

        }
        return isSuccess;
    }

    public static class Builder {

        private String billCode;
        private String billName;
        private String billerName;
        private String billerCode;
        private String billerAddress;
        private String clientId;
        private String onServiceBy;
        private String bankId;
        private String bankName;
        private String bankAddress;
        private String bankCode;

        private boolean isSuccess;

        public Builder billCode(String billCode){
            this.billCode = billCode;
            return this;
        }

        public Builder billName(String billName){
            this.billName = billName;
            return this;
        }

        public Builder billerCode(String billerCode){
            this.billerCode = billerCode;
            return this;
        }

        public Builder billerName(String billerName){
            this.billerName = billerName;
            return this;
        }

        public Builder billerAddress(String billerAddress){
            this.billerAddress = billerAddress;
            return this;
        }

        public Builder clientId(String clientId){
            this.clientId = clientId;
            return this;
        }

        public Builder onServiceBy(String onServiceBy){
            this.onServiceBy = onServiceBy;
            return this;
        }

        public Builder bankId(String bankId){
            this.bankId = bankId;
            return this;
        }

        public Builder bankName(String bankName){
            this.bankName = bankName;
            return this;
        }

        public Builder bankAddress(String bankAddress){
            this.bankAddress = bankAddress;
            return this;
        }

        public Builder bankCode(String bankCode){
            this.bankCode = bankCode;
            return this;
        }


        public Builder isSuccess(boolean isSuccess){
            this.isSuccess = isSuccess;
            return this;
        }

        public WaitingStateValidationRequest build(){
            return new WaitingStateValidationRequest(billCode , billName , billerName , billerCode , billerAddress , clientId ,  onServiceBy , bankId , bankName , bankAddress , bankCode , isSuccess);
        }
    }

}
