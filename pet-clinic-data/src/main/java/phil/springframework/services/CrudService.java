package phil.springframework.services;

import java.util.Set;

public interface CrudService <T, ID> {
    Set<T> findAll();
    void delete(T object);
    void deleteById(ID id);
}
