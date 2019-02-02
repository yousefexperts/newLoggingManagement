package com.experts.core.biller.statemachine.api.model;

import com.google.common.base.MoreObjects;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;


@Entity(name = "GrantedAuthority")
@Table(name = "authorities")
public class PersistentGrantedAuthority implements GrantedAuthority {


    private static final long                 serialVersionUID = 8513041662486312372L;


    @Column(name = "authority", nullable = false, unique = true)
    private String                            authority;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long                              id;


    @ManyToMany(mappedBy = "authorities")
    private Collection<PersistentUserDetails> users;


    public PersistentGrantedAuthority() {
        super();
    }

    @Override
    public final boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final PersistentGrantedAuthority other = (PersistentGrantedAuthority) obj;
        return Objects.equals(authority, other.authority);
    }

    @Override
    public String getAuthority() {
        return authority;
    }


    public Long getId() {
        return id;
    }


    public Collection<PersistentUserDetails> getUsers() {
        return users;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(authority);
    }


    public void setAuthority(final String auth) {
        authority = auth;
    }


    public void setId(final Long identifier) {
        id = identifier;
    }


    public void setUsers(final Collection<PersistentUserDetails> users) {
        this.users = users;
    }

    @Override
    public final String toString() {
        return MoreObjects.toStringHelper(this).add("authority", authority)
                .toString();
    }

}
