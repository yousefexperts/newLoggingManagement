package com.experts.core.biller.statemachine.api.model.domain.jpa;

import com.experts.core.biller.statemachine.api.model.EntityRevisionListener_;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceVersion;
import lombok.Data;
import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@RevisionEntity(EntityRevisionListener_.class)
@Data
@SpaceClass
public class CustomTrackingEntity extends DefaultRevisionEntity {
    @Id
    @GeneratedValue
    private int customId;

    @Column(name  = "username" , nullable = false)
    private String username;

    private int version;

    @Column(name = "entity_name" , nullable = false)
    private String entityName;


    @SpaceVersion
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }



    @OneToMany(mappedBy="customTrackingEntity", cascade={CascadeType.PERSIST, CascadeType.REMOVE})
    private List<CustomRevisionEntity> modifiedEntityTypes = new ArrayList<>();




    public int getCustomId() {
        return customId;
    }

    public void setCustomId(int customId) {
        this.customId = customId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public List<CustomRevisionEntity> getModifiedEntityTypes() {
        return modifiedEntityTypes;
    }

    public void setModifiedEntityTypes(List<CustomRevisionEntity> modifiedEntityTypes) {
        this.modifiedEntityTypes = modifiedEntityTypes;
    }


}
