
package com.jamr.medicalsysbusiness.repository.impl;

import com.jamr.medicalsysbusiness.entity.Paciente;
import com.jamr.medicalsysbusiness.repository.PacienteRepository;
import java.util.ArrayList;
import java.util.List;

public class PacienteRepositoryImpl implements PacienteRepository {

    private List<Paciente> pacienteList = new ArrayList();
    
    @Override
    public void guardar(Paciente entity) {
        pacienteList.add(entity);
    }

    @Override
    public void actualizar(Paciente entity) {
        int index = pacienteList.indexOf(entity);
        pacienteList.set(index, entity);
    }

    @Override
    public Paciente buscarporId(Long id) {
        return pacienteList.get(id.intValue());
    }

    @Override
    public List<Paciente> buscarTodo() {
        return pacienteList;
    }


    
}
