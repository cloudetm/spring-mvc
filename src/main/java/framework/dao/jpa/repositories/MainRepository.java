package framework.dao.jpa.repositories;

import java.io.Serializable;

public interface MainRepository<T,ID extends Serializable> extends CrudBaseRepository<T, ID>,
FindRepository<T, ID> , PaginationRepository<T,ID> , QueryRepository<T, ID>  {

}
