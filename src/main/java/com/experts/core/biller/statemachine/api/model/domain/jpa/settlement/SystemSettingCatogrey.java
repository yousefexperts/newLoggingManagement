package com.experts.core.biller.statemachine.api.model.domain.jpa.settlement;


import com.experts.core.biller.statemachine.api.model.domain.jpa.AbstractEntity_;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpacePersist;
import com.gigaspaces.annotation.pojo.SpaceVersion;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "system_settings_catogrey")
@SpaceClass
public class SystemSettingCatogrey extends AbstractEntity_ implements Serializable {

    @Column(name  = "name" , nullable = false)
    private String name;

    @Column(name  = "type" , nullable = false)
    private String type;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "types")
    private List<SystemSetting> systemSettings;


    @SpaceIndex
    @SpacePersist
    public List<SystemSetting> getSystemSettings() {
        return systemSettings;
    }

    public void setSystemSettings(List<SystemSetting> systemSettings) {
        this.systemSettings = systemSettings;
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
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private int version;


    @SpaceVersion
    public int getVersion() {
        return version;
    }
}
