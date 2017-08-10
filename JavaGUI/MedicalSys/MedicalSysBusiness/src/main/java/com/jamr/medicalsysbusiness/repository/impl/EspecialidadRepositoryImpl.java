
package com.jamr.medicalsysbusiness.repository.impl;

import com.jamr.medicalsysbusiness.entity.Especialidad;
import com.jamr.medicalsysbusiness.repository.EspecialidadRepository;
import java.util.ArrayList;
import java.util.List;


public class EspecialidadRepositoryImpl implements EspecialidadRepository {

    private List<Especialidad> especialidadList = new ArrayList();
    
    
    @Override
    public void guardar(Especialidad entity) {
        especialidadList.add(entity);
    }

    @Override
    public void actualizar(Especialidad entity) {
        int index = especialidadList.indexOf(entity);
        especialidadList.set(index, entity);
    }

    @Override
    public Especialidad buscarporId(Long id) {
        return especialidadList.get(id.intValue());
    }

    @Override
    public List<Especialidad> buscarTodo() {
        return especialidadList;
    }
}
