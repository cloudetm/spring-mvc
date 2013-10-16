/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.dao.jpa;

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;

/**
 *
 * @author deepshah
 */
public interface AbstractGenericDao<T, ID extends Serializable> {
   
	/* Entity Exist's or Not Methods --------------- ---------------- */
    boolean isExist(Long id);
    
    /* Insert Methods --------------- ---------------- */
    T insertEntity(T entity);
    
//    List<T> insertSomeEntities(List<T> list) throws DataAccessException;

    /* Update Methods --------------- ---------------- */
    T updateEntity(T entity);
    
    /* DeleteMethods --------------- ---------------- */
    void deleteById(Long id);
    
    void deleteByEntity(T entity);

    void clearTable();
    
    /* Find Methods --------------- ---------------- */
    T findOneById(Object id);

	List<T> findByNamedQuery(String name, Object[] params);

	List<T> findAll() throws DataAccessException;

	          
//    E findOneByCriteria(Criteria searchCriteria);
    
//    List<E> findSomeByCriteria(Criteria searchCriteria);

}
