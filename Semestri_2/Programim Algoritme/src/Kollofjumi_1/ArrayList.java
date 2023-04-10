package Kollofjumi_1;

public class ArrayList {

    int[] array;
    int size;
    int maxSize;

    public ArrayList() {
        maxSize = 8;
        size = 0;
        array = new int[maxSize];
    }


//    add       O(1);
//    delete    O()
//    find      O(n);
//    me rrit vargut kur mushet full
//    me zvogleu vargun kur osht per gjysh (1/2)

    public static void main(String[] args) {
        ArrayList v = new ArrayList();
        v.add(4);
    }

    public void add(int value) {

        if (size < maxSize) {
            array[size] = value;
            size++;
        }
    }

    public int find(int value) {
        for (int i = 0; i < maxSize; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public void delete(int value){
//
    }



}
