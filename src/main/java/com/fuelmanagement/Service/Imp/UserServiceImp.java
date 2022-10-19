package com.fuelmanagement.Service.Imp;

import com.fuelmanagement.Dto.UserDto;
import com.fuelmanagement.Repository.UserRepository;
import com.fuelmanagement.Service.UserService;
import com.fuelmanagement.convertor.User;
import com.fuelmanagement.domain.UserAccounts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImp implements UserService {
    @Autowired
     public UserRepository userRepository;
    @Override
    public UserDto saveUser(UserDto userDto) {
        User user = new User();
        UserAccounts userAccounts  = user.getUSerFromUserDto(userDto);
        userRepository.save(userAccounts);
        return userDto;
    }
}
