package com.experts.core.biller.statemachine.api.model.domain.jpa;

import com.experts.core.biller.statemachine.api.constants.VaribleType;
import com.experts.core.biller.statemachine.api.persist.OpsEntityListener;
import com.gigaspaces.annotation.pojo.*;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "tasks_varible")
@Data
@Builder
@EntityListeners({AuditingEntityListener.class, OpsEntityListener.class})
@SpaceClass
public class TaskVariables extends AbstractEntity_ {

    @Column(name  = "name" , nullable = false)
    private String varibleName;

    @Column(name  = "type" , nullable = false)
    private VaribleType type;

    @Column(name  = "value" , nullable = false)
    private String value;

    @ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL )
    @JoinColumn(name  = "task_id" , nullable = false)
    private Tasks tasks_;


    private int version;


    @SpaceIndex
    @SpacePersist
    public String getVaribleName() {
        return varibleName;
    }

    public void setVaribleName(String varibleName) {
        this.varibleName = varibleName;
    }

    @SpaceIndex
    @SpacePersist
    public VaribleType getType() {
        return type;
    }

    public void setType(VaribleType type) {
        this.type = type;
    }

    @SpaceIndex
    @SpacePersist
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @SpaceIndex
    @SpacePersist
    public Tasks getTasks() {
        return tasks_;
    }

    public void setTasks(Tasks tasks) {
        this.tasks_ = tasks;
    }

    @SpaceVersion
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public TaskVariables() {}
    public TaskVariables(String varibleName , VaribleType type , String value , Tasks tasks , int abc) {
    	this.tasks_ = tasks;
    	this.type = type;
    	this.value=value;
    	this.varibleName = varibleName;
    }

    @SpaceClass
    public static class Builder{

        private String varibleName;

        private VaribleType type;

        private String value;

        private Tasks task;

        @SpaceIndex
        @SpacePersist
        public Builder varibleName(String varibleName){
            this.varibleName = varibleName;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder type(VaribleType type){
            this.type = type;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder value(String value){
            this.value = value;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder task(Tasks task){
            this.task = task;
            return this;
        }

        public TaskVariables build(){
            return new TaskVariables(varibleName , type , value , task , 001);
        }
    }
}
