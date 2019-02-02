package com.experts.core.biller.statemachine.api.gigaspace.daos.repo;

import com.experts.core.biller.statemachine.api.model.domain.jpa.settlement.TransactionThreadCapcity;
import org.springframework.data.xap.repository.XapRepository;

public interface CapacityRepo extends XapRepository<Long, TransactionThreadCapcity> {
}
