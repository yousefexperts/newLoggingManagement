package com.experts.core.biller.statemachine.api.soapService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://www.experts.ps/ws/notifaction", name = "PaymentNotificationResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentNotificationResponse {

   private String Transactions;
   private String TrxInf;
   private String JOEBPPSTrx;
   private String STMTDate;
   private String Result;
   private String idType;
   private String ErrorCode;
   private String Severity;

    public String getTransactions() {
        return Transactions;
    }

    public void setTransactions(String transactions) {
        Transactions = transactions;
    }

    public String getTrxInf() {
        return TrxInf;
    }

    public void setTrxInf(String trxInf) {
        TrxInf = trxInf;
    }

    public String getJOEBPPSTrx() {
        return JOEBPPSTrx;
    }

    public void setJOEBPPSTrx(String JOEBPPSTrx) {
        this.JOEBPPSTrx = JOEBPPSTrx;
    }

    public String getSTMTDate() {
        return STMTDate;
    }

    public void setSTMTDate(String STMTDate) {
        this.STMTDate = STMTDate;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(String errorCode) {
        ErrorCode = errorCode;
    }

    public String getSeverity() {
        return Severity;
    }

    public void setSeverity(String severity) {
        Severity = severity;
    }
}
