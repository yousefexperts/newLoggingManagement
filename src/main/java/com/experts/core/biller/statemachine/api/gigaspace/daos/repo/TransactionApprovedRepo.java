package com.experts.core.biller.statemachine.api.gigaspace.daos.repo;

import com.experts.core.biller.statemachine.api.model.domain.jpa.settlement.TransactionApproved;
import org.springframework.data.xap.repository.XapRepository;

public interface TransactionApprovedRepo extends XapRepository<Long , TransactionApproved> {
}
