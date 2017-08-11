package framework.Facade;



public interface DataAccess<T> {
	public boolean saveData(T t, String idPath);
	public T readUser(Integer id);

}
