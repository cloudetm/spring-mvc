package framework.dao.jpa.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FindRepository<T, ID extends Serializable> extends JpaRepository<T, ID>{

	public List<T> findAll();
	
	public T findOne(ID id);
	
	public List<T> findAll(Sort sort);
}
