package com.experts.core.biller.statemachine.api.model.domain.jpa;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Data
@SpaceClass
public class AbstractEntity_ {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @CreatedDate
    private Date createdDate;

    @LastModifiedDate
    private Date modifiedDate;

    @CreatedBy
    private String userName;

    @LastModifiedBy
    private String lastModifiedBy;

    
	
    @SpaceId(autoGenerate = true)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		id = id;
	}

	@SpaceIndex
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@SpaceIndex
	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@SpaceIndex
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@SpaceIndex
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
}
