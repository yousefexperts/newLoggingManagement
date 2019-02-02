package com.experts.core.biller.statemachine.api.gigaspace.daos.repo;

import com.experts.core.biller.statemachine.api.model.domain.jpa.settlement.Billers;
import org.springframework.data.xap.repository.XapRepository;

public interface BillerRepo extends XapRepository<Long, Billers> {
}
