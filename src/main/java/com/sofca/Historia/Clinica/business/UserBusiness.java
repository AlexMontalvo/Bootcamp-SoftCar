package com.sofca.Historia.Clinica.business;

import com.sofca.Historia.Clinica.dto.UserDto;
import com.sofca.Historia.Clinica.manager.UserManager;

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
