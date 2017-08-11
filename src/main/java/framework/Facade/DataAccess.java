package framework.Facade;


import java.util.List;

public interface DataAccess<T> {
	public boolean saveData(T t, String idPath);
	public T readData(Integer id);
	public List<T> readAll();

}
