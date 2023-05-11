// Made on Home

package Java_4_ArrayList;

import java.util.Arrays;

public class ArrayList2 {


    /**
     * Konstanta që tregon madhësinë fillestare të array
     */
    private final int DEFAULT_SIZE = 8;

    /**
     * Array ku mbajmë elementet e ArrayList
     */
    private int[] array;

    /**
     * Madhësia aktuale e array
     */
    private int size;

    /**
     * Madhësia maksimale e array
     */
    private int maxSize;


    /**
     * Konstruktori i ArrayList, inicializon madhësinë maksimale me DEFAULT_SIZE,
     * madhësinë aktuale me 0 dhe krijon array-in me DEFAULT_SIZE elemente.
     */
    public ArrayList2() {
        maxSize = DEFAULT_SIZE;
        size = 0;
        array = new int[maxSize];
    }


    /**
     * Shton një element në fund të array.
     *
     * @param value vlera që do të shtohet në array
     */
    public void add(int value) {
        inereaseSize();
        if (size < maxSize) {
            array[size] = value;
            size++;
        }
    }

    /**
     * Shton një element në një pozitë të caktuar të array.
     *
     * @param value   vlera që do të shtohet në array
     * @param onIndex pozita në të cilën do të shtohet vlera
     */
    public void add(int value, int onIndex) {
        inereaseSize();
//        check index
        if (onIndex < 0 || onIndex > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        for (int i = size; i > onIndex; i--) {
            array[i] = array[i - 1];
        }
        array[onIndex] = value;
        size++;

    }

    /**
     * Fshin një element nga array.
     *
     * @param value vlera që do të fshihet nga array
     */
    public void remove(int value) {
        checkIfIsEmpty();
        decreaseSize();

        int index = find(value);
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }


    /**
     * Fshirja e të gjithë elementeve në array
     */

    public void removeAll() {
        size = 0;
        maxSize = DEFAULT_SIZE;
        array = new int[maxSize];
    }


    /**
     * Fshirja e elementit te parë
     */
    public void shift() {
        remove(0);
    }


    public int find(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * E rrit madhësinë e array.
     *
     * @return new array me 2 herë madhësinë me te madhe se array i vjetër
     */
    private void inereaseSize() {
        if (size >= maxSize) {
            maxSize *= 2;
            array = Arrays.copyOf(array, maxSize);
        }
    }

    /**
     * E zvogëlon madhësinë e array.
     *
     * @return new array me 2 herë madhësinë me te vogël se e vjetra
     */
    private void decreaseSize() {
        if (size == maxSize / 2) {
            array = Arrays.copyOf(array, maxSize / 2);
            maxSize /= 2;
        }
    }

    public int get(int index) {
//        checkIfIsEmpty();
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        return array[index];
    }

    public int getSize() {
        return size;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int[] copyArray(int[] arr, int maxSize) {
//        checkIfIsEmpty();
        int[] temp = new int[maxSize];
        if (size >= 0) {
            System.arraycopy(arr, 0, temp, 0, size);
        }
        return temp;
    }

    public void checkIfIsEmpty() {
        if (size == 0) {
            System.out.println("Array është bosh");
        }
    }

    public void sort() {
        checkIfIsEmpty();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void displayEach() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print("[" + array[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
            if (i == size - 1) {
                System.out.print("]");
            }
        }
    }

}
