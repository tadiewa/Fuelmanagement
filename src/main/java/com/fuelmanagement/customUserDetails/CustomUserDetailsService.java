package com.fuelmanagement.customUserDetails;

import com.fuelmanagement.Repository.UserRepository;
import com.fuelmanagement.domain.UserAccounts;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService /*implements UserDetailsService */{
  /*  @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserAccounts user =  userRepository.findByuserName(username);
        if(user == null){
            throw  new UsernameNotFoundException("user not found");
        }
        return new CustomUserDetails(user);
    }*/


}
