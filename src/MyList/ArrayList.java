package MyList;

import java.util.Objects;

public class ArrayList implements List {
    private int size;
    private int capacity =5;
    private String[] element = new String[capacity];


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String item) {
        capacityCheck();
        element[size] = item;
        size++;
    }

    private void capacityCheck(){
        if(size == capacity){
            String[] newArray = new String[capacity*=2];
            System.arraycopy(element,0, newArray, 0, element.length);
            element = newArray;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(String item) {
        reArrange(item);
        size--;
    }

    private void reArrange(String item) {
        String[] tempArray = new String[element.length];
        int i = 0;
        for(String string : element){
            if(!Objects.equals(string, item)){
                tempArray[i] = string;
                i++;
            }
        }
        element = tempArray;
    }

    @Override
    public String get(int index) {
        return element[index];

    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public void print() {

    }
}
