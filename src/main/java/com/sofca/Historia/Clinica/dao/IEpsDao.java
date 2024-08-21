package com.sofca.Historia.Clinica.dao;

import org.example.dto.EpsDto;

import java.util.List;

public interface EpsI {

        public List<EpsDto> listarEps();
        public EpsDto slectById(String id);
        public boolean dleteEps(String id);
    }


