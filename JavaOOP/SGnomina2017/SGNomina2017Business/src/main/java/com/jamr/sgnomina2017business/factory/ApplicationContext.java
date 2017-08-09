
package com.jamr.sgnomina2017business.factory;

import com.jamr.sgnomina2017business.enums.RepositoryEnum;
import com.jamr.sgnomina2017business.repository.Repository;
import com.jamr.sgnomina2017business.repository.impl.EmpleadoRepositoryImpl;


public class ApplicationContext {
    
    public static Repository getRepository(RepositoryEnum repositoryEnum){

        switch(repositoryEnum){
        case EMPLEADO_REPOSITORY:
            return new EmpleadoRepositoryImpl();
        case DEPARTAMENTO_REPOSITORY:
            return null;
        default:
            return null;
            }
    }
}
