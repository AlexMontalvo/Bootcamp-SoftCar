package com.sofca.Historia.Clinica.business;

import org.example.dto.UserDto;
import org.example.manager.UserManager;

public class UserBusiness {
    private UserManager userManager;

    public UserBusiness(){
        UserManager userManager = new UserManager();

    }
    public void registrar(UserDto userDto){
        if ( userDto != null){
            userManager.Registrar(userDto);
        }
    }
}
