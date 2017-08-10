
package com.jamr.medicalsysbusiness.repository.impl;

import com.jamr.medicalsysbusiness.entity.Diagnostico;
import com.jamr.medicalsysbusiness.repository.DiagnosticoRepository;
import java.util.ArrayList;
import java.util.List;

public class DiagnosticoRepositoryImpl implements DiagnosticoRepository {

    private List<Diagnostico> diagnosticoList = new ArrayList();
    
    
    @Override
    public void guardar(Diagnostico entity) {
        diagnosticoList.add(entity);
    }

    @Override
    public void actualizar(Diagnostico entity) {
        int index = diagnosticoList.indexOf(entity);
        diagnosticoList.set(index, entity);
    }

    @Override
    public Diagnostico buscarporId(Long id) {
        return diagnosticoList.get(id.intValue());
    }

    @Override
    public List<Diagnostico> buscarTodo() {
        return diagnosticoList;
    }


}
