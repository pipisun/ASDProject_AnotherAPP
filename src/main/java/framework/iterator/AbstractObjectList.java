package framework.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yf_zh on 2017/08/08.
 */
public abstract class AbstractObjectList {
    protected List<Object> objects = new ArrayList<Object>();

    public AbstractObjectList(List objects) {
        this.objects = objects;
    }

    public void addObject(Object obj) {
        this.objects.add(obj);
    }

    public void removeObject(Object obj) {
        this.objects.remove(obj);
    }

    public List getObjects() {
        return this.objects;
    }

    public abstract AbstractIterator createIterator();
}
