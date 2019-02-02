package com.experts.core.biller.statemachine.api.rules.facts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
public class RuleMessageFactsResponse implements Serializable {

   private String message;

   private String exception;

   private String text;

   private boolean isSuccess;

   public RuleMessageFactsResponse() {
	   
   }
   
   public RuleMessageFactsResponse( String message ,String exception ,String text ,boolean isSuccess ) {
	   this.exception = exception;
	   this.isSuccess = isSuccess;
	   this.text = text;
	   this.message = message;
   }
   
   public static class Builder {

       private String message;

       private String exception;

       private String text;

       private boolean isSuccess;

       public Builder message(String message){
           this.message = message;
           return this;
       }

       public Builder execption(String execption){
           this.exception = execption;
           return this;
       }

       public Builder text(String text){
           this.text = text;
           return this;
       }

       public Builder isSuccess(boolean isSuccess){
           this.isSuccess = isSuccess;
           return this;
       }

       public RuleMessageFactsResponse build(){
           return new RuleMessageFactsResponse(message , exception , text , isSuccess );
       }
   }
}
