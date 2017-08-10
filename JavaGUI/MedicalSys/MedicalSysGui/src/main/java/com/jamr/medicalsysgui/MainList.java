
package com.jamr.medicalsysgui;

import com.jamr.medicalsysbusiness.entity.Medico;
import com.jamr.medicalsysbusiness.entity.Paciente;
import com.jamr.medicalsysbusiness.enums.RepositoryEnum;
import com.jamr.medicalsysbusiness.factory.ApplicationContext;
import com.jamr.medicalsysbusiness.repository.MedicoRepository;
import com.jamr.medicalsysbusiness.repository.PacienteRepository;
import java.util.Collections;


public class MainList {
    public static void main(String[] args) {
    
        
        PacienteRepository PacienteRepository = (PacienteRepository) ApplicationContext.getRepository(RepositoryEnum.PACIENTE_REPOSITORY);

        Paciente paciente1 = new Paciente();
        paciente1.setNombre("Pedro Alex");
        paciente1.setApellido("Ortiz");
        paciente1.setCedula("224-0101010-1");
        paciente1.setDireccion("Calle Las Palmas, Los Rios");
        paciente1.setTelefono("809-809-8009");
        paciente1.setCorreo("pedro.ortiz@sd.com");
        paciente1.setId(1001L);

        Paciente paciente2 = new Paciente();
        paciente2.setNombre("Luisa");
        paciente2.setApellido("Mercedes");
        paciente2.setCedula("001-0101010-1");
        paciente2.setDireccion("C/ 1ra, Los Rios");
        paciente2.setTelefono("809-551-5585");
        paciente2.setCorreo("luisamer@sdo.com");
        paciente2.setId(1002L);
        
        Paciente paciente3 = new Paciente();
        paciente3.setNombre("Luz");
        paciente3.setApellido("Perez");
        paciente3.setCedula("001-0101010-1");
        paciente3.setDireccion("C/ 2da, Los Rios");
        paciente3.setTelefono("809-885-5585");
        paciente3.setCorreo("lperez@sde.com");
        paciente3.setId(1003L);

        PacienteRepository.guardar(paciente1);
        PacienteRepository.guardar(paciente2);
        PacienteRepository.guardar(paciente3);


        Collections.sort(PacienteRepository.buscarTodo(), Paciente.NombresComparator);
        System.out.println(PacienteRepository.buscarTodo());

        Collections.sort(PacienteRepository.buscarTodo(), Paciente.ApellidosComparator);
        System.out.println(PacienteRepository.buscarTodo());

        
        MedicoRepository medicoRepository=(MedicoRepository) ApplicationContext.getRepository(RepositoryEnum.MEDICO_REPOSITORY);
        
        Medico medico1 = new Medico();
        medico1.setNombre("Alberto");
        medico1.setApellido("Martinez");
        medico1.setCedula("001-0035201-5");
        medico1.setId(001L);
        
        Medico medico2 = new Medico();
        medico2.setNombre("Juan");
        medico2.setApellido("Perez");
        medico2.setCedula("001-0035201-6");
        medico2.setId(002L);
        
        
        Medico medico3 = new Medico();
        medico3.setNombre("Carlos");
        medico3.setApellido("Hernandez");
        medico3.setCedula("001-0035201-7");
        medico3.setId(003L);
        
        
        medicoRepository.guardar(medico1);
        medicoRepository.guardar(medico2);
        medicoRepository.guardar(medico3);
        
        Medico medico0=medicoRepository.buscarporId(004L);
        medico0.setApellido("Ortega");
        medicoRepository.actualizar(medico0);
       
        System.out.println(medicoRepository.buscarTodo());
        
        Collections.sort(medicoRepository.buscarTodo());
        
        
    }
}
