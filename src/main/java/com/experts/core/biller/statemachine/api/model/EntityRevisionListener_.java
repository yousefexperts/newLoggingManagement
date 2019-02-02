package com.experts.core.biller.statemachine.api.model;

import com.experts.core.biller.statemachine.api.model.domain.jpa.CustomTrackingEntity;
import org.hibernate.SessionFactory;
import org.hibernate.envers.RevisionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Auditable;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.annotation.Resource;
import java.io.Serializable;

public class EntityRevisionListener_ implements org.hibernate.envers.EntityTrackingRevisionListener {
    @Resource
    private org.hibernate.engine.spi.PersistenceContext persistenceManagerHibernate;

    @Autowired
    private SessionFactory sessionFactory;

    public void newRevision(Object revisionEntity) {
        CustomTrackingEntity revision = (CustomTrackingEntity) revisionEntity;
        revision.setUsername(getUsername());
    }


    public String getUsername() {
        final SecurityContext context = SecurityContextHolder.getContext();
        if (context != null) {
            if (context.getAuthentication() != null) {
                return context.getAuthentication().getName();
            } else {
                return "anonymous";
            }
        }
        return "anonymous";
    }

    @Override
    public void entityChanged(@SuppressWarnings("rawtypes") Class entityClass, String entityName, Serializable entityId, RevisionType revisionType, Object revisionEntity) {
        CustomTrackingEntity revision = (CustomTrackingEntity) revisionEntity;
        revision.setId(revision.getCustomId());
        revision.setEntityName(((CustomTrackingEntity) revisionEntity).getEntityName());
        Auditable auditable = null;
       // persistenceManagerHibernate.getSession().accessTransaction().begin();
        sessionFactory.openSession().persist(revision);
        sessionFactory.close();


    }
}