package com.sofca.Historia.Clinica.manager;

import com.sofca.Historia.Clinica.dto.UserDto;

public class UserManager {
    public void Registrar(UserDto userDto)
        {
            System.out.println("" + userDto.getNombre());
        }
}
