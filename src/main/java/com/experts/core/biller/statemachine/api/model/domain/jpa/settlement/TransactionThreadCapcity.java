package com.experts.core.biller.statemachine.api.model.domain.jpa.settlement;


import com.experts.core.biller.statemachine.api.model.domain.jpa.AbstractEntity_;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpacePersist;
import com.gigaspaces.annotation.pojo.SpaceVersion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "transaction_thread_capcity")
@SpaceClass
public class TransactionThreadCapcity extends AbstractEntity_ implements Serializable {

    @Column(name  = "max" , nullable = false)
    private int max;

    @Column(name  = "min" , nullable = false)
    private int min;

    @Column(name  = "high_priority" , nullable = false)
    private boolean highPriority;


    @SpaceIndex
    @SpacePersist
    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @SpaceIndex
    @SpacePersist
    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @SpaceIndex
    @SpacePersist
    public boolean isHighPriority() {
        return highPriority;
    }

    public void setHighPriority(boolean highPriority) {
        this.highPriority = highPriority;
    }

    private int version;


    @SpaceVersion
    public int getVersion() {
        return version;
    }
}
