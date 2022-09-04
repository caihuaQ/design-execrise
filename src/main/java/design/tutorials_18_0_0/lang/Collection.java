package design.tutorials_18_0_0.lang;

public interface Collection<E, T> extends Iterable {

    boolean add(E e);

    boolean remove(E e);

    boolean addLink(String key, T t);

    boolean removeLink(String key);

    Iterator<E> iterator();

}
