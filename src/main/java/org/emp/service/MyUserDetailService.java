package org.emp.service;

import org.emp.dto.User;
import org.emp.entity.UserEntity;
import org.emp.model.UserPrinciple;
import org.emp.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private ModelMapper mapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = mapper.map(repository.findByUsername(username), User.class);
        if (user==null){
            throw new UsernameNotFoundException("User Not Found !!");
        }
        return new UserPrinciple(user);
    }
}
