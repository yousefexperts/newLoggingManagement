package com.experts.core.biller.statemachine.api.persist;

import com.experts.core.biller.statemachine.api.constants.OperationsPersist;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class OpsEntityListener<T> {
    @PrePersist
    public void prePersist(T target) {
        perform(target, OperationsPersist.INSERT);
    }
    @PreUpdate
    public void preUpdate(T target) {
        perform(target, OperationsPersist.UPDATE);
    }
    @PreRemove
    public void preRemove(T target) {
        perform(target, OperationsPersist.DELETE);
    }
    @Transactional
    public void perform(T target, OperationsPersist action) {
        /*EntityManager entityManager = BeanUtil.getBean(EntityManager.class);
        entityManager.persist(new FileHistory(target, action))*/;
    }
}