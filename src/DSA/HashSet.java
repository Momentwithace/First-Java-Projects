package DSA;

import MyList.ArrayList;

import java.util.Objects;

public class HashSet implements Set {
    private int size = 0;
    private boolean isInList;

    private boolean isEmpty = true;

    private ArrayList hashSet = new ArrayList();

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public void add(String item) {
        hashSet.add(item);
        isEmpty = false;
        size++;
    }

    @Override
    public void remove(String item) {
        hashSet.remove(item);
        isEmpty = true;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean itContain(String item) {
        for(int i = 0; i < hashSet.size(); i++){
            if(Objects.equals(hashSet.get(i),item)){
                isInList = true;
                break;
            }else isInList = false;
        }
        return isInList;
    }


}
