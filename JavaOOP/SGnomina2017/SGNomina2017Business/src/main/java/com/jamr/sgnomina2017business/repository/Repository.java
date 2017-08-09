
package com.jamr.sgnomina2017business.repository;

import java.util.List;

public interface Repository<T, ID> {
        void save(T entity);
        void update(T entity);
        T findById(ID id);
        List<T> findAll();
}
