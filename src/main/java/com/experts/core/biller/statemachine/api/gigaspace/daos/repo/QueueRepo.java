package com.experts.core.biller.statemachine.api.gigaspace.daos.repo;

import com.experts.core.biller.statemachine.api.model.domain.jpa.settlement.TransactionQueue;
import org.springframework.data.xap.repository.XapRepository;

public interface QueueRepo extends XapRepository<Long, TransactionQueue> {
}
