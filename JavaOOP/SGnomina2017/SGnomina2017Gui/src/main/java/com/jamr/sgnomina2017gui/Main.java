
package com.jamr.sgnomina2017gui;

import com.jamr.sgnomina2017business.entity.Empleado;
import com.jamr.sgnomina2017business.enums.RepositoryEnum;
import com.jamr.sgnomina2017business.factory.ApplicationContext;
import com.jamr.sgnomina2017business.repository.EmpleadoRepository;


public class Main {
      
    public static void main(String[] agrs){
    
        
        Empleado empleado = new Empleado();
        empleado.setNombre("Ariel");
        empleado.setApellido("Mezquita");
        empleado.setCedula("101-0156512-4");      
        empleado.setCargo("Administrador");
        empleado.setDepartamento("Operaciones");
        empleado.setSueldo(20000);

        EmpleadoRepository empleadorepository =(EmpleadoRepository)
               ApplicationContext.getRepository(RepositoryEnum.EMPLEADO_REPOSITORY);
        empleadorepository.save(empleado);
        
    }
    
}
