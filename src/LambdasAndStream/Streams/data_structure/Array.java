package LambdasAndStream.Streams.data_structure;

public class Array {
    private int[] items;
    private int count;

    private int selectedItem;
    public Array(int length){
        items = new int[length];

    }
    public void insert(int item){
        if(items.length == count){
            int[] newItems = new int [count * 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }
        items[count] = item;
        count++;
    }

    public void removeAt(int index){
        for (int i = 0; i < count; i++) {
            if(items[i] != index){
                System.out.println("not found");
            }

        }
    }


    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

}
