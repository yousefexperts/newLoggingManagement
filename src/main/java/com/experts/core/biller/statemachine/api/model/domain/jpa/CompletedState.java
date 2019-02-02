package com.experts.core.biller.statemachine.api.model.domain.jpa;

import com.experts.core.biller.statemachine.api.model.EntityRevisionListener_;
import com.experts.core.biller.statemachine.api.persist.OpsEntityListener;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpacePersist;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name  = "completed_state")
@Data
@EntityListeners({EntityRevisionListener_.class})
@SpaceClass
public class CompletedState extends AbstractEntity_ {

    public static final String DB_TABLE = "com/experts/core/biller/statemachine/api/vertxloader";

    @Column(name  = "name" , nullable = false)
    private String name;

    @Column(name  = "code" , nullable = false)
    private String code;

    @Column(name  = "message" , nullable = false)
    private String message;

    @Column(name  = "execption" , nullable = true)
    private String execption;

    @Column(name  = "sucess" , nullable = false)
    private boolean isSuccess;

    @OneToOne
    @JoinColumn(name  = "processstate_completedState" , nullable = false)
    private ProcessState processstate_completedState;

    @Column(name  = "bill_no" , nullable = false)
    private String billNo;

    @Column(name  = "bill_code" , nullable = false)
    private String billCode;

    @Column(name  = "transaction_id" , nullable = false)
    private String transactionId;

    @Column(name  = "biller_name" , nullable = false)
    private String billerName;

    @Column(name  = "biller_code" , nullable = false)
    private String billerCode;


    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public CompletedState(){

    }


    @SpaceIndex
    @SpacePersist
    public static String getDbTable() {
        return DB_TABLE;
    }

    @SpaceIndex
    @SpacePersist
    public ProcessState getProcessstate_completedState() {
        return processstate_completedState;
    }

    public void setProcessstate_completedState(ProcessState processstate_completedState) {
        this.processstate_completedState = processstate_completedState;
    }

    @SpaceIndex
    @SpacePersist
    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    @SpaceIndex
    @SpacePersist
    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    @SpaceIndex
    @SpacePersist
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @SpaceIndex
    @SpacePersist
    public String getBillerName() {
        return billerName;
    }

    public void setBillerName(String billerName) {
        this.billerName = billerName;
    }

    @SpaceIndex
    @SpacePersist
    public String getBillerCode() {
        return billerCode;
    }

    public void setBillerCode(String billerCode) {
        this.billerCode = billerCode;
    }

    public CompletedState(Long id, String name, String code, String  message , String execption , String billNo , String billCode , String transactionId , String billerName , String billerCode){
       /* this.id = id;*/
        this.name  = name ;
        this.code = code ;
        this.message = message;
        this.execption = execption;
        this.billNo = billNo;
        this.billCode = billCode;
        this.transactionId =  transactionId;
        this.billerName = billerName;
        this.billerCode = billerCode;
    }


    @SpaceClass
    public static class Builder {
        private String name;
        private String code;
        private String message;
        private String execption;
        private boolean isSuccess;
        private ProcessState processState;

        private String billNo;
        private String billCode;
        private String transactionId;
        private String billerName;
        private String billerCode;

        private transient  String _id;
        private transient  String _name;
        private transient Integer _val;

        @SpaceIndex
        @SpacePersist
        public Builder _id(String _id){
            this._id = _id;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder _name(String _name){
            this._name = _name;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder _val(Integer _val) {
            this._val = _val;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder transaction(String transactionId){
            this.transactionId = transactionId;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder billerName(String billerName){
            this.billerName = billerName;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder billerCode(String billerCode){
            this.billerCode = billerCode;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder billCode(String billCode){
            this.billCode = billCode;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder name(String name){
            this.name = name;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder code(String code){
            this.code = code;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder message(String message){
            this.message = message;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder execption(String txt){
            this.message = txt;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder isSuccess(boolean isSuccess){
            this.isSuccess = isSuccess;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder  processState(ProcessState processState){
            this.processState = processState;
            return this;
        }

        public CompletedState build(){
            return new CompletedState(    );
        }
    }

    @SpaceIndex
    @SpacePersist
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SpaceIndex
    @SpacePersist
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @SpaceIndex
    @SpacePersist
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @SpaceIndex
    @SpacePersist
    public String getExecption() {
        return execption;
    }

    public void setExecption(String execption) {
        this.execption = execption;
    }

    @SpaceIndex
    @SpacePersist
    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }
}
