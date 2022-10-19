package com.fuelmanagement.convertor;

import com.fuelmanagement.Dto.UserDto;
import com.fuelmanagement.domain.UserAccounts;
import org.springframework.stereotype.Component;

@Component
public class User {
    public UserAccounts getUSerFromUserDto(UserDto userDto){

        UserAccounts userAccounts = new UserAccounts();
        userAccounts.setUserName(userDto.getUserName());
        userAccounts.setSurName(userDto.getSurName());
        userAccounts.setNcNumber(userDto.getNcNumber());
        userAccounts.setAccessLevel(userDto.getAccessLevel());
        return userAccounts;
    }


    public UserDto getUserDtoFromUser(UserAccounts userAccounts){
        UserDto  userDto = new UserDto();
        userDto.setUserName(userAccounts.getUserName());
        userDto.setSurName(userAccounts.getSurName());
        userDto.setNcNumber(userAccounts.getNcNumber());
        userDto.setAccessLevel(userAccounts.getAccessLevel());
        return userDto;
    }
}
