package framework.dao.jpa;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import framework.dao.jpa.impl.MyAbstractDaoImpl;


public class MyRepositoryFactoryBean<R extends JpaRepository<T, I>, T, I extends Serializable>
extends JpaRepositoryFactoryBean<R, T, I> {

protected RepositoryFactorySupport createRepositoryFactory(EntityManager entityManager) {

  return new MyRepositoryFactory(entityManager);
}

private static class MyRepositoryFactory<T, I extends Serializable> extends JpaRepositoryFactory {

  private EntityManager entityManager;

  public MyRepositoryFactory(EntityManager entityManager) {
    super(entityManager);

    this.entityManager = entityManager;
  }

  protected Object getTargetRepository(RepositoryMetadata metadata) {

    return new MyAbstractDaoImpl<T, I>((Class<T>) metadata.getDomainClass(), entityManager);
  }

  protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {

    // The RepositoryMetadata can be safely ignored, it is used by the JpaRepositoryFactory
    //to check for QueryDslJpaRepository's which is out of scope.
    return MyAbstractDao.class;
  }
}
}