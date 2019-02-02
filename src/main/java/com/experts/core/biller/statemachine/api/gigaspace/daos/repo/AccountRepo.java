package com.experts.core.biller.statemachine.api.gigaspace.daos.repo;

import com.experts.core.biller.statemachine.api.model.domain.jpa.settlement.AccountDetails;
import org.springframework.data.xap.repository.XapRepository;

public interface AccountRepo extends XapRepository<Long, AccountDetails> {
}
