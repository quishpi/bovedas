package ec.bovedas.models.daos;

import java.util.List;

public interface GenericDao<T, ID> {

	public void create(T entity);

	public void update(T entity);

	public void delete(T entity);

	public void flush();

	public T find(ID id);

	public List<T> findAll();

	public List<T> findRange(int[] range);

	public Integer count();

}
