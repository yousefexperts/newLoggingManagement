package com.experts.core.biller.statemachine.api.rules;


import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.When;
import com.experts.core.biller.statemachine.api.rules.facts.RuleMessageFactsResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/*import javax.annotation.security.DenyAll;*/
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
/*@NoArgsConstructor*/
@Builder
@Rule(order = 4)
public class CompleteStateValidationRequest implements Serializable {

    @Given("id")
    private Long id;

    @Given("billCode")
    private String billCode;

    @Given("billerCode")
    private String billerCode;

    @Given("billName")
    private String billName;

    @Given("billerName")
    private String billerName;

    private boolean isSuccess;

    @Given("message")
    private String message;

    @Given("execption")
    private String execption;

    @Given("amount")
    private String amount;


    @Result
    private List<RuleMessageFactsResponse> ruleMessageFactsRespons;

    public CompleteStateValidationRequest(Long id , String billCode , String billName , String billerName , String billerCode , String message , String execption , String amount){
        this.billCode = billCode;
        this.amount = amount;
        this.billerCode = billerCode;
        this.billName = billName;
        this.execption = execption;
        this.message = message;
        this.billerName = billerName;
    }

    @When
    public boolean when(){

        if(StringUtils.isBlank(id.toString()) || StringUtils.isEmpty(id.toString())){

        }

        if(StringUtils.isBlank(billCode) || StringUtils.isEmpty(billCode)){

        }

        if(StringUtils.isBlank(billName) || StringUtils.isEmpty(billName)){

        }

        if(StringUtils.isBlank(billerName) || StringUtils.isEmpty(billerName)){

        }

        if(StringUtils.isBlank(billerCode) || StringUtils.isEmpty(billerCode)){

        }

        if(StringUtils.isBlank(amount) || StringUtils.isEmpty(amount)){

        }
        return isSuccess;
    }



    public static class Builder {

        private Long id;

        private String billCode;

        private String billerCode;

        private String billName;

        private String billerName;

        private boolean isSuccess;

        private String message;

        private String execption;

        private String amount;

        public Builder id(Long id){
            this.id = id;
            return this;
        }

        public Builder billCode(String billCode){
            this.billCode = billCode;
            return this;
        }

        public Builder billerCode(String billerCode){
            this.billerCode = billerCode;
            return this;
        }

        public Builder billName(String billName){
            this.billName = billName;
            return this;
        }

        public Builder billerName(String billerNamer){
            this.billerName = billerName;
            return this;
        }

        public Builder isSuccess(boolean isSuccess){
            this.isSuccess = isSuccess;
            return this;
        }

        public Builder message(String message){
            this.message = message;
            return this;
        }

        public Builder execption(String execption){
            this.execption = execption;
            return this;
        }

        public Builder amount(String amount){
            this.amount = amount ;
            return this;
            }

        public CompleteStateValidationRequest build(){
            return new CompleteStateValidationRequest( id ,billCode , billerCode ,  billName , billerName  , message , execption , amount );
        }
    }
}
