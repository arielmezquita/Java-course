
package com.jamr.medicalsysgui;

import com.jamr.medicalsysbusiness.entity.Paciente;
import com.jamr.medicalsysbusiness.enums.RepositoryEnum;
import com.jamr.medicalsysbusiness.factory.ApplicationContext;
import com.jamr.medicalsysbusiness.repository.PacienteRepository;
import java.util.Set;
import java.util.TreeSet;


public class MainSet {
    public static void main(String[] args) {
        
        PacienteRepository pacienteRepository=(PacienteRepository) ApplicationContext.getRepository(RepositoryEnum.PACIENTE_REPOSITORY);
        
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
        
        
        pacienteRepository.guardar(paciente1);
        pacienteRepository.guardar(paciente2);
        pacienteRepository.guardar(paciente3);

        Set<Paciente> pacienteSet= new TreeSet<>();
        pacienteSet.add(paciente1);
        pacienteSet.add(paciente2);
        pacienteSet.add(paciente3);
        
        System.out.println(pacienteSet);
        System.out.println(paciente2.equals(paciente3));
    }
 
}
