package framework.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();
	
	public void add(Memento state) {
		mementoList.add(state);
	}
	
	public Memento get(int index) {
		Memento memento = mementoList.get(index);
		mementoList.remove(index);
		return memento;
	}
	public Memento getLast() {
		if (mementoList.isEmpty()) return null;
		return get(mementoList.size()-1);
	}
}
