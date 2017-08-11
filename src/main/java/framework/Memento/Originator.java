package framework.Memento;

public class Originator<T> {
	T state;

	public T getState() {
		return state;
	}

	public void setState(T state) {
		this.state = state;
	}
	public Memento saveStateToMemenTo() {
		return new Memento(state);
	}
	public Object getStateFromMemnto(Memento memento) {
		if (memento != null) {
			return memento.getState();
		}
		return null;
		
	}
}
