package util.framework;

public interface IFactory<T,R> {
	public R create(T dto);
}
