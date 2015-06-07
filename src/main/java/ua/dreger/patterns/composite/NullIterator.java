package ua.dreger.patterns.composite;

import java.util.Iterator;

/**
 * Created by Sergey on 07.06.2015.
 */
public class NullIterator implements Iterator {
    public Object next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
