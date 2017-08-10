
package com.jamr.medicalsysbusiness.repository.impl;


import com.jamr.medicalsysbusiness.entity.Expediente;
import com.jamr.medicalsysbusiness.repository.ExpedienteRepository;
import java.util.ArrayList;
import java.util.List;


public class ExpedienteRepositoryImpl implements ExpedienteRepository{

    private List<Expediente> expedienteList = new ArrayList();
    
    @Override
    public void guardar(Expediente entity) {
        expedienteList.add(entity);
    }

    @Override
    public void actualizar(Expediente entity) {
        int index = expedienteList.indexOf(entity);
        expedienteList.set(index, entity);
    }

    @Override
    public Expediente buscarporId(Long id) {
        return expedienteList.get(id.intValue());
    }

    @Override
    public List<Expediente> buscarTodo() {
        return expedienteList;
    }
    
}
