package Java_4_ArrayList;

public class ArrayLIst {

    int[] array;
    int size, maxSize;

    public ArrayLIst(int maxSize) {
        maxSize = maxSize;
        size = 0;
        array = new int[maxSize];
    }

    public void add(int value) {
        if (size < maxSize) {
            array[size] = value;
            size++;
        }
    }

    public int find(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int value) {
        int index = find(value);
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

}
