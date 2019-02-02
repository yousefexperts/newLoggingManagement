package com.experts.core.biller.statemachine.api.model.domain.jpa;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpacePersist;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Data
@SpaceClass
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "age", nullable = false)
	private Integer age;

	@SpaceIndex
	@SpacePersist
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}



	
}
