package com.sofca.Historia.Clinica.dao;

import org.example.dto.UserDto;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImplenta implements UserI{

    @Override
    public int Sumar() {
        int n = 5;
        int m = 25;
        return n + m;
    }

    @Override
    public List<UserDto> lista() {
        List<UserDto> usuarios = new ArrayList<>();
        UserDto userDto= new UserDto();
        return usuarios;
}
}
