package framework.dao.jpa;

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.NoRepositoryBean;

import framework.dao.jpa.repositories.MainRepository;

@NoRepositoryBean
public interface MyAbstractDao<T, ID extends Serializable> extends MainRepository<T, ID>{

}
