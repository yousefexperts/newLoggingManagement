package com.experts.core.biller.statemachine.api.gigaspace.daos.repo;

import com.experts.core.biller.statemachine.api.model.domain.jpa.settlement.TransactionBatchJob;
import org.springframework.data.xap.repository.XapRepository;

public interface TransactionBatchJobRepo extends XapRepository<Long, TransactionBatchJob> {
}
