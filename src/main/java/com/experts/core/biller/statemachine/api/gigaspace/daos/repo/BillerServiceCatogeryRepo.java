package com.experts.core.biller.statemachine.api.gigaspace.daos.repo;

import com.experts.core.biller.statemachine.api.model.domain.jpa.settlement.BillerServiceCatogery;
import org.springframework.data.xap.repository.XapRepository;

public interface BillerServiceCatogeryRepo extends XapRepository<Long , BillerServiceCatogery> {
}
