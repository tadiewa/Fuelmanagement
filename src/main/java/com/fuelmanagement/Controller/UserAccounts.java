package com.fuelmanagement.Controller;


import com.fuelmanagement.Dto.UserDto;
import com.fuelmanagement.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fuel-management")
@Slf4j
public class UserAccounts {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }


}
