
package com.jamr.sgnomina2017business.repository.impl;

import com.jamr.sgnomina2017business.entity.Empleado;
import com.jamr.sgnomina2017business.repository.EmpleadoRepository;
import java.util.List;


public class EmpleadoRepositoryImpl implements EmpleadoRepository {

    @Override
    public void save(Empleado entity) {
        System.out.println("El Empleado "+entity.mostrarDatosOperador()+" se ha creado");
        
    }

    @Override
    public void update(Empleado entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empleado> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
