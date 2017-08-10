
package com.jamr.medicalsysbusiness.repository.impl;

import com.jamr.medicalsysbusiness.entity.Procedimiento;
import com.jamr.medicalsysbusiness.repository.ProcedimientoRepository;
import java.util.ArrayList;
import java.util.List;

public class ProcedimientoRepositoryImpl implements ProcedimientoRepository {

    private List<Procedimiento> procedimientoList = new ArrayList();
    
    @Override
    public void guardar(Procedimiento entity) {
        procedimientoList.add(entity);
    }

    @Override
    public void actualizar(Procedimiento entity) {
        int index = procedimientoList.indexOf(entity);
        procedimientoList.set(index, entity);
        
    }

    @Override
    public Procedimiento buscarporId(Long id) {
        return procedimientoList.get(id.intValue());
    }

    @Override
    public List<Procedimiento> buscarTodo() {
        return procedimientoList;
    }
    
}
