package com.experts.core.biller.statemachine.api.model.domain.jpa;

import com.experts.core.biller.statemachine.api.model.EntityRevisionListener_;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpacePersist;
import com.gigaspaces.annotation.pojo.SpaceVersion;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;


@Entity
@Table(name  = "transaction")
@Data
@EntityListeners({EntityRevisionListener_.class})
public class Transaction extends AbstractEntity_{


    private int version;

    @SpaceVersion
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "state_id" , nullable = false)
    private PayState states;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "state_process_id" , nullable = false)
    private ProcessState processes;


    @SpaceIndex
    @SpacePersist
    public PayState getStates() {
        return states;
    }

    public void setStates(PayState states) {
        this.states = states;
    }

    @SpaceIndex
    @SpacePersist
    public ProcessState getProcesses() {
        return processes;
    }

    public void setProcesses(ProcessState processes) {
        this.processes = processes;
    }

    @OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private TransactionStatus status;


    public Transaction() {
    }

    public Transaction(TransactionStatus status) {
        this.status = status;
    }


    public TransactionStatus getStatus() {
        return status;
    }



    public void waitingPay() {
        status.waitingPay();
    }

    public void paid() {
        status.paid();
    }

    public void cancelled() {
        status.cancelled();
    }

}