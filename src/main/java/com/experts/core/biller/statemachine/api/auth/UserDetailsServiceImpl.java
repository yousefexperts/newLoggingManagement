package com.experts.core.biller.statemachine.api.auth;

import com.experts.core.biller.statemachine.api.model.domain.jpa.Users;
import com.experts.core.biller.statemachine.api.repo.UserDetailsRepo;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service("userDetailsService")
@Component("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserDetailsRepo userDetailsRepo;

    public UserDetailsServiceImpl(UserDetailsRepo userDetailsRepo) {
        this.userDetailsRepo = userDetailsRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userDetailsRepo.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new User(user.getUsernameToken(), user.getPasswordToken(), emptyList());
    }
}