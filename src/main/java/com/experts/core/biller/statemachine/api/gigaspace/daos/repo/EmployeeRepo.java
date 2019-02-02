package com.experts.core.biller.statemachine.api.gigaspace.daos.repo;

import com.experts.core.biller.statemachine.api.model.domain.jpa.settlement.EmployeeDetails;
import org.springframework.data.xap.repository.XapRepository;

public interface EmployeeRepo extends XapRepository<Long , EmployeeDetails> {
}
