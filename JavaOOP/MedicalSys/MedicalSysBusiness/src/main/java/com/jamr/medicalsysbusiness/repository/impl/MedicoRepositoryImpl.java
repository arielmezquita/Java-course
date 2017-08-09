
package com.jamr.medicalsysbusiness.repository.impl;

import com.jamr.medicalsysbusiness.entity.Medico;
import com.jamr.medicalsysbusiness.repository.MedicoRepository;
import java.util.ArrayList;
import java.util.List;

public class MedicoRepositoryImpl implements MedicoRepository {

    private List<Medico> medicoList = new ArrayList();
    
    @Override
    public void guardar(Medico entity) {
        medicoList.add(entity);
    }

    @Override
    public void actualizar(Medico entity) {
        int index = medicoList.indexOf(entity);
        medicoList.set(index, entity);
    }

    @Override
    public Medico buscarporId(Long id) {
        return medicoList.get(id.intValue());
    }

    @Override
    public List<Medico> buscarTodo() {
        return medicoList;
    }


    
}
