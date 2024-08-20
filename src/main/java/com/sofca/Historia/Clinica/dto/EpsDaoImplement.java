package com.sofca.Historia.Clinica.dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

    public class EpsDaoImplement implements EpsI{
        @Override
        public List<EpsDto> listarEps() {
            List<EpsDto> eps = new ArrayList<>();
            EpsDto epsDto = new EpsDto();
            epsDto.setCodigoEps("01");
            epsDto.setNombre("EPS Salud Vida");
            epsDto.setDireccion("Calle 123");
            epsDto.setFechaRegistro("2024-08-19");
            epsDto.setTelefono("123456789");

            EpsDto eps2 = new EpsDto();
            eps2.setCodigoEps("002");
            eps2.setNombre("EPS Bienestar");
            eps2.setDireccion("Avenida Siempre Viva");
            eps2.setFechaRegistro("2024-08-19");
            eps2.setTelefono("987654321");

            EpsDto eps3 = new EpsDto();
            eps3.setCodigoEps("003");
            eps3.setNombre("EPS la mas");
            eps3.setDireccion("sahagun");
            eps3.setFechaRegistro("2024-08-19");
            eps3.setTelefono("3156658467");
            eps.add(eps3);
            eps.add(eps2);
            eps.add(epsDto);
            return eps;
        }

        @Override
        public EpsDto slectById(String id) {
            for (EpsDto eps : listarEps()){
                if (eps.getCodigoEps().equals(id)){
                    return eps;
                }
            }
            return  null;
        }

        @Override
        public boolean dleteEps(String id) {
            Iterator<EpsDto> iterator = listarEps().iterator();
            while (iterator.hasNext()){
                EpsDto eps = iterator.next();
                if (eps.getCodigoEps().equals(id)){
                    iterator.remove();
                    return true;
                }
            }
            return false;
        }


    }

