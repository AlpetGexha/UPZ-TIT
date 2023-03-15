package Java_4_ArrayList;


public class ArrayList2 {

    final int DEFAULT_SIZE = 8;
    int[] array;
    int size, maxSize;


    public ArrayList2() {
        maxSize = DEFAULT_SIZE;
        size = 0;
        array = new int[maxSize];
    }

    public static void main(String[] args) {
        ArrayList2 arr = new ArrayList2();
        System.out.println("Fillimi");
        System.out.print("Size: ");
        arr.size();

        System.out.print("MAX Size: ");
        arr.maxSize();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);

        System.out.println("Shtimi: ");
        System.out.println("Size: " + arr.size);
        System.out.println("MAX Size: " + arr.maxSize);

        arr.remove(1);
        arr.remove(2);
        arr.remove(3);
        arr.remove(4);
        arr.remove(5);
        arr.remove(6);
        arr.remove(7);
        arr.remove(8);

        System.out.println("Remove: ");
        System.out.println("Size: " + arr.size);
        System.out.println("MAX Size: " + arr.maxSize);

        arr.add(42, 1);
        arr.display();

        System.out.println("Remove All:");
        arr.removeAll();
        System.out.println("Size: " + arr.size);
        System.out.println("MAX Size: " + arr.maxSize);

    }

    public void add(int value) {
        inereaseSize();
        if (size < maxSize) {
            array[size] = value;
            size++;
        }
    }

    public void add(int value, int onIndex) {
        inereaseSize();
        if (size < maxSize) {
            for (int i = size; i > onIndex; i--) {
                array[i] = array[i - 1];
            }
            array[onIndex] = value;
            size++;
        }
    }

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

    public void removeAll() {
        size = 0;
        maxSize = DEFAULT_SIZE;
        array = new int[maxSize];
    }

    public void unset(int value) {
        remove(value);
    }

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

    private void inereaseSize() {
        if (size >= maxSize) {
//          if (size >= 0) {
            int[] temp = copyArray(array, maxSize * 2);
            array = temp;
        }
    }

    private void decreaseSize() {
        if (size == maxSize / 2) {
            int[] temp = new int[maxSize / 2];
            if (size >= 0) System.arraycopy(array, 0, temp, 0, size);
            array = temp;
            maxSize /= 2;

        }
    }

    public void size() {
        System.out.println(size);
    }

    public void maxSize() {
        System.out.println(maxSize);
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
