package MyStack;

import MyList.ArrayList;

import java.util.EmptyStackException;
import java.util.Objects;

public class Stack {
    private boolean isInList = true;
    private boolean isEmpty = true;

    ArrayList stack = new ArrayList();

    public boolean isEmpty() {
        return isEmpty;
    }

    public void push(String item) {
        stack.add(item);
    }

    public int size() {
        return stack.size();
    }

    public void pop(String item) {
        stack.remove(item);
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
    }


    public String peek() {
        return stack.get(size() - 1);
    }

    public boolean search(int item) {
        for(int i = 0; i < stack.size(); i++){
            if(Objects.equals(stack.get(i),item)){
                return isInList;
               // break;
            }else isInList = false;
        }
        return isInList;
    }
}