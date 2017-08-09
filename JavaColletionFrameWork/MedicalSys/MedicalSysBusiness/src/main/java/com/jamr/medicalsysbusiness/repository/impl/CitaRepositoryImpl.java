
package com.jamr.medicalsysbusiness.repository.impl;

import com.jamr.medicalsysbusiness.entity.Cita;
import com.jamr.medicalsysbusiness.repository.CitaRepository;
import java.util.ArrayList;
import java.util.List;


public class CitaRepositoryImpl implements CitaRepository {
    
    private List<Cita> citaList = new ArrayList();
    
    @Override
    public void guardar(Cita entity) {
        citaList.add(entity);
    }

    @Override
    public void actualizar(Cita entity) {
        int index = citaList.indexOf(entity);
        citaList.set(index, entity);
    }

    @Override
    public Cita buscarporId(Long id) {
        return citaList.get(id.intValue());
    }

    @Override
    public List<Cita> buscarTodo() {
        return citaList;
    }

}
