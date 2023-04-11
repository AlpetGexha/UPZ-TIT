package Kollofjumi_1;

import java.util.Arrays;

public class ArrayList {

    int[] v;
    int size;
    int maxSize;

    public ArrayList() {
        maxSize = 8;
        v = new int[maxSize];
        size = 0;
//      v = new
    }

    public void addLast(int value) {

        if (size == maxSize) increaseArray();

        v[size] = value;
        size++;
    }

    public void increaseArray() {
        maxSize *= 2;
        v = Arrays.copyOf(v, maxSize);
    }


    //    add fisrt
//    add middle
//    add last
    public void add(int value, int atIndex) {
        if (atIndex < 0 || value >= size) {
            return;
        }

        if (size == maxSize) {
            increaseArray();
        }

        for (int i = size; i > atIndex; i--) {
            v[i] = v[i - 1];
        }

        v[atIndex] = value;
        size++;
    }


    public void addF(int value) {
        add(value, 0);
    }

    public void addL(int value) {
        add(value, size);
    }

    public void addM(int value) {
        add(value, size / 2);
    }


    public void addFirst(int value) {

        if (maxSize == size) increaseArray();

        for (int i = size; i > 0; i--) {
            v[i] = v[i - 1];
        }

        v[0] = value;
        size++;
    }


    public void removeFirst(int index) {
        if (size == 0) {
            System.out.println("Vargu bosh");
            return;
        }

        for (int i = 0; i < size - 1; i++) {
            v[i] = v[i + 1];
        }

        size--;
    }


    public void removeOf(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Vargu eshte bosh");
        }
    }

}