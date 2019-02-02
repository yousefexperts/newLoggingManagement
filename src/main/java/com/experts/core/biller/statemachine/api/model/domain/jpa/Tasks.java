package com.experts.core.biller.statemachine.api.model.domain.jpa;

import com.experts.core.biller.statemachine.api.constants.TasksType;
import com.experts.core.biller.statemachine.api.persist.OpsEntityListener;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpacePersist;
import com.gigaspaces.annotation.pojo.SpaceVersion;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name  = "tasks")
@Data
@Builder
@EntityListeners({AuditingEntityListener.class , OpsEntityListener.class})
@SpaceClass
public class Tasks extends AbstractEntity_ {

    @Column(name  = "task_name" , nullable = false)
    private String taskName;

    @Column(name  = "task_id" , nullable = false)
    private String taskId;

    @Column(name  = "type" , nullable = false)
    private TasksType type;

    @OneToMany(fetch = FetchType.LAZY , mappedBy = "tasks_" , cascade = CascadeType.ALL)
    private List<TaskVariables> variables;

    private int version;

    @SpaceIndex
    @SpacePersist
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @SpaceIndex
    @SpacePersist
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @SpaceIndex
    @SpacePersist
    public TasksType getType() {
        return type;
    }

    public void setType(TasksType type) {
        this.type = type;
    }

    @SpaceIndex
    @SpacePersist
    public List<TaskVariables> getVariables() {
        return variables;
    }

    public void setVariables(List<TaskVariables> variables) {
        this.variables = variables;
    }

    @SpaceVersion
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Tasks() {}
    public Tasks(String taskName , String taskId , TasksType type , List<TaskVariables> variables , int abc ) {
    	this.taskId = taskId;
    	this.taskName=taskName;
    	this.type=type;
    	this.variables = variables;
    }
    
    @SpaceClass
    public static class Builder {

        private String taskName;
        private String taskId;
        private TasksType type;
        private List<TaskVariables> variables;

        @SpaceIndex
        @SpacePersist
        public Builder taskName(String taskName){
            this.taskName = taskName;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder taskId(String taskId){
            this.taskId = taskId;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder type(TasksType type){
            this.type = type;
            return this;
        }

        @SpaceIndex
        @SpacePersist
        public Builder variables(List<TaskVariables> variables){
            this.variables = variables;
            return this;
        }
        public Tasks build(){
            return new Tasks(taskName , taskId , type , variables , 001);
        }
    }
}
