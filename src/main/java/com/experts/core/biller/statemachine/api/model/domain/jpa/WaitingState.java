package com.experts.core.biller.statemachine.api.model.domain.jpa;

import com.experts.core.biller.statemachine.api.model.EntityRevisionListener_;
import com.experts.core.biller.statemachine.api.persist.OpsEntityListener;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name  = "waiting_state")
@Data
@EntityListeners({EntityRevisionListener_.class})
public class WaitingState extends AbstractEntity_{

    public static final String DB_TABLE = "com/experts/core/biller/statemachine/api/vertxloader";

    @Column(name  = "waiting_ops_name" , nullable = false)
    private String waitingOpsName;

    @OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name =  "process_id" , nullable = false)
    private ProcessState processState;

    @Column(name  = "period" , nullable = false)
    private String period;

    @Column(name  = "bill_code" , nullable = false)
    private String billCode;

    @Column(name  = "bill_name" , nullable = false)
    private String billName;

    @Column(name  = "bank_code" , nullable = false)
    private String bankCode;

    @Column(name  = "biller_code" , nullable = false)
    private String billerCode;

    @Column(name  = "transaction_id" , nullable = false)
    private String transactionId;

    @JsonCreator(mode  = JsonCreator.Mode.PROPERTIES)
    public WaitingState(){}

    public static String getDbTable() {
        return DB_TABLE;
    }

    public String getWaitingOpsName() {
        return waitingOpsName;
    }

    public void setWaitingOpsName(String waitingOpsName) {
        this.waitingOpsName = waitingOpsName;
    }

    public ProcessState getProcessState() {
        return processState;
    }

    public void setProcessState(ProcessState processState) {
        this.processState = processState;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBillerCode() {
        return billerCode;
    }

    public void setBillerCode(String billerCode) {
        this.billerCode = billerCode;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public WaitingState(String waitingOpsName , String period , String billCode , String billName , String bankCode , String billerCode , String transactionId){
        this.waitingOpsName = waitingOpsName;
        this.period = period;
        this.bankCode = bankCode;
        this.billCode =  billCode;
        this.billName = billName;
        this.billerCode =  billerCode;
        this.transactionId = transactionId;
    }

    public static class Builder {

        private String waitingOpsName;
        private ProcessState processState;
        private String period;
        private String billCode;
        private String billName;
        private String bankCode;
        private String billerCode;
        private String transactionId;

        public Builder waitingOpsName(String waitingOpsName){
            this.waitingOpsName = waitingOpsName;
            return this;
        }


        public Builder processState(ProcessState processState){
            this.processState = processState;
            return this;
        }


        public Builder period(String period){
            this.period = period;
            return this;
        }

        public Builder billCode(String billerCode){
            this.billCode = billCode;
            return this;
        }

        public Builder billName(String billName){
            this.billName = billName;
            return this;
        }

        public Builder bankCode(String bankCode){
            this.bankCode = bankCode;
            return this;
        }

        public Builder billerCode(String billerCode){
            this.billerCode = billerCode;
            return this;
        }

        public Builder transactionId(String transactionId){
            this.transactionId = transactionId;
            return this;
        }

        public WaitingState build(){
            return new WaitingState();
        }
    }



}
