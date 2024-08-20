package com.sofca.Historia.Clinica;

import com.sofca.Historia.Clinica.business.UserBusiness;
import com.sofca.Historia.Clinica.dao.*;
import com.sofca.Historia.Clinica.dto.EpsDto;
import com.sofca.Historia.Clinica.dto.UserDto;
import com.sofca.Historia.Clinica.manager.UserManager;
import com.sofca.Historia.Clinica.managerbd.PoolDb;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
               /* EpsI epsI = (EpsI) new EpsDaoImplement();
                List<EpsDto> epsList = epsI.listarEps();
                String idAEliminar = "01";
                boolean eliminado = epsI.dleteEps(idAEliminar);
                // for (EpsDto eps : epsList) {
                // System.out.println("ID: " + eps.getId_eps() + ", Nombre: " + eps.getNombre());
                // }
                if (eliminado) {
                    System.out.println("El EPS con ID: " + idAEliminar + " ha sido eliminado.");
                } else {
                    System.out.println("No se encontró un EPS con el ID: " + idAEliminar);
                }*/
                // for (EpsDto eps : epsList) {
                //   System.out.println("ID: " + eps.getId_eps() + ", Nombre: " + eps.getNombre());
                //}
                // for (EpsDto epsDto : epsList){
                //   System.out.println("ID: " + epsDto.getId_eps());
                //System.out.println("Nombre: " + epsDto.getNombre());
                // System.out.println("Dirección: " + epsDto.getDireccion());
                //  System.out.println("Fecha: " + epsDto.getFecha());
                //  System.out.println("Teléfono: " + epsDto.getTelefono());
                //  System.out.println("---------------------------------");
                //}
                //JOptionPane.showMessageDialog(null,epsI.listarEps().get(1).getNombre());
                // String ideps = "01";
                // EpsDto eps_encontrada = epsI.slectById(ideps);
                // if (eps_encontrada != null){
                //   System.out.println("----------------------------");
                // System.out.println("ID_eps:"+ eps_encontrada.getId_eps());
                //System.out.println("Nombre_Eps:"+ eps_encontrada.getNombre());
                //System.out.println("Direccion_Eps:"+ eps_encontrada.getDireccion());
                //System.out.println("Fecha_ingreso:"+ eps_encontrada.getFecha());
                //System.out.println("Telefono_contacto:"+ eps_encontrada.getTelefono());
                //System.out.println("----------------------------");
            }


        }





        /*UserI userI= new UserDaoImplementa();
        System.out.println(userI.Sumar());
        UserI userI1 = new UserDaoImpl();
        System.out.println(userI1.Sumar());*/

       // try{

          //  Class<?> clazz = Class.forName("interfazexample.OctaDado");
            //Idado dado1 = (Idado)clazz.getDeclaredConstructor().newInstance();


            //System.out.println(dado1.caer());
        //}catch (Exception ex){
          //  ex.printStackTrace();
        //}






        /*lDb poolDb = PoolDb.getInstance();
        poolDb.createConections();
        System.out.println(poolDb.getConexion().getConnection());
        System.out.println(poolDb.getConexion().getConnection());
        poolDb.getConexion().FreeConexion();
       System.out.println(poolDb.getConexion().getConnection());
        UserBusiness userBusiness = new UserBusiness();
        UserDto userDto = new UserDto();
        userDto.setNombre("Juanito Tibilin");
        System.out.println(userDto.getNombre());*/


