package MyList;

public interface List {
    boolean isEmpty();

    void add(String item);

    int size();

    void remove(String item);

    String get(int index);

    int capacity();

    void print();
}
