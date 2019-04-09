package rocks.zipcode.io.quiz4.collections;

import rocks.zipcode.io.quiz4.objectorientation.StringAssembler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {

    private List<String> stringHandler;

    public SimpleStringGroup() {

        List<String> stringHandler = new ArrayList<>();
    }

    public Integer count() {

        return stringHandler.size();
    }

    public void insert(String string) {

        stringHandler.add(string);
    }

    public Boolean has(String string) {

        return stringHandler.contains(string);
    }

    public String fetch(int indexOfValue) {

        return stringHandler.get(indexOfValue);
    }

    public void delete(String string) {

        stringHandler.remove(string);
    }

    public void clear() {

        this.stringHandler.clear();
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
