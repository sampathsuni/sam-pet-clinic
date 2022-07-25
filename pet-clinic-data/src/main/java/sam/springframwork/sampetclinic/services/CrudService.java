package sam.springframwork.sampetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
    T findById(ID id);
    T save(T Object);
    void delete(T Object);
    void deleteById(ID id);
    Set<T> findAll();
}
