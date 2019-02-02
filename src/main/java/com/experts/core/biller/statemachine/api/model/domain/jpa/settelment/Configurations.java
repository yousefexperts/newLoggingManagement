package com.experts.core.biller.statemachine.api.model.domain.jpa.settelment;

import com.experts.core.biller.statemachine.api.model.domain.jpa.AbstractEntity_;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name  = "configuration_biller")
public class Configurations extends AbstractEntity_ {

    @Column(name  = "conf_name" , nullable = false)
    private String confName;

    @Column(name  = "conf_dir" , nullable = false)
    private String confDir;

    @Column(name  = "conf_file" , nullable = false)
    private String confFile;


    public String getConfName() {
        return confName;
    }

    public void setConfName(String confName) {
        this.confName = confName;
    }

    public String getConfDir() {
        return confDir;
    }

    public void setConfDir(String confDir) {
        this.confDir = confDir;
    }

    public String getConfFile() {
        return confFile;
    }

    public void setConfFile(String confFile) {
        this.confFile = confFile;
    }
}
