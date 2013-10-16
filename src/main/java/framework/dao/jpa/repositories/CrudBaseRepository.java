package framework.dao.jpa.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface CrudBaseRepository<T, ID extends Serializable> extends
		JpaRepository<T, ID> {

	public List<T> save(Iterable<? extends T> entities);

	public T save(T entity);

	public void delete(ID id);

	public void delete(Iterable<? extends T> entities);

	public void delete(T entity);

	public void deleteAll();
	
	
}