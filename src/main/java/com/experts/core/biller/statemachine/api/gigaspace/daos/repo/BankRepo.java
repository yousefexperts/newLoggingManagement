package com.experts.core.biller.statemachine.api.gigaspace.daos.repo;

import com.experts.core.biller.statemachine.api.model.domain.jpa.settlement.Bank;
import org.springframework.data.xap.repository.XapRepository;

public interface BankRepo extends XapRepository<Long , Bank> {
}
