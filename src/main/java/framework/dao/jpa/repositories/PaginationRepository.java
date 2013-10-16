package framework.dao.jpa.repositories;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaginationRepository<T, ID extends Serializable> extends
		JpaRepository<T, ID> {

	public Page<T> findAll(Pageable pageable);
	
}
