package com.experts.core.biller.statemachine.api.model.domain.jpa.settlement;


import com.experts.core.biller.statemachine.api.model.domain.jpa.AbstractEntity_;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpacePersist;
import com.gigaspaces.annotation.pojo.SpaceVersion;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "system_settings")
@SpaceClass
public class SystemSetting extends AbstractEntity_ implements Serializable {

   @Column(name  = "key" , nullable = false)
   private String key;

   @Column(name  = "value" , nullable = false)
   private String value;

   @Column(name  = "description" , nullable = true)
   private String description;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name =  "type_id" , nullable = false)
   private SystemSettingCatogrey types;


   @SpaceIndex
   @SpacePersist
   public String getKey() {
      return key;
   }

   public void setKey(String key) {
      this.key = key;
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
   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }


   @SpaceIndex
   @SpacePersist
   public SystemSettingCatogrey getTypes() {
      return types;
   }

   public void setTypes(SystemSettingCatogrey types) {
      this.types = types;
   }

   private int version;


   @SpaceVersion
   public int getVersion() {
      return version;
   }
}
