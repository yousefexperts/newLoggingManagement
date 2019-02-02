package com.experts.core.biller.statemachine.api.model.domain.jpa;


import com.experts.core.biller.statemachine.api.constants.Currency;
import com.experts.core.biller.statemachine.api.model.EntityRevisionListener_;
import com.experts.core.biller.statemachine.api.persist.OpsEntityListener;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceVersion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name =  "pay_state")
@Data
@EntityListeners({EntityRevisionListener_.class})
@SpaceClass
public class PayState extends AbstractEntity_{

    @ManyToOne
    @JoinColumn(name  = "payment_id" , nullable = false)
    private Payment payments;

    @OneToMany( fetch = FetchType.LAZY , mappedBy =  "states" , cascade =  CascadeType.ALL)
    private List<Transaction> transactions;

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Payment getPayments() {
        return payments;
    }

    public void setPayments(Payment payments) {
        this.payments = payments;
    }

    private int version;

    @SpaceVersion
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public InitialState getState() {
        return state;
    }

    public void setState(InitialState state) {
        this.state = state;
    }

    /*private String id;*/

    @Column(name  = "transaction" , nullable = false)
    private String transaction;

    @Column(name  = "amount" , nullable = false)
    private String amount;

    @Column(name  = "currency" , nullable = false)
    private Currency currency;

    @Column(name  = "bank_code" , nullable = false)
    private String bankCode;


    @OneToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name =  "initial_state" , nullable = false)
    private InitialState state;

    @JsonCreator( mode  = JsonCreator.Mode.PROPERTIES)
    public PayState(){}




    public static class Builder {

        private String transaction;

        private String amount;

        private Currency currency;

        private String bankCode;

        private InitialState initialState;

        public Builder transaction(String transaction){
            this.transaction = transaction;
            return this;
        }

        public Builder amount(String amount){
            this.amount = amount;
            return this;
        }

        public Builder currency(Currency currency){
            this.currency = currency;
            return this;
        }

        public Builder bankCode(String bankCode){
            this.bankCode = bankCode;
            return this;
        }

        public Builder initialState(InitialState initialState){
            this.initialState =initialState;
            return this;
        }

        public PayState build(){
            return new PayState();
        }
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
}
