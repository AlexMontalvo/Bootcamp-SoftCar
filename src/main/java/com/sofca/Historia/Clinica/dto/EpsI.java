package com.sofca.Historia.Clinica.dto;

import java.util.List;

public interface EpsI {

        public List<EpsDto> listarEps();
        public EpsDto slectById(String id);
        public boolean dleteEps(String id);
    }


