package com.sofca.Historia.Clinica.manager;

import org.example.dto.UserDto;

public class UserManager {
    public void Registrar(UserDto userDto)
        {
            System.out.println("" + userDto.getNombre());
        }
}
