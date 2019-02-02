package com.experts.core.biller.statemachine.api.model.domain.jpa;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;


@SuppressWarnings("unused")
@AllArgsConstructor
@Getter
public class CustomErrorResponse implements Serializable {

	private static final long serialVersionUID = -7755563009111273632L;

	private String errorCode;

	private String errorMessage;

}
