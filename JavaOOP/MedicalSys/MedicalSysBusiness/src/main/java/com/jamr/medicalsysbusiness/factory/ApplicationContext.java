
package com.jamr.medicalsysbusiness.factory;

import com.jamr.medicalsysbusiness.enums.RepositoryEnum;
import com.jamr.medicalsysbusiness.repository.Repository;
import com.jamr.medicalsysbusiness.repository.impl.CitaRepositoryImpl;
import com.jamr.medicalsysbusiness.repository.impl.DiagnosticoRepositoryImpl;
import com.jamr.medicalsysbusiness.repository.impl.EspecialidadRepositoryImpl;
import com.jamr.medicalsysbusiness.repository.impl.ExpedienteRepositoryImpl;
import com.jamr.medicalsysbusiness.repository.impl.MedicoRepositoryImpl;
import com.jamr.medicalsysbusiness.repository.impl.PacienteRepositoryImpl;
import com.jamr.medicalsysbusiness.repository.impl.ProcedimientoRepositoryImpl;


public class ApplicationContext {
    
    public static Repository getRepository(RepositoryEnum repositoryEnum){
        
        switch(repositoryEnum){
            case MEDICO_REPOSITORY:
                return new MedicoRepositoryImpl();
            case PACIENTE_REPOSITORY:
                return new PacienteRepositoryImpl();
            case CITA_REPOSITORY:
                return new CitaRepositoryImpl();
            case DIAGNOSTICO_REPOSITORY:
                return new DiagnosticoRepositoryImpl();
            case EXPEDIENTE_REPOSITORY:
                return new ExpedienteRepositoryImpl();
            case PROCEDIMIENTO_REPOSITORY:
                return new ProcedimientoRepositoryImpl();
            case ESPECIALIDAD_REPOSITORY:
                return new EspecialidadRepositoryImpl();
            default:
                return null;     
        }
    
    }
    
}
