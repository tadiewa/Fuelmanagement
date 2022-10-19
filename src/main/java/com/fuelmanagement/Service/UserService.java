package com.fuelmanagement.Service;

import com.fuelmanagement.Dto.UserDto;
import org.springframework.stereotype.Service;

public interface UserService {

   public UserDto saveUser(UserDto userDto);
}
